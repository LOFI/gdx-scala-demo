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

### Android

I've currently left Proguard in a very "wide open" state (doesn't remove any part of libGDX). This
is cray cray and you'll want to tone things down a notch. An example proguard (thanks @Tom-Ski):

```
-keep class com.badlogic.gdx.math.** { *; }

-keep class com.badlogic.gdx.physics.bullet.collision.CollisionJNI { *; }
-keep class com.badlogic.gdx.physics.bullet.dynamics.DynamicsJNI { *; }
-keep class com.badlogic.gdx.physics.bullet.extras.ExtrasJNI { *; }
-keep class com.badlogic.gdx.physics.bullet.linearmath.LinearMathJNI { *; }
-keep class com.badlogic.gdx.physics.bullet.softbody.SoftbodyJNI { *; }

-keep class com.badlogic.gdx.physics.bullet.collision.btBroadphaseAabbCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btBroadphaseRayCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btConvexTriangleCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btGhostPairCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btInternalTriangleIndexCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btNodeOverlapCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btOverlapCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btOverlapFilterCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btOverlappingPairCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btTriangleCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btTriangleConvexcastCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.ContactCache { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.ContactListener { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.LocalRayResult { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.LocalShapeInfo { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.RayResultCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.AllHitsRayResultCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.ConvexResultCallback { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.LocalConvexResult { *; }
-keep class com.badlogic.gdx.physics.bullet.collision.ContactResultCallback { *; }

-keep class com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback { *; }

-keep class com.badlogic.gdx.physics.bullet.extras.btBulletWorldImporter { *; }

-keep class com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw { *; }
-keep class com.badlogic.gdx.physics.bullet.linearmath.btMotionState { *; }
```
