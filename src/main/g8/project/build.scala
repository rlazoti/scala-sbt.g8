import sbt._
import sbt.Keys._
import Dependencies._

object AppBuilder extends Build {
  
  val appSettings = Seq(
    name := "$name$",
    organization := "$organization$",
    version := "$version$",
    scalaVersion := "$scalaVersion$"
  )

  lazy val meuvale = Project("$name$", file("."))
    .settings(appSettings : _*)
    .settings(libraryDependencies ++= appDependencies)

}