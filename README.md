# DCS-Core
[DCS](https://github.com/DmitriyTSt/distributed-computation-system) - распределенная система подсчета инвариантов графа.

Для добавления способа вычисления нового инварианта необходимо создать проект с единственным класом, реализующим интерфейс `GraphInvariant`, находящийся в данном репозитории.

Для добавления нового условия поиска необходимо создать проект с единственным класом, реализующим интерфейс `GraphCondition`, находящийся в данном репозитории.

## Подключение (gradle)
```groovy
repositories {
    maven { url "https://jitpack.io" }
}
```
```groovy
dependencies {
    implementation "com.github.DmitriyTSt:dcs-core:1.1"
}
```

## Пример решения инварианта
```kotlin
import ru.dmitriyt.dcs.core.GraphInvariant

class YourInvariantName : GraphInvariant {
    override fun solve(graph6: String): Int {
        // Ваш код подсчета инварианта
    }
}
```
## Пример задачи поиска
```kotlin
import ru.dmitriyt.dcs.core.GraphCondition

class CheckCliqueNumberIs7 : GraphCondition {
    override fun check(graph6: String): Boolean {
        // Ваш код проверки графа на условие
    }
}
```

## Важно
Собранный jar файл должен называться аналогично Вашему ```classpath``` класса решения.
Например: ```YourInvariantName.jar```
Например: ```org.example.YourInvariantName.jar```
