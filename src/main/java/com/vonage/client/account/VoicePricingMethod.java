/*
 *   Copyright 2020 Vonage
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.vonage.client.account;

import com.vonage.client.HttpWrapper;

class VoicePricingMethod extends PricingMethod {
    private static final String PATH = "/account/get-pricing/outbound/voice";

    VoicePricingMethod(HttpWrapper httpWrapper) {
        super(httpWrapper);
    }

    @Override
    String getUri() {
        return httpWrapper.getHttpConfig().getRestBaseUri() + PATH;
    }
}
