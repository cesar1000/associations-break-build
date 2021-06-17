plugins {
    kotlin("jvm")
    `kotlin-dsl`
}

repositories {
	jcenter()
}

the<JavaPluginExtension>().registerFeature("common") {
    usingSourceSet(the<SourceSetContainer>().create("common"))
}

kotlin {
    target {
        compilations.getByName(SourceSet.MAIN_SOURCE_SET_NAME) {
            associateWith(compilations["common"])
        }
    }
}
