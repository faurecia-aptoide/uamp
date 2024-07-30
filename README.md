Universal Android Music Player Sample
=====================================
The goal of this sample is to show how to implement an audio media app that works
across multiple form factors and provides a consistent user experience
on Android phones, tablets, Android Auto, Android Wear, Android TV, Google Cast devices,
and with the Google Assistant. 


Pre-requisites
--------------

- Android Studio 3.x
or
- CMD

Changing the package name
---------------

In order to change the package, for testing purposes, you need to change the ApplicationId of the desired platform.
- For mobile: [build.gradle](/app/build.gradle)
- For automotive: [build.gradle](/automotive/build.gradle)

After locating the desired build.gradle, find the ```defaultConfig``` and change the ```applicationId``` for the desired package.
![Change here](docs/images/change.png "Change here")
After this, you need to sync. If you are making changes in AndroidStudio, there will be a blue banner asking you to sync. Like this:
![sync now](docs/images/sync.png "Sync now")
Press "sync now" and wait until it completes.
If you are making changes in another IDE or Text editor, open a terminal, ```cd``` into the project folder and run the command ```gradle sync```.


Building an APK
---------------

The easiest way of building an APK is as follows:

- Open a terminal and ```cd``` into the project folder
- Depending on the type of APK that you want:
  - For debug, run the command: 
    - mobile -> ```gradle app:assembleDebug``` 
    - automotive -> ```gradle automotive:assembleDebug```
  - For release, run the command: 
    - mobile -> ```gradle automotive:assembleRelease``` 
    - automotive -> ```gradle automotive:assembleRelease```

Wait for the command to complete.

Once it's done, you can find the APKs inside this folders:
- [Mobile, debug](/app/build/outputs/apk/debug)
- [Mobile, release](/app/build/outputs/apk/release)
- [Automotive, debug](/automotive/build/outputs/apk/debug)
- [Automotive, release](/automotive/build/outputs/apk/debug)

License
-------

Copyright 2017 Google Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
