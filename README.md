# DCS-Core
[DCS](https://github.com/DmitriyTSt/distributed-computation-system) - распределенная система подсчета инвариантов графа.
Для добавления способа вычисления нового инварианта необходимо создать проект с единственным класом, реализующим интерфейс, находящийся в данном репозитории.

## Подключение (gradle)
```groovy
repositories {
    maven { url "https://jitpack.io" }
}
```
```groovy
dependencies {
    implementation "com.github.DmitriyTSt:dcs-core:1.0"
}
```

## Пример
```kotlin
import ru.dmitriyt.dcs.core.GraphTask

class YourInvariantNameGraphTask : GraphTask {
    override fun solve(graph6: String): Int {
        // Ваш код подсчета инварианта
    }
}
```

## Важно
Собранный jar файл должен называться аналогично Вашему ```classpath``` класса решения.
Например: ```YourInvariantNameGraphTask.jar```
Например: ```org.example.YourInvariantNameGraphTask.jar```
