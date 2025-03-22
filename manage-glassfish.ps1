param (
    [string]$action,
    [string]$warPath
)

function Stop-GlassFish {
    Write-Output "Stopping GlassFish Server..."
    & "glassfish-4.1.1\glassfish4\bin\asadmin.bat" stop-domain
    Write-Output "GlassFish Server stopped."
}

function Redeploy-Application {
    Write-Output "Undeploying application..."
    & "glassfish-4.1.1\glassfish4\bin\asadmin.bat" undeploy cart-web-1.0
    Write-Output "Deploying application..."
    & "glassfish-4.1.1\glassfish4\bin\asadmin.bat" deploy $warPath
}

function Start-GlassFish {
    Write-Output "Starting GlassFish Server..."
    & "glassfish-4.1.1\glassfish4\bin\asadmin.bat" start-domain
    if ($LASTEXITCODE -ne 0) {
        Write-Output "Failed to start GlassFish Server"
        exit $LASTEXITCODE
    }

    Write-Output "Building project with Maven..."
    Push-Location ./cart
    & mvn clean package
    if ($LASTEXITCODE -ne 0) {
        Write-Output "Maven build failed"
        exit $LASTEXITCODE
    }
    Pop-Location

    Write-Output "Deploying application..."
    & "glassfish-4.1.1\glassfish4\bin\asadmin.bat" deploy $warPath
    if ($LASTEXITCODE -ne 0) {
        Write-Output "Deployment failed"
        Redeploy-Application
        exit $LASTEXITCODE
    }

    Write-Output "Successfully started server and deployed application."
}

switch ($action) {
    "stop" { Stop-GlassFish }
    "redeploy" { Redeploy-Application }
    "start" { Start-GlassFish }
    default { Write-Output "Invalid action. Use 'stop', 'redeploy', or 'start'." }
}
