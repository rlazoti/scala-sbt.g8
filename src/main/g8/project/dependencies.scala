import sbt._

object Dependencies {

  val scalatest = "org.scalatest" %% "scalatest" % "$scalatest_version$"
  val junit = "junit" % "junit" % "$junit_version$"

  val appDependencies = Seq(
    scalatest % "test",
    junit % "test"
  )

}