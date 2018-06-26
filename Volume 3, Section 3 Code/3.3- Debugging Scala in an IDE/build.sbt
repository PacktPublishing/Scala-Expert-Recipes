name := "Animals"

organization := "farm"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.3"

resolvers += "Sonatype Releases Repository" at "https://oss.sonatype.org/content/repositories/Releases"

libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.2"

libraryDependencies += "org.specs2" %% "specs2-mock" % "4.0.2"

libraryDependencies += "org.specs2" %% "specs2-scalacheck" % "4.0.2"