import sbt._

object Dependencies {

  private val scalaTestVersion = "3.2.16"

  lazy val testingLibraries = List(
    "org.scalatest" %% "scalatest" % scalaTestVersion
  ).map(_ % Test)

}