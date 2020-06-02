package org.ligi.snackengage;

public class Dependencies {

    public static class Android {

        public static final String APPLICATION_ID = "org.ligi.snackengage";
        public static final String BUILD_TOOLS_VERSION = "29.0.3";
        public static final int MIN_SDK_VERSION = 14;
        public static final int COMPILE_SDK_VERSION = 28;
        public static final int TARGET_SDK_VERSION = 28;
        public static final int VERSION_CODE = 24;
        public static final String VERSION_NAME = "0.24";

    }

    public static class GradlePlugins {

        public static final String ANDROID = "com.android.tools.build:gradle:3.6.3";
        public static final String MAVEN = "com.github.dcendents:android-maven-gradle-plugin:2.1";
        public static final String VERSIONS = "com.github.ben-manes:gradle-versions-plugin:0.28.0";

    }

    public static class Libs {

        public static final String ANNOTATION = "androidx.annotation:annotation:1.1.0";
        public static final String APPCOMPAT = "androidx.appcompat:appcompat:1.1.0";
        public static final String ASSERTJ_ANDROID = "com.squareup.assertj:assertj-android:1.2.0";
        public static final String JUNIT = "junit:junit:4.13";
        public static final String MATERIAL = "com.google.android.material:material:1.1.0";
        public static final String MOCKITO = "org.mockito:mockito-core:3.3.0";

    }

}