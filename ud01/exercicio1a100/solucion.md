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
> gcc exercicio.c -o exercicio

### Java
> nano Exercicio.java

```java
public class Exercicio {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
```
> javac Exercicio.java

### Python

> nano exercicio.py
```python
for i in range(1, 101):
    print(i)
```
> python3 exercicio.py