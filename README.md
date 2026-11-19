# Hypherator – Java Hyphenation Library (JDK11)

[![Maven Central](https://img.shields.io/maven-central/v/io.sevcik/hypherator)](https://central.sonatype.com/artifact/io.sevcik/hypherator)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

**Hypherator** is a lightweight, MIT-licensed hyphenation library for Java, based on [Hunspell-style](https://man.archlinux.org/man/hyph-en.5) hyphenation patterns. It provides a simple iterator-based API to hyphenate words — making it easy to integrate into tokenizer-style workflows (like [ICU4J](https://icu.unicode.org/)).

---

## ✨ Features

- 🔤 **Hunspell-style hyphenation rules** (used by LibreOffice and OpenOffice)
- ⚙️ **Lightweight & pure Java** – no native code or JNI required
- 🔁 **Iterator-based API** – works great in streaming/text processing pipelines
- 🌍 **Multi-language** – bundled with broad collection of hyphenation dictionaries
- 🆓 **MIT license** – free for commercial and open-source use

---

## 🚀 Installation

### Maven

```xml
<dependency>
    <groupId>io.sevcik</groupId>
    <artifactId>hypherator</artifactId>
    <version>1.1.1-jdk11</version>
</dependency>
```

### Gradle

```xml
implementation("io.sevcik:hypherator:1.0")
```

## Usage


```
        String word = "typography";
        HyphenIterator iterator = Hypherator.getInstance("en_US");
        iterator.setWord(word);
        var potentialBreak = iterator.first();
        int count = 0;
        while (potentialBreak != DONE) {
            var parts = iterator.applyBreak(pb);
            System.out.println(parts.getFirst() + " - " + parts.getSecond());
            potentialBreak = iterator.next();
        }

```


This will print possible hyphenation points like:

```
ty - pography
typog - raphy
```

## Included dictionaries
Compatible LibreOffice hyphenation dictionaries are bundled directly, so Hypherator works out of the box for many languages — no extra setup required.

### License:
MIT License. See LICENSE file for more information.

## Sponsored by [pdf365.cloud](https://pdf365.cloud).

Hypherator is developed and maintained as part of the [pdf365.cloud](https://pdf365.cloud) project — a professional-grade PDF generator for structured and multilingual content.
