scalaVersion := "3.8.4"

lazy val root = rootProject
  .settings(
    name := "PPS-25-scala-project",
    mainClass := Some("it.unibo.pps.main"),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.20" % Test,
    )
  )
