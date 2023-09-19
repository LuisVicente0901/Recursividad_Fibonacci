# Recursividad Fibonacci

1. EL método  `funcionFibonacci` toma como parametro `n` que es la $n-esima$ posición de la sucesión de Fibonacci.
2. De manera recursiva se calculan los elementos de la sucesión.
   * Si $n\leq 1$ regresa $1$
   * Si $n > 1$ de manera recursiva calcula el elemento haciendo $funcionFibonacci(n)=funcionFibonacci(n-1)+funcionFibonacci(n-2)$
