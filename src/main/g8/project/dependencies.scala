import sbt._

object Dependencies {

  val scalaTest = "org.scalatest" %% "scalatest" % "$scalatest_version$"

  val appDependencies = Seq(
    scalatest % "test"
  )

}