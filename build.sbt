
organization := "com.modelfabric"

name := "scala-utils"
 
version := "0.1-SNAPSHOT"
 
scalaVersion := "2.11.8"
 
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.4"

libraryDependencies += "com.typesafe.akka" %% "akka-cluster" % "2.4.4"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.4"

libraryDependencies += "io.spray" %% "spray-can" % "1.3.3"

//
// ScalaStyle Settings
//
//org.scalastyle.sbt.ScalastylePlugin.Settings

//org.scalastyle.sbt.PluginKeys.config <<= baseDirectory { _ / "conf" / "scalastyle-config.xml" }





