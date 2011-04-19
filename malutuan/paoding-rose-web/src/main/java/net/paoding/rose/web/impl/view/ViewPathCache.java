/*
 * Copyright 2007-2009 the original author or authors.
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
package net.paoding.rose.web.impl.view;

import net.paoding.rose.RoseConstants;

import java.util.HashMap;

/**
 * @author 王志亮 [qieqie.wang@gmail.com]
 */
public class ViewPathCache {

    private String directoryPath;

    private HashMap<String, String> viewPathMap = new HashMap<String, String>();

    public ViewPathCache(String modulePath) {
        directoryPath = RoseConstants.VIEWS_PATH + modulePath;
    }

    public String getViewPath(String viewName) {
        return viewPathMap.get(viewName);
    }

    public void setViewPath(String viewName, String viewPath) {
        viewPathMap.put(viewName, viewPath);
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

}
