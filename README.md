# Hello world test test not using parent pom

## About

Made to test when doing a release using maven 3.5.4

## Release sets from the CI server
Step 1
`-V clean release:clean release:prepare ${bamboo.releaseplan_args}  -B`
Step 2
`-V release:perform -B`