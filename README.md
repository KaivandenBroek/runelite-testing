This project is copied from the original creators to learn more about testing (CI/CD - mocking - sonarcube - unit testing)

![](https://runelite.net/img/logo.png)

RuneLite is a free, open source OldSchool RuneScape client.

If you have any questions, please join our IRC channel on [irc.rizon.net #runelite](http://qchat.rizon.net/?channels=runelite&uio=d4) or alternatively our [Discord](https://discord.gg/ArdAhnN) server.

## Project Layout

- [cache](cache/src/main/java/net/runelite/cache) - Libraries used for reading/writing cache files, as well as the data in it
- [http-api](http-api/src/main/java/net/runelite/http/api) - API for api.runelite.net
- [http-service](http-service/src/main/java/net/runelite/http/service) - Service for api.runelite.net
- [runelite-api](runelite-api/src/main/java/net/runelite/api) - RuneLite API, interfaces for accessing the client
- [runelite-client](runelite-client/src/main/java/net/runelite/client) - Game client with plugins

## Usage

Open the project in your IDE as a Maven project, build the root module and then run the RuneLite class in runelite-client.  
For more information visit the [RuneLite Wiki](https://github.com/runelite/runelite/wiki).
