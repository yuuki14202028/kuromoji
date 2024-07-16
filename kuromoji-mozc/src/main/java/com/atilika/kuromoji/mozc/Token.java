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
package com.atilika.kuromoji.mozc;

import com.atilika.kuromoji.TokenBase;
import com.atilika.kuromoji.dict.Dictionary;
import com.atilika.kuromoji.mozc.compile.DictionaryEntry;
import com.atilika.kuromoji.viterbi.ViterbiNode;

/**
 * IPADIC token produced by the IPADIC tokenizer with various morphological features
 */
public class Token extends TokenBase {

    public Token(int wordId,
                 String surface,
                 ViterbiNode.Type type,
                 int position,
                 Dictionary dictionary) {
        super(wordId, surface, type, position, dictionary);
    }

    /**
     * Gets the reading for this token (読み) in katakana script
     *
     * @return reading, not null
     */
    public String getReading() {
        return getFeature(DictionaryEntry.READING);
    }

}
