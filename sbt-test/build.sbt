name := "sbt-test"

version := "0.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature","-language:implicitConversions")

libraryDependencies  ++= Seq(
            "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
            "org.scalatest" %% "scalatest" % "3.0.1" % "test",
            "org.scalanlp" %% "breeze" % "0.13",
            "org.scalanlp" %% "breeze-natives" % "0.13",
            "org.scalanlp" %% "breeze-viz" % "0.13",
            "org.typelevel" %% "cats" % "0.9.0"
)

resolvers ++= Seq(
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
            "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)


addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

// EclipseKeys.withBundledScalaContainers := false

scalaVersion := "2.12.10"

