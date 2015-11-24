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
package com.github.stkent.amplify.tracking;

import com.github.stkent.amplify.helpers.BaseTest;
import com.github.stkent.amplify.tracking.interfaces.IEvent;

import org.junit.Assert;
import org.junit.Test;

public class IntegratedEventTest extends BaseTest {

    @Test
    public void testThatAppCrashedEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.APP_CRASHED;

        // Assert
        Assert.assertEquals(
                "App crashed event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "APP_CRASHED");
    }

    @Test
    public void testThatAppInstalledEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.APP_INSTALLED;

        // Assert
        Assert.assertEquals(
                "App installed event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "APP_INSTALLED");
    }

    @Test
    public void testThatAppUpdatedEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.APP_UPDATED;

        // Assert
        Assert.assertEquals(
                "App updated event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "APP_UPDATED");
    }

    @Test
    public void testThatUserDeclinedCriticalFeedbackEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.USER_DECLINED_CRITICAL_FEEDBACK;

        // Assert
        Assert.assertEquals(
                "User declined critical feedback event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "USER_DECLINED_CRITICAL_FEEDBACK");
    }

    @Test
    public void testThatUserDeclinedPositiveFeedbackEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.USER_DECLINED_POSITIVE_FEEDBACK;

        // Assert
        Assert.assertEquals(
                "User declined positive feedback event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "USER_DECLINED_POSITIVE_FEEDBACK");
    }

    @Test
    public void testThatUserGaveCriticalFeedbackEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.USER_GAVE_CRITICAL_FEEDBACK;

        // Assert
        Assert.assertEquals(
                "User gave critical feedback event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "USER_GAVE_CRITICAL_FEEDBACK");
    }

    @Test
    public void testThatUserGavePositiveFeedbackEventHasCorrectTrackingKey() {
        // Arrange
        final IEvent appCrashedEvent = IntegratedEvent.USER_GAVE_POSITIVE_FEEDBACK;

        // Assert
        Assert.assertEquals(
                "User gave positive feedback event should have correct tracking key",
                appCrashedEvent.getTrackingKey(),
                "USER_GAVE_POSITIVE_FEEDBACK");
    }

}