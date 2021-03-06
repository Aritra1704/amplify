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
package com.github.stkent.amplify.tracking.managers;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.github.stkent.amplify.tracking.interfaces.ISettings;
import com.github.stkent.amplify.utils.appinfo.IAppInfoProvider;

public final class LastEventVersionNameRulesManager extends BaseEventsManager<String> {

    @NonNull
    private final IAppInfoProvider appInfoProvider;

    public LastEventVersionNameRulesManager(
            @NonNull final ISettings<String> settings,
            @NonNull final IAppInfoProvider appInfoProvider) {

        super(settings);
        this.appInfoProvider = appInfoProvider;
    }

    @NonNull
    @Override
    protected String getTrackedEventDimensionDescription() {
        return "Last version name";
    }

    @NonNull
    @Override
    protected String getEventTrackingStatusStringSuffix(@NonNull final String cachedEventValue) {
        return "last occurred for app version name " + cachedEventValue;
    }

    @NonNull
    @Override
    public String getUpdatedTrackingValue(@Nullable final String cachedTrackingValue) {
        return appInfoProvider.getPackageInfo().versionName;
    }

}
