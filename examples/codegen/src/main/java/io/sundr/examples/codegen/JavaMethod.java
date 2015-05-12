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

package io.sundr.examples.codegen;

import io.sundr.builder.annotations.Buildable;
import io.sundr.codegen.Method;

import javax.lang.model.element.Modifier;
import java.util.Map;
import java.util.Set;

public class JavaMethod extends AttributeSupport implements Method<JavaType, JavaProperty> {

    private final Set<Modifier> modifiers;
    private final Set<JavaType> typeParameters;
    private final String name;
    private final JavaType returnType;
    private final JavaProperty[] arguments;
    private final Set<JavaType> exceptions;

    @Buildable
    public JavaMethod(Set<Modifier> modifiers, Set<JavaType> typeParameters, String name, JavaType returnType, JavaProperty[] arguments, Set<JavaType> exceptions, Map<String, Object> attributes) {
        super(attributes);
        this.modifiers = modifiers;
        this.typeParameters = typeParameters;
        this.name = name;
        this.returnType = returnType;
        this.arguments = arguments;
        this.exceptions = exceptions;
    }

    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    public Set<JavaType> getTypeParameters() {
        return typeParameters;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public JavaType getReturnType() {
        return returnType;
    }

    public JavaProperty[] getArguments() {
        return arguments;
    }

    @Override
    public Set<JavaType> getExceptions() {
        return exceptions;
    }
}
