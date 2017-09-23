# cortado
Enhanced operators for list of strings and numerics


### Suported Operators

```
+++ add or concatenate`

*** multiply

--- substract

||| divide

@@@ implode list to string

### concatenate imploded list
```

### Performing Basic Arithmetic Operators

To get started we will perform operation 1000/(X+2) on each element of a list.
```scala
import com.cafecito.cortado.core.Cortado._

val numbers = List(1,40,6)
1000|||(numbers+++2)
```
Evaluates to 

```numbers: List[Int] = List(1, 40, 6)```

Now we multiply this list by 1, 3 and 5 on this list and we expect all possible results

```scala

1000|||(numbers+++2) *** List(1, 3, 5)
```
Evaluates to 

```scala
res1: Seq[Any] = List(333, 23, 125, 111, 7, 41, 66, 4, 25)
```
We can wrap the expression above into a curly braced, comma separated integers and wrap the whole results into squared brackets in a single expression
```scala
"["###(("{n:"+++(1000|||(numbers+++2)) *** List(1, 3, 5)+++"}")@@@",")###"]"
```
Evaluates to
```scala
res2: String =[{n:333},{n:23},{n:125},{n:999},{n:69},{n:375},{n:1665},{n:115},{n:625}]
```

### Performing String Operations On List
The last example is a segway to show what you can do with string operations.
As an example, we can generate a list of different addresses using string operations on a list of numbers if you will. Let's compose a few fictitious links:

```scala
(List("http", "https")+++"://"+++List("www","dev")+++"."+++List("google", "fb")+++"."+++List("com", "net")+++"/id/"+++ numbers)@@@"\n
```
Evaluates to
```scala
res2: String = http://www.google.com/id/1
https://www.google.com/id/1
http://dev.google.com/id/1
https://dev.google.com/id/1
http://www.fb.com/id/1
https://www.fb.com/id/1
http://dev.fb.com/id/1
https://dev.fb.com/id/1
http://www.google.net/id/1
https://www.google.net/id/1
http://dev.google.net/id/1
https://dev.google.net/id/1
http://www.fb.net/id/1
https://www.fb.net/id/1
http://dev.fb.net/id/1
https://dev.fb.net/id/1
http://www.google.com/id/40
https://www.google.com/id/40
http://dev.google.com/id/40
https://dev.google.com/id/40
http://www.fb.com/id/40
https://www.fb.com/id/40
http://dev.fb.com/id/40
https://dev.fb.com/id/40
http://www.google.net/id/40
https://www.google.net/id/40
http://dev.google.net/id/40
https://dev.google.net/id/40
http://www.fb.net/id/40
https://www.fb.net/id/40
http://dev.fb.net/id/40
https://dev.fb.net/id/40
http://www.google.com/id/6
https://www.google.com/id/6
http://dev.google.com/id/6
https://dev.google.com/id/6
http://www.fb.com/id/6
https://www.fb.com/id/6
http://dev.fb.com/id/6
https://dev.fb.com/id/6
http://www.google.net/id/6
https://www.google.net/id/6
http://dev.google.net/id/6
https://dev.google.net/id/6
http://www.fb.net/id/6
https://www.fb.net/id/6
http://dev.fb.net/id/6
https://dev.fb.net/id/6
```
