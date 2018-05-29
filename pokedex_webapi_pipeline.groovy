pipelineJob('pokedex_webapi') {
    definition {
        cps {
            script(readFileFromWorkspace('pokedex_webapi_build.groovy'))
			script(readFileFromWorkspace('pokedex_webapi_test.groovy'))
            sandbox()
        }
    }
}