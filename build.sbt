scalaVersion := "3.8.4"

lazy val root = rootProject
  .settings(
    name := "PPS-25-scala-project",
    libraryDependencies ++= Seq(
      //You can add library dependencies here, for example,
      "org.scalatest" %% "scalatest" % "3.2.20" % Test,
      //"org.scalameta" %% "munit" % "1.2.3" % Test
    )
  )
