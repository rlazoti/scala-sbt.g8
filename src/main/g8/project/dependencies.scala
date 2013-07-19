import sbt._

object Dependencies {

  val scalaTest = "org.scalatest" %% "scalatest" % "$scalatest-version$"

  val appDependencies = Seq(
    scalatest % "test"
  )

}