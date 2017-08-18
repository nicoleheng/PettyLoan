/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yixun.pettyloan.entity;

import android.support.annotation.NonNull;

/**
 * Created by zongkaili on 17-8-11.
 */

public class FeatureOne {

    public
    @NonNull
    String titleOne;
    public
    @NonNull
    int imgOne;
    public
    @NonNull
    String titleTwo;
    public
    @NonNull
    int imgTwo;


    public FeatureOne(@NonNull final String titleOne,
                      @NonNull final int imgOne,
                      @NonNull final String titleTwo,
                      @NonNull final int imgTwo) {
        this.titleOne = titleOne;
        this.titleTwo = titleTwo;
        this.imgOne = imgOne;
        this.imgTwo = imgTwo;
    }
}
