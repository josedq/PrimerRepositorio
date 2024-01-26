class PF2_1_1 {
  /*

      PROBAR A USAR NOTEBOOKS CON VISUALSTUDIO

      def addOne(x: Int): Int
      Con Object: Areas.circle(6)
      Con Class: (new Areas).circle(6)
      Con val son inmutables; con var no
      En programacion funcional se usan inmutables
      val f: <<function>> = <<lambda expression>> (pseudocodigo)
      Int => Int representa un tipo de dato (func q reciben y devuelven enteros), como lo son boolean o Int
      (a: Int) => a + 1  <-- Esto es una expresion lambda que represnta un valor (recibir un entero y devolverlo sumandole 1), como lo son false o true para el boolean

      val f1: String => Char =
        (s: String) => 'a': Char
      call ((e: Int) => e+1: Int, 5)

      val addOneV =
        (a: Int) => a + 1   <-- Esto funciona (azucar sintactico)

      currificacion

      val f: Int => (Int => Int) =
        (x: Int) => (y: Int) => x+y: Int

      val sum: Int => (Int => Int) = x => y => x+y

      fallo (parentesis):

      val f: (Int => Int) => Int =
        (g: Int => Int) => g(0): Int   <-- Esto es distinto a la funcion de linea 24

      def isEvenLength (s: String): Boolean =
        s.length % 2 == 0
      val isEven: Int => Boolean =
        (i: Int) => i % 2 == 0
      val length: String => Int = _.length
      val isEvenLength: String => Boolean =
        s => s.length % 2 == 0  <-- composicion
      val isEvenLength: String => Boolean =
        s => isEven(length(s))  <-- composicion
      val isEvenLength: String => Boolean =
        isEven compose length <-- composicion
      val isEvenLength: String => Boolean =
        length andThen isEven

      val distinctOcc: String => Int = (s: String) => s.distinct.length: Int
      val isLength5: Int => Boolean = (i: Int) => i == 5: Boolean
      val f2composef1: String => Boolean =
        s => isLength5 (distinctOcc(a))

      def compose (g: Int => Boolean, f: String => Int): String => Boolean =

      lazy

      def compose1 (f2: Int => Boolean, f1: String => Int): String => Boolean =
        (a: String) => f2(f1(a))

      def compose2 (f2: Float => Int, f1: Char => Float): Char => Int =
        (a: Char) => f2(f1(a))

      ¿como definir una sola compose que sirva tanto para compose1 como para compose2?

      def compose [A,B,C] (f2: B => C, f1: A => B): A => C =
        (a: A) => f2(f1(a)) <-- Esto recibe 5 parametros (2 valores f1 y f2; y 3 tipos A,B,C)

      val f1: Char => Float = (c: Char) => c: Float
      val f2: Float => Int = (f: Float) => f.cell.toInt: Int
      val f3: Char => Int = compose [Char, Floar, Int] (f2,f1) // si no declaramos compose (lineas 62-63)no compilaria

      Desarrollo dirigido por tipos:

      1
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C = <-- signatura
        // ???

      2
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C =
        (a: A) => ??? : C

      3
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C =
        (a: A) => f2(???: B) : C

      4
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C =
        (a: A) => f2(f1(??? : A) : B) : C

      5
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C =
        (a: A) => f2(f1(a : A) : B) : C

      6
      def foo[A,B,C] (f2: B => C, f1: A => B): A => C =
        a => f2(f1(a))

      // como funcion valor
      def foo[A,B,C]: (B => C, A => B) => (A => C) =
        (f2, f1) => (a => f2(f1(a)))

      // currificada
      def foo[A,B,C]: (B => C) => (A => B) => A => C =
        f2 => (f1 => (a => f2(f1(a))))

   */
}
