## Robo4J-snapshot-example
Robo4J Snapshot example shows how to use available SNAPSHOT Robo4J binaries by using gradle build system. 
Repository contains simple example that initiates and shutdowns the Robo4J System with one RoboUnit.
The example is configured by using Robo4J XML descriptor.


### Let's start with example 
* clone repository 
* open your favorite IDE 
* run `ExampleMain` class
* open command line or web browser
* write http://localhost:8050
```bash
$ curl http://localhost:8050
```
* response: ```[{"id":"httpServer","com.robo4j.LifecycleState":"STARTED"}]```
* received JSON response contains all Robo Units available inside RoboContext


## Building from Source
The Robo4j framework uses [Gradle][] to build.
It's required to create fatJar file and run.

## Requirements
* [Java JDK 8][]
* [Robo4j.io][] :: version: alpha-0.3.0-SNAPSHOT

## Staying in Touch
Follow [@robo4j][] or authors: [@miragemiko][] , [@hirt][]
on Twitter. In-depth articles can be found at [Robo4j.io][] or [miragemiko blog][]

## License
The Robo4j.io Framework is released under version 3.0 of the [General Public License][].

[Robo4j.io]: http://www.robo4j.io
[miragemiko blog]: http://www.miroslavkopecky.com
[General Public License]: http://www.gnu.org/licenses/gpl-3.0-standalone.html0
[@robo4j]: https://twitter.com/robo4j
[@miragemiko]: https://twitter.com/miragemiko
[@hirt]: https://twitter.com/hirt
[Gradle]: http://gradle.org
[Java JDK 8]: http://www.oracle.com/technetwork/java/javase/downloads
[Git]: http://help.github.com/set-up-git-redirect
[Robo4j documentation]: http://www.robo4j.io/p/documentation.html
