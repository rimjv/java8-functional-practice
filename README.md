# Java 8 Functional Practice

Hands-on practice with Java 8+ functional features: functional interfaces, lambda expressions, and the Streams API. Each exercise is written from scratch and covered by unit tests.

## Topics covered

| Topic | What I practiced | Location |
|---|---|---|
| Custom functional interfaces | `Calculator`, `StringTransformer`, generic `Validator<T>` | `functionalinterfaces/` |
| Built-in interfaces | `Predicate`, `Consumer`, ... | `lambdas/` |
| Lambda expressions | Expression and block bodies, method references, closures | `lambdas/` |
| Streams API | `filter`, `map`, `reduce`, `groupingBy`, ... | `streams/` |

## Project structure

```
src/
├── main/java/com/practise/
│   ├── functionalinterfaces/
│   ├── lambdas/
│   └── streams/
└── test/java/com/practise/
```

## Getting started

**Requirements:** JDK 17, Maven 3.6+

```bash
git clone https://github.com/<username>/java8-functional-practice.git
cd java8-functional-practice
mvn test
```

To run a single demo:

```bash
mvn compile exec:java -Dexec.mainClass="com.practise.functionalinterfaces.ValidatorDemo"
```

## Highlights

- `Calculator` guards against divide-by-zero with a clear `IllegalArgumentException`.
- `Validator<T>` is generic, so one interface validates both `String` and `Integer` inputs.
- Each custom interface is paired with its built-in equivalent to show where they overlap.

## What I learned

- Lambdas are implementations of an interface, called through its method name.
- Expression bodies return automatically, while block bodies need an explicit `return`.
- Predicates drive `filter`, and Functions drive `map`.

## Roadmap

- [x] Custom functional interfaces
- [ ] Consumer, Supplier, BiFunction
- [ ] Method references and closures
- [ ] Streams: grouping, partitioning, flatMap, reduce
- [ ] Small data-processing mini project