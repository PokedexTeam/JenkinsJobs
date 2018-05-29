String basePath = 'Pokedex'
String repo = 'jenkins-training/tech-example-java'

folder(basePath) {
    description 'Main Folder for pipeline'
}

pipelineJob("$basePath/Webapi") {
    definition {
        cps {
                script(readFileFromWorkspace('/pipelines/webapi_pipeline_build.groovy'))
                sandbox()
        }
    }
}