import com.typesafe.sbt.packager.archetypes.TemplateWriter

name := "mukis-application-conf"
version := "1.0"

libraryDependencies ++= Seq(
    "com.typesafe" % "config" % "1.2.0"
)

enablePlugins(JavaServerAppPackaging, UpstartPlugin)

mainClass in Compile := Some("de.mukis.TestApp")

maintainer in Linux := "Nepomuk Seiler <nepomuk.seiler@mukis.de>"
packageSummary in Linux := "Custom application configuration"
packageDescription := "Custom application configuration"

