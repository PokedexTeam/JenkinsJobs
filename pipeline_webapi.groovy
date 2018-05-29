node {
    stage("Build")
	{	
		dotnet build
	}    
	stage("Test")
	{	
		dotnet test
	}    
	stage("Build Image")
	{	
	}    
}