resolvers += Resolver.url("Typesafe repository", url("http://typesafe.artifactoryonline.com/typesafe/ivy-releases/"))(Resolver.defaultIvyPatterns)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "$sbteclipseVersion$")