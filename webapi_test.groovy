job('pokedex_webapi_test') {
    logRotator(-1, 10)
    scm	{
		github('PokedexTeam/PokedexWebapi','master')
    }
    triggers {
        githubPush()
    }
    steps {
		batchFile('dotnet test')
    }
    publishers {
			mailer('marca.manu2@gmail.com', true, true)
    }
}