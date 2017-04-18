name := """play-scala-compile-di-with-tests"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"

libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
