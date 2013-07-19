scala-sbt.g8
============

A Giter8(https://github.com/n8han/giter8) template that creates a sbt(https://github.com/sbt/sbt) project with support for Scala 2.10 and ScalaTest.
Bases on sbt 0.12 it includes:

* eclipse plugin
* sbt-package-dist plugin

Usage
=====
Open a console and:

    $ g8 rlazoti/scala-sbt.g8

The '.g8' suffix is implicit so you could also do:

    $ g8 rlazoti/scala-sbt

You'll now be prompted for each parameters, I know there are a lot of them and I don't know why they aren't logically ordered. :P

Once everything is ok (you can leave everything by default):

    $ cd <your newly created folder>

    $ sbt