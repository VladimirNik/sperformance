libraryDependencies ++= List(
  "jfree" % "jfreechart" % "1.0.12",
  "commons-io" % "commons-io" % "2.0"
)

organization := "com.jsuereth"

name := "sperformance"

version := "0.2"

scalaVersion := "2.10.2"

autoCompilerPlugins := true

libraryDependencies in ThisBuild += compilerPlugin("org.scala-lang.plugins" %% "printplugin" % "0.2.0")

scalacOptions in ThisBuild += "-P:printplugin:oversrc"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
