name := "cortage"


version := "1.0"

scalaVersion := "2.12.3"



libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"


// POM settings for Sonatype
homepage := Some(url("https://github.com/username/projectname"))

scmInfo := Some(ScmInfo(url("https://github.com/username/projectname"),  "git@github.com:username/projectname.git"))
developers += Developer("username",
  "User Name",
  "mail@username.de",
  url("https://github.com/username"))

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

pomIncludeRepository := (_ => false)