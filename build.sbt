name := "cortado"


version := "1.0AB.SNAPSHOT"

organization := "com.mikafecito"

scalaVersion := "2.12.3"



libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"


// POM settings for Sonatype
homepage := Some(url("https://github.com/cafecito/cortado"))

scmInfo := Some(ScmInfo(url("https://github.com/cafecito/cortado"),  "git@github.com:cafecito/cortado.git"))
developers += Developer("hernansaab",
  "Hernan Saab",
  "hernan_javier_saab@yahoo.com",
  url("https://github.com/hernansaab"))

licenses += ("MIT", url("https://github.com/cafecito/cortado/blob/master/LICENSE"))

pomIncludeRepository := (_ => false)

publishArtifact in Test := false

publishMavenStyle := true


publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}


//addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")


//pgpSecretRing := file("/c/Users/the big one/.sbt/gpg/secring.asc")