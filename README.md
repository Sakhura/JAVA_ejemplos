# JAVA_Ejemplos

Repositorio de ejemplos y ejercicios del curso **Java Trainee 2026**. Contiene código organizado por temas, desde los fundamentos del lenguaje hasta programación orientada a objetos con herencia.

## Requisitos

- **JDK 21** o superior
- **IDE recomendado:** IntelliJ IDEA

## Estructura del Proyecto

```
src/
├── Main.java
├── ErrorSintaxis.java
├── EstructuraSimple.java
├── EstructuraCondicionalCompuesta.java
├── Cadena.java
├── CadenaCaracteres.java
├── CadenaCaracteres2.java
├── EstructuraWhile.java
├── EstructuraDoWhile.java
├── EstructuraDoWhile2.java
├── EstructuraFor.java
├── For_Creativo.java
├── TablaMultiplicar2.java
├── TablasMultiplicar.java
├── Persona.java
├── Alumno.java
├── Plano.java
├── Triangulo.java
├── Operarios.java
├── Vector.java
├── Vector2.java
├── MenorMayor.java
├── Matriz1.java
├── MatrizIrregular.java
├── ColaboracionClases/
│   ├── Banco.java
│   └── Cliente.java
└── Herencias/
    ├── Persona.java
    ├── Empleado.java
    └── Prueba.java
```

## Contenido por Temas

### 1. Primeros Pasos

| Archivo | Descripción |
|---------|-------------|
| `Main.java` | Hola Mundo y primer ciclo `for` |
| `ErrorSintaxis.java` | Cálculo de superficie de un cuadrado, buenas prácticas de sintaxis |

### 2. Estructuras Condicionales

| Archivo | Descripción |
|---------|-------------|
| `EstructuraSimple.java` | Condicional `if` simple: verificar pago de impuestos según sueldo |
| `EstructuraCondicionalCompuesta.java` | Condicional `if-else`: encontrar el mayor entre 2 y 3 números |

### 3. Manejo de Strings

| Archivo | Descripción |
|---------|-------------|
| `Cadena.java` | Métodos de String: `equals`, `compareTo`, `charAt`, `substring`, `indexOf`, `toUpperCase`, `toLowerCase` |
| `CadenaCaracteres.java` | Comparar edades de dos personas ingresadas por teclado |
| `CadenaCaracteres2.java` | Comparar dos apellidos con `equals` |

### 4. Estructuras Repetitivas

| Archivo | Descripción |
|---------|-------------|
| `EstructuraWhile.java` | Ciclo `while`: suma, promedio y clasificación de sueldos de empleados |
| `EstructuraDoWhile.java` | Ciclo `do-while`: contar dígitos de un número (0-999) |
| `EstructuraDoWhile2.java` | Ciclo `do-while`: clasificar piezas por peso |
| `EstructuraFor.java` | Ciclo `for`: suma y promedio de 10 números |
| `For_Creativo.java` | Ciclo `for`: promedio de edades por jornada (mañana, tarde, noche) |
| `TablasMultiplicar.java` | Tablas de multiplicar con métodos separados |
| `TablaMultiplicar2.java` | Tablas de multiplicar con `while(true)` y `break` |

### 5. Clases y Objetos (POO)

| Archivo | Descripción |
|---------|-------------|
| `Persona.java` | Clase con atributos, métodos `inicializar`, `imprimir` y `esMayorEdad` |
| `Alumno.java` | Clase con constructor que carga datos y verifica mayoría de edad |
| `Plano.java` | Representación de un punto en el plano cartesiano e identificación de cuadrante |
| `Triangulo.java` | Clase triángulo: lado mayor y verificación de equilátero |

### 6. Arreglos y Matrices

| Archivo | Descripción |
|---------|-------------|
| `Operarios.java` | Arreglo de sueldos con constructor |
| `Vector.java` | Arreglo básico de enteros con carga e impresión |
| `Vector2.java` | Uso de `Vector<Integer>` (colección dinámica) |
| `MenorMayor.java` | Encontrar el mayor y menor de 3 valores usando `Math.max` y `Math.min` |
| `Matriz1.java` | Matriz bidimensional 3x5: carga e impresión |
| `MatrizIrregular.java` | Matriz irregular con filas de diferente tamaño |

### 7. Colaboración de Clases

| Archivo | Descripción |
|---------|-------------|
| `ColaboracionClases/Cliente.java` | Clase Cliente con depósitos y giros |
| `ColaboracionClases/Banco.java` | Clase Banco que gestiona 3 clientes y calcula depósitos totales |

### 8. Herencias

| Archivo | Descripción |
|---------|-------------|
| `Herencias/Persona.java` | Clase padre con atributos `protected` y Scanner compartido |
| `Herencias/Empleado.java` | Clase hija que hereda de Persona y agrega sueldo |
| `Herencias/Prueba.java` | Clase de prueba que instancia Persona y Empleado |

## Conceptos Clave Aplicados

- **Variables y tipos de datos:** `int`, `float`, `double`, `String`
- **Entrada por teclado:** uso de `Scanner`
- **Condicionales:** `if`, `if-else`, `if-else if`
- **Ciclos:** `while`, `do-while`, `for`
- **POO:** clases, objetos, atributos, métodos, constructores
- **Modificadores de acceso:** `private`, `protected`
- **Arreglos:** unidimensionales, bidimensionales, irregulares
- **Colecciones:** `Vector<Integer>`
- **Colaboración de clases:** composición entre objetos
- **Herencia:** `extends`, `super`, reutilización de código

## Cómo Ejecutar

1. Clona el repositorio:
   ```bash
   git clone <url-del-repositorio>
   ```
2. Abre el proyecto en IntelliJ IDEA.
3. Selecciona la clase que deseas ejecutar.
4. Haz clic en el botón **Run** o presiona `Shift + F10`.

## Autor

Proyecto desarrollado como parte del bootcamp **Java Trainee 2026 Sabina Romero**.