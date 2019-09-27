# Random Quote App

## Contributors:
* Sarah Fisher
* Sharina Stubbs

## About
This app allows the user to generate random quotes and their associated author from a provided json file. It uses the following:
* gson
* Json
* FileReader
* Scanner
* Java

The app was then refactored to pull jokes from an API, display that output first, and, in case the API was unreachable, display a quote from the stored database.

I am currently working on storing the joke pulled from the API in the stored database so they can be accessed if needed.

*Side note: What promised to be an API of geeky jokes seems to be entirely composed of Chuck Norris jokes. Disappointing but entertaining enough for today.

## How to run this application
1. Clone repository
2. Add the following to build.gradle if it is not included in the clone: 
```// use to parse json implementation 'com.google.code.gson:gson:2.8.5'```
3. Run the app
