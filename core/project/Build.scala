import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "core"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )

  lazy val subproject = play.Project("subproject", "1.0-SNAPSHOT", path = file("subproject")).settings(
    playAssetsDirectories <+= baseDirectory / "common-public"
  )

  lazy val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  ) dependsOn(subproject) aggregate (subproject)

}
