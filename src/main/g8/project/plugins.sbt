resolvers += "twitter-repo" at "http://maven.twttr.com"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "$sbteclipse_version$")

addSbtPlugin("com.twitter" % "sbt-package-dist" % "$sbtpackagedist_version$")