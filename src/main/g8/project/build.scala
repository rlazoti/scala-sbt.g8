import sbt._
import sbt.Keys._
import Dependencies._

object AppBuilder extends Build {
  
  val appSettings = Seq(
    name := "$name$",
    organization := "$organization$",
    version := "$version$",
    scalaVersion := "$scala_version$",
    scalacOptions := Seq("-deprecation", "-feature", "-unchecked", "-language:postfixOps"),

    unmanagedSourceDirectories in Compile <<= (scalaSource in Compile)(Seq(_)),
    unmanagedSourceDirectories in Test    <<= (scalaSource in Test)(Seq(_))
  )

  lazy val app = Project("$name$", file("."))
    .settings(appSettings : _*)
    .settings(libraryDependencies ++= appDependencies)

}
