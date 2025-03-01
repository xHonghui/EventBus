/*
 * Copyright (C) 2012-2016 Markus Junginger, greenrobot (http://greenrobot.org)
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
package org.greenrobot.eventbus;

/**
 * Interface to the "main" thread, which can be whatever you like. Typically on Android, Android's main thread is used.
 * “主”线程的接口，可以是您喜欢的任何线程。通常在Android上，使用Android的主线程。
 */
public interface MainThreadSupport {

    boolean isMainThread();

    Poster createPoster(EventBus eventBus);
}
