/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.rt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import libcore.icu.TimeZones;

/**
 * 
 */
public class ICUTest {

    public static void main(String[] args) {
        String[][] zoneStrings = TimeZones.getZoneStrings(new Locale("sv"));
        for (String[] s : zoneStrings) {
            System.out.println(Arrays.asList(s));
        }
//        System.out.println(Locale.getDefault());
//        System.out.println(new Date());
        //System.out.println(Arrays.asList(Locale.getAvailableLocales()));
//        List<String> l = Arrays.asList(TimeZone.getAvailableIDs(60 * 60 * 1000));
//        Collections.sort(l);
//        for (String s : l) {
//            System.out.println(s);
//        } 
    }
    
}
