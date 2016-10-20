name := "parrot"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "aliyun" at "http://maven.aliyun.com/nexus/content/groups/public/"

test in assembly := {}

mainClass in assembly := Some("src.main.scala.parrot.lsh.LSH.Main")

libraryDependencies +="org.apache.derby" % "derby" % "10.4.1.3"

