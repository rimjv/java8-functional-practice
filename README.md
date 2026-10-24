# Java 8 Functional Practice

Hands-on practice with Java 8+ functional features (functional interfaces, lambda expressions, the Streams API) plus a collection of classic Java coding problems. Each exercise is written from scratch and covered by unit tests.

## Topics covered

### Functional programming

| Topic | What I practiced | Location |
|-------|------------------|----------|
| Custom functional interfaces | `Calculator`, `StringTransformer`, generic `Validator<T>` | `functionalinterfaces/` |
| Built-in interfaces | `Predicate`, `Consumer`, ... | `lambdas/` |
| Lambda expressions | Expression and block bodies, method references, closures | `lambdas/` |
| Streams API | `filter`, `map`, `reduce`, `groupingBy`, ... | `streams/` |

### Coding problems and algorithms

| Problem | What I practiced | Location |
|---------|------------------|----------|
| Character count | Counting character occurrences in a string | `characterCount/` |
| Comparator | Sorting objects with `Comparator` and `Comparable` | `comparator/` |
| Duplicate strings | Detecting and handling duplicate strings | `duplicateStringProblem/` |
| Equality | `equals()` and `hashCode()` behaviour | `equalityProblem/` |
| Exceptions | Custom and built-in exception handling | `exceptions/` |
| Expression validator | Validating expressions (e.g. balanced brackets) | `expressionValidator/` |
| Find class name | Finding a class name at runtime | `findClassName/` |
| Immutable collections | Creating and testing unmodifiable collections | `immutableCollection/` |
| Primes | Prime number logic | `primes/` |

## Project structure

```
src/
├── main/java/com/practise/
│   ├── functionalinterfaces/
│   ├── lambdas/
│   ├── streams/
│   ├── characterCount/
│   ├── comparator/
│   ├── duplicateStringProblem/
│   ├── equalityProblem/
│   ├── exceptions/
│   ├── expressionValidator/
│   ├── findClassName/
│   ├── immutableCollection/
│   └── primes/
└── test/java/com/practise/
    ├── characterCount/
    ├── comparator/
    ├── duplicateStringProblem/
    ├── equalityProblem/
    ├── exceptions/
    ├── expressionValidator/
    ├── findClassName/
    ├── immutableCollection/
    └── primes/
```

## Getting started

**Requirements:** JDK 17, Maven 3.6+

```bash
git clone https://github.com/rimjv/java8-functional-practice.git
cd java8-functional-practice
mvn test
```

To run a single demo:

```bash
mvn compile exec:java -Dexec.mainClass="com.practise.functionalinterfaces.ValidatorDemo"
```

To run the tests for one problem only:

```bash
mvn test -Dtest="com.practise.primes.*Test"
```

## Highlights

- `Calculator` guards against divide-by-zero with a clear `IllegalArgumentException`.
- `Validator<T>` is generic, so one interface validates both `String` and `Integer` inputs.
- Each custom interface is paired with its built-in equivalent to show where they overlap.
- Every problem has its own unit tests, so behaviour and edge cases are verified, not assumed.

## What I learned

- Lambdas are implementations of an interface, called through its method name.
- Expression bodies return automatically, while block bodies need an explicit `return`.
- Predicates drive `filter`, and Functions drive `map`.
- Overriding `equals()` requires overriding `hashCode()` too.
- Immutable collections throw `UnsupportedOperationException` on modification.

## Roadmap

- [x] Custom functional interfaces
- [x] Classic problems: strings, comparators, equality, exceptions, primes
- [ ] `Consumer`, `Supplier`, `BiFunction`
- [ ] Method references and closures
- [ ] Streams: grouping, partitioning, `flatMap`, `reduce`
- [ ] Small data-processing mini project