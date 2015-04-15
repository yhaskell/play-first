name := """first"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

val sorm = "org.sorm-framework" % "sorm" % "0.3.18"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  sorm
)


