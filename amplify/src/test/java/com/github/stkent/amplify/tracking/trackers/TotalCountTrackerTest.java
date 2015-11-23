/**
 * Copyright 2015 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.amplify.tracking.trackers;

import android.annotation.SuppressLint;

import com.github.stkent.amplify.helpers.BaseTest;
import com.github.stkent.amplify.helpers.FakeSettings;
import com.github.stkent.amplify.helpers.StubLogger;
import com.github.stkent.amplify.tracking.interfaces.IApplicationInfoProvider;
import com.github.stkent.amplify.tracking.interfaces.IEvent;
import com.github.stkent.amplify.tracking.interfaces.IEventCheck;

import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class TotalCountTrackerTest extends BaseTest {

    @Mock
    private IApplicationInfoProvider mockApplicationInfoProvider;
    @Mock
    private IEvent mockEvent;
    @Mock
    private IEventCheck<Integer> mockEventCheck;

    @SuppressLint("Assert")
    @Test
    public void testThatCorrectNumberOfEventsIsRecorded() {
        // Arrange
        final FakeSettings<Integer> fakeSettings = new FakeSettings<>();

        final TotalCountTracker totalCountTracker = new TotalCountTracker(
                new StubLogger(),
                fakeSettings,
                mockApplicationInfoProvider);

        totalCountTracker.trackEvent(mockEvent, mockEventCheck);

        final Integer expectedEventCount = 7;
        assert expectedEventCount > 0;

        // Act
        for (int i = 0; i < expectedEventCount; i++) {
            totalCountTracker.notifyEventTriggered(mockEvent);
        }

        // Assert
        final Integer actualEventCount = fakeSettings.getEventValue(mockEvent, mockEventCheck);

        assertEquals(
                "The correct number of events should have been recorded",
                expectedEventCount,
                actualEventCount);
    }

}