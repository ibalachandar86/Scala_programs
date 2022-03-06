import sbt._
import sbt.Keys._
import Dependencies._
import ScalacOptions._
import sbtassembly.AssemblyPlugin.autoImport._

object Settings {

  // Set Common Settings
  lazy val commonSettings = Seq(
    organization := "Development",
    version := "1.0",
    scalaVersion := "2.12.14"
  )

  // Set advanced modules settings
  lazy val advancedSettings: Seq[sbt.Def.Setting[_]] = commonSettings ++ Assembly.settings ++ Seq(
    libraryDependencies ++= advancedDependencies,
    scalacOptions ++= commonScalacOptions,
    assembly / assemblyJarName := "advanced.jar"
  )

  // Set advanced modules settings
  lazy val guiSettings: Seq[sbt.Def.Setting[_]] = commonSettings ++ Assembly.settings ++ Seq(
    libraryDependencies ++= guiDependencies,
    scalacOptions ++= commonScalacOptions,
    assembly / assemblyJarName := "gui.jar"
  )

  // Set Assembly settings
  object Assembly {
    lazy val settings: Seq[sbt.Def.Setting[_]] = Seq(
      assembly / assemblyMergeStrategy := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case _                             => MergeStrategy.first
    }
    )
    lazy val withFullApplication: Seq[sbt.Def.Setting[_]] = Seq(
      assembly / assemblyOption := (assembly / assemblyOption).value.copy(includeScala = true, includeDependency = true)
    )
  }

}
