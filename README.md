# Scala Null Type Erasure and Generics

This example demonstrates a potential issue with null values and generics in Scala.  The `MyClass` constructor uses `null.asInstanceOf[T]`, but this approach might cause issues depending on the type `T` and its ability to handle nulls safely. This code is intentionally designed to highlight the risk associated with type erasure.