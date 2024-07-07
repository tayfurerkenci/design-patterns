plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "hf-design-patterns"

include("01-strategy")
include("02-observer")
include("03-decorator")
include("04-factory")
include("05-singleton")
include("06-command")
