node {
	stage("Clone")
	{
		git credentialsId: 'Saetabis1', url: 'https://github.com/PokedexTeam/PokedexWebapi.git'
	}
    stage("Build")
	{	
		sh 'dotnet build'
	}    
	stage("Test")
	{	
		sh 'dotnet test'
	}    
	stage("Build Image")
	{	
		sh 'docker build -t PokedexTeam/PokedexWebapi .'
	}    
}