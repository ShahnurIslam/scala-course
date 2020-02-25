# Collections

## Practical exercises

Exercises following the material presented in Chapter 3

### 1. Review official documentation

Briefly review the official [collections overview](http://docs.scala-lang.org/overviews/collections/overview.html), concentrating in particular on [immutable collection classes](http://docs.scala-lang.org/overviews/collections/concrete-immutable-collection-classes.html), and also the [parallel collections overview](http://docs.scala-lang.org/overviews/parallel-collections/overview.html). Try some code examples in a REPL. 

### 2. Computing the sample mean and standard deviation

a. By copying the `app-template` directory (or otherwise), create a new Scala SBT project. Write a function with signature
```scala
meanAndSD(x: Vector[Double]): (Double, Double)
```
which returns a tuple containing the [sample mean](http://mathworld.wolfram.com/SampleMean.html) and [sample standard deviation](https://en.wikipedia.org/wiki/Standard_deviation) of the collection of numbers.

b. When you get it working, write some tests to check it works on a few trivial examples.

c. Generalise it so that it works for any collection of `Doubles`, and check that it works for parallel as well as serial collections.

d. Test your function on huge collections of random *U(0,1)* quantities. What should the true mean and standard devaition be? Can you detect a difference in speed between the serial and parallel versions?

e. (optional) You have probably written this code so that it computes the mean and SD using two passes over the data. Can you figure out a way to implement it using just a single pass?

f. (optional) You have probably completed task e. using a sequential fold which can not easily be parallelised. Can you make it parallelisable by replacing your `fold` with `aggregate`. You will have to look up how `aggregate` works.


### 3. Wrap interval bisection code in an Option

Starting from the code you wrote for [interval bisection](./bisection/Readme.md) previously, make it safe by wrapping it in an Option. See the [detailed instructions](option/Readme.md) for further information.


#### eof

