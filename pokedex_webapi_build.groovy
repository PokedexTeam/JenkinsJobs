job('pokedex_webapi_build') {
    logRotator(-1, 10)
    scm	{
		github('PokedexTeam/PokedexWebapi','master')
    }
    triggers {
        githubPush()
    }
    steps {
		batchFile('dotnet build')
    }
    publishers {
			mailer('marca.manu2@gmail.com', true, true)
    }
}