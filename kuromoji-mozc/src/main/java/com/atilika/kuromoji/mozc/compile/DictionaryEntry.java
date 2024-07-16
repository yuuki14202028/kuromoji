/**
 * Copyright © 2010-2018 Atilika Inc. and contributors (see CONTRIBUTORS.md)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  A copy of the
 * License is distributed with this work in the LICENSE.md file.  You may
 * also obtain a copy of the License from
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atilika.kuromoji.mozc.compile;

import com.atilika.kuromoji.dict.DictionaryEntryBase;

import static com.atilika.kuromoji.dict.DictionaryField.LEFT_ID;
import static com.atilika.kuromoji.dict.DictionaryField.RIGHT_ID;
import static com.atilika.kuromoji.dict.DictionaryField.SURFACE;
import static com.atilika.kuromoji.dict.DictionaryField.WORD_COST;

public class DictionaryEntry extends DictionaryEntryBase {
    public static final int READING = 4;

    public static final int TOTAL_FEATURES = 1;
    public static final int READING_FEATURE = 1;
    public static final int PART_OF_SPEECH_FEATURE = 0;

    private final String reading;

    public DictionaryEntry(String[] fields) {
        super(fields[SURFACE],
            Short.parseShort(fields[LEFT_ID]),
            Short.parseShort(fields[RIGHT_ID]),
            Short.parseShort(fields[WORD_COST])
        );
        reading = fields[READING];
    }

    public String getReading() {
        return reading;
    }
}
