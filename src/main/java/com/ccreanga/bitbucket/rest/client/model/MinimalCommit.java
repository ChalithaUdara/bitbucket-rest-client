/*
 *
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ccreanga.bitbucket.rest.client.model;

import java.io.Serializable;
import java.util.Objects;

public class MinimalCommit implements Serializable {
    private String id;
    private String displayId;

    private MinimalCommit() {
    }

    public MinimalCommit(String id, String displayId) {
        this.id = id;
        this.displayId = displayId;
    }

    public String getId() {
        return id;
    }

    public String getDisplayId() {
        return displayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinimalCommit that = (MinimalCommit) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(displayId, that.displayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayId);
    }

    @Override
    public String toString() {
        return "MinimalCommit{" +
                "id='" + id + '\'' +
                ", displayId='" + displayId + '\'' +
                '}';
    }
}
