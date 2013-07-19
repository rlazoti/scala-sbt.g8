import sbt._

object Dependencies {

  val scalatest = "org.scalatest" %% "scalatest" % "$scalatest_version$"

  val appDependencies = Seq(
    scalatest % "test"
  )

}