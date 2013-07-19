import sbt._

object Dependencies {

  val scalatest = "org.scalatest" %% "scalatest" % "$scalatest_version$"
  val junit = "junit" % "junit" % "4.11"

  val appDependencies = Seq(
    scalatest % "test",
    junit % "test"
  )

}