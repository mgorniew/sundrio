/*
 * Copyright 2015 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.examples.shapes;

import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;
import io.sundr.transform.annotations.VelocityTransformation;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Buildable(lazyMapInitEnabled = false, inline = {
        @Inline(type = Createable.class, value = "create", prefix = "Createable"),
        @Inline(type = Updateable.class, value = "update", prefix = "Updateable"),
})
@VelocityTransformation("transformation.vm") //This is just used to demonstrate how we can use velocity transformations.
public class Canvas {

    private final List<Shape> shapes;
    private final Artist artist;
    private final Date date;
    private final Map<String, String> notes;

    public Canvas(List<Shape> shapes, Artist artist, Date date, Map<String, String> notes) {
        this.shapes = Collections.unmodifiableList(shapes);
        this.artist = artist;
        this.date = date;
        this.notes = notes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public Artist getArtist() {
        return artist;
    }

    public Date getDate() {
        return date;
    }

    public Map<String, String> getNotes() {
        return notes;
    }
}
