node {
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
	}    
}