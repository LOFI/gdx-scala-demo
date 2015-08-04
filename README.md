# gdx-scala-demo
Simple initial setup for a gdx project which uses gradle and scala.

This project uses Scala only for the `:core` project only because that's less drift from the default setup.

## Setup
Create a 'local.properties' which sets 'sdk.dir' to the path of your Android sdk.

Example: `sdk.dir=/opt/android/sdk`

## Desktop
Things should just work.

## Android and iOS
Things should just work. If not, let's learn why and update this repo! :)

In order to successfully build and run this app on the iOS Simulator I needed to increase the
heap size used by gradle. Currently this is set to `2048` but as your app increases in size and
scope you may have to increase this yet again. Pretty typical stuff for JVM development.
