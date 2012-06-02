# noir-war-archetype

This is a Maven archetype for creating [Noir](http://webnoir.org) apps to be packaged as WARs. It
uses [noir-servlet](http://github.com/brokensandals/noir-servlet).

## Install

    git clone git://github.com/brokensandals/noir-war-archetype.git
    cd noir-war-archetype
    mvn clean install

## Create Project

    mvn archetype:generate -DarchetypeGroupId=net.brokensandals -DarchetypeArtifactId=noir-war-archetype -DarchetypeVersion=1.0-SNAPSHOT

You can start a development server (with automatic reloading) using `mvn jetty:run`.

## License

Copyright © 2012 Jacob Williams

Distributed under the Eclipse Public License, the same as Clojure.
