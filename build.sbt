import Dependencies._
import ScalaOptionsUtil._

scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    version := "1.0",
    name := "MagicNumbersProject",
    scalacOptions ++= Seq("-encoding", "UTF-8"),
    libraryDependencies ++= Dependencies.testingLibraries,
    mainClass := Some("magicnumbers.App")
  )