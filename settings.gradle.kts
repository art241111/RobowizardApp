pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

}
rootProject.name = "RobowizardApp"


include(":android")
include(":desktop")
include(":common:ui")
include(":common:data")
include(":common:KRobot")
include(":common:KRobot:KAS")
include(":common:KRobot:tcpClient")
include(":backend")
include(":frontend")
