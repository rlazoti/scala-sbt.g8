import sbt._
import sbt.Keys._
import Dependencies._
import com.twitter.sbt._

object AppBuilder extends Build {
  
  val appSettings = Seq(
    name := "$name$",
    organization := "$organization$",
    version := "$version$",
    scalaVersion := "$scala_version$"
  )

  lazy val app = Project("$name$", file("."))
    .settings(appSettings : _*)
    .settings(GitProject.gitSettings : _*)
    .settings(BuildProperties.newSettings : _*)
    .settings(PackageDist.newSettings : _*)
    .settings(ReleaseManagement.newSettings : _*)
    .settings(VersionManagement.newSettings : _*)
    .settings(libraryDependencies ++= appDependencies)

}