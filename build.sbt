name := "cortado"


version := "1.0AB"

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


publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)


//addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")


pgpSecretRing := file("c:/Users/the big one/.sbt/gpg/secring.asc")