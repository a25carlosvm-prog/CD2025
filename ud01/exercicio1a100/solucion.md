# Solución
Situamonos na nosa carpeta de exercicios dentro do noso repositorio.
### C
> nano exercicio.c

Escribimos o código:
```c
#include <stdio.h>

int main() {
    for(int i = 1; i <= 100; i++) {
        printf("%d\n", i);
    }
    return 0;
}
```
Gardamos o código e compilamolo:
> gcc exercicio.c -o exercicio

### Java
> nano Exercicio.java

Escribimos o código
```java
public class Exercicio {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
```
Gardamos o código e compilamolo:
> javac Exercicio.java

### Python
> nano exercicio.py

Escribimos o código
```python
for i in range(1, 101):
    print(i)
```
Gardamos o código e compilamolo:
> python3 exercicio.py