```scala
class MyClass[T](val value: T) {
  def this() = this(null)
  // For a more robust solution, consider using Option[T]
  // def this() = this(None)
}

// Or use Option[T] to avoid nulls:
class MyClassOption[T](val value: Option[T]) {
  def this() = this(None)
}
```