addSbtPlugin("com.typesafe.rp" % "sbt-typesafe-rp" % "00v01p01")

val typesafeUrl = "https://private-repo.typesafe.com/typesafe/for-subscribers-only/D4BD927C7A9260978D38295D00947C87A210A3DB/"

resolvers += "typesafe-rp-mvn" at typesafeUrl

resolvers += Resolver.url("typesafe-rp-ivy", url(typesafeUrl))(Resolver.ivyStylePatterns)

resolvers += Resolver.typesafeRepo("releases")
