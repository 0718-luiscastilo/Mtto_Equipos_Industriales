# 🏭 Sistema de Gestión de Máquinas Industriales

Sistema desarrollado en **Java** para gestionar, consultar, monitorear y realizar mantenimiento a diferentes tipos de máquinas dentro de un entorno industrial.

El proyecto fue desarrollado como parte de un proceso de aprendizaje de **Programación Orientada a Objetos (POO)**, utilizando conceptos fundamentales de Java aplicados a un escenario relacionado con automatización y sistemas industriales.

---

## 📖 Descripción

El sistema permite administrar diferentes máquinas industriales mediante un menú interactivo.

Cada máquina cuenta con información como:

- Código
- Nombre
- Modelo
- Tipo
- Temperatura
- Velocidad
- Cantidad de piezas
- Estado de operación

Además, el sistema permite realizar diferentes operaciones sobre las máquinas, como iniciar, detener, registrar producción, realizar mantenimiento y monitorear su funcionamiento.

El proyecto utiliza una arquitectura basada en una clase abstracta principal y diferentes clases especializadas.

---

## 🎯 Objetivos del proyecto

Los principales objetivos son:

- Practicar Programación Orientada a Objetos en Java.
- Aplicar encapsulamiento.
- Comprender herencia y polimorfismo.
- Trabajar con clases abstractas.
- Implementar interfaces.
- Utilizar arreglos de objetos.
- Crear métodos reutilizables.
- Implementar sobrecarga de métodos.
- Desarrollar un menú interactivo.
- Aplicar validación de datos.
- Modelar un sistema relacionado con un entorno industrial.

---

## ⚙️ Funcionalidades

### Gestión de máquinas

- Registrar nuevas máquinas.
- Mostrar todas las máquinas.
- Buscar una máquina mediante su código.
- Consultar máquinas activas.
- Consultar máquinas inactivas.

### Información y estadísticas

- Calcular la temperatura promedio.
- Contar máquinas según su tipo.
- Consultar información detallada de cada máquina.

### Operación

- Iniciar una máquina.
- Detener una máquina.
- Aumentar velocidad.
- Reducir velocidad.
- Registrar producción.

### Mantenimiento

- Buscar una máquina por código.
- Verificar si permite mantenimiento.
- Ejecutar mantenimiento.

### Monitoreo

- Buscar una máquina.
- Verificar si es monitoreable.
- Iniciar monitoreo.
- Detener monitoreo.

---

## 🧱 Arquitectura del proyecto

El proyecto utiliza una clase abstracta principal:

```text
                    ┌─────────────────────┐
                    │      Maquina        │
                    │     <<abstract>>    │
                    └──────────┬──────────┘
                               │
             ┌─────────────────┼─────────────────┐
             │                 │                 │
             ▼                 ▼                 ▼
   ┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐
   │MaquinaProduccion│ │ MaquinaEmpaque  │ │ RobotIndustrial │
   └─────────────────┘ └─────────────────┘ └─────────────────┘
             │                 │                 │
             └────────────┬────┴────┬────────────┘
                          │         │
                          ▼         ▼
                  ┌────────────┐ ┌──────────────┐
                  │Mantenible  │ │ Monitoreable │
                  └────────────┘ └──────────────┘
```

---

## 📂 Estructura del proyecto

```text
src/
└── codigo/
    ├── Maquina.java
    ├── MaquinaProduccion.java
    ├── MaquinaEmpaque.java
    ├── RobotIndustrial.java
    ├── Mantenible.java
    ├── Monitoreable.java
    ├── Funciones.java
    └── Programa.java
```

---

## 🧩 Clases principales

### `Maquina`

Clase abstracta que representa la estructura común de las máquinas.

Contiene información como:

- Código
- Nombre
- Modelo
- Tipo
- Temperatura
- Velocidad
- Cantidad de piezas
- Estado de la máquina

También contiene comportamientos generales como:

- Mostrar información
- Iniciar máquina
- Detener máquina
- Aumentar velocidad
- Reducir velocidad
- Registrar producción

Además, define la operación abstracta:

```text
realizarOperacion()
```

---

### `MaquinaProduccion`

Representa una máquina encargada de procesos de producción.

Cuenta con características específicas como:

- Tipo de producto
- Piezas por hora
- Modo automático

Implementa:

```text
Mantenible
Monitoreable
```

---

### `MaquinaEmpaque`

Representa una máquina utilizada para procesos de empaque.

Cuenta con características específicas relacionadas con:

- Tipo de empaque
- Capacidad
- Velocidad de empaque

Implementa:

```text
Mantenible
Monitoreable
```

---

### `RobotIndustrial`

Representa un robot utilizado dentro de un entorno industrial.

Cuenta con características específicas como:

- Número de ejes
- Capacidad de carga
- Visión artificial

Implementa:

```text
Mantenible
Monitoreable
```

---

## 🔌 Interfaces

### `Mantenible`

Define el comportamiento relacionado con mantenimiento.

```text
realizarMantenimiento()
mostrarEstadoMantenimiento()
```

Las máquinas que implementan esta interfaz pueden realizar operaciones de mantenimiento.

---

### `Monitoreable`

Define las operaciones relacionadas con monitoreo.

```text
iniciarMonitoreo()
detenerMonitoreo()
```

Permite que el sistema determine qué máquinas pueden ser monitoreadas.

---

## 🧠 Conceptos de Java aplicados

Este proyecto permite practicar diferentes conceptos fundamentales y de nivel intermedio:

### Programación Orientada a Objetos

- Clases
- Objetos
- Atributos
- Métodos
- Constructores
- Encapsulamiento

### Herencia

Las clases especializadas heredan características de `Maquina`.

```text
Maquina
   │
   ├── MaquinaProduccion
   ├── MaquinaEmpaque
   └── RobotIndustrial
```

### Abstracción

`Maquina` es una clase abstracta que define comportamientos comunes y obliga a las clases hijas a implementar:

```text
realizarOperacion()
```

### Polimorfismo

El sistema utiliza:

```text
Maquina[]
```

para almacenar diferentes tipos de máquinas.

Esto permite trabajar con:

```text
MaquinaProduccion
MaquinaEmpaque
RobotIndustrial
```

utilizando una misma referencia de tipo `Maquina`.

### Interfaces

Se utilizan:

```text
Mantenible
Monitoreable
```

para definir capacidades que pueden tener diferentes tipos de máquinas.

### `instanceof`

Se utiliza para comprobar si una máquina implementa una determinada interfaz antes de realizar un casting.

Ejemplo conceptual:

```text
Maquina
   ↓
instanceof Monitoreable
   ↓
Monitoreable
   ↓
iniciarMonitoreo()
```

### Sobrecarga de métodos

El proyecto utiliza diferentes versiones de métodos como:

```text
registrarProduccion()
registrarProduccion(int)
registrarProduccion(int, int)
registrarProduccion(int, String)
```

Esto permite trabajar con diferentes formas de registrar producción.

---

## 🖥️ Menú principal

El sistema utiliza un menú interactivo similar al siguiente:

```text
===== SISTEMA DE GESTIÓN INDUSTRIAL =====

1. Registrar máquina
2. Mostrar todas las máquinas
3. Buscar máquina por código
4. Mostrar máquinas por estado
5. Calcular temperatura promedio
6. Contar máquinas por tipo
7. Realizar mantenimiento
8. Monitorear máquina
9. Salir
```

---

## 🗃️ Almacenamiento de máquinas

Las máquinas se almacenan utilizando un arreglo de objetos:

```text
Maquina[]
```

Esto permite almacenar diferentes clases hijas dentro de una misma estructura.

Conceptualmente:

```text
Maquina[] maquinas

[0] → MaquinaProduccion
[1] → MaquinaEmpaque
[2] → RobotIndustrial
[3] → MaquinaProduccion
```

Esto permite aplicar polimorfismo en el sistema.

---

## 🔄 Flujo general del sistema

```text
Inicio
  │
  ▼
Mostrar menú
  │
  ▼
Seleccionar opción
  │
  ├── Registrar máquina
  │
  ├── Mostrar máquinas
  │
  ├── Buscar máquina
  │
  ├── Consultar estado
  │
  ├── Calcular estadísticas
  │
  ├── Realizar mantenimiento
  │
  ├── Monitorear máquina
  │
  └── Salir
  │
  ▼
Fin
```

---

## 🛠️ Tecnologías utilizadas

- **Java**
- **Programación Orientada a Objetos**
- **Arrays**
- **Interfaces**
- **Clases abstractas**
- **Herencia**
- **Polimorfismo**
- **Casting**
- **`instanceof`**
- **Métodos**
- **Constructores**
- **Sobrecarga de métodos**
- **Scanner**
- **Estructuras de control**

---

## ▶️ Cómo ejecutar el proyecto

### 1. Clonar el repositorio

```bash
git clone [URL_DEL_REPOSITORIO]
```

### 2. Abrir el proyecto

Puedes utilizar:

- IntelliJ IDEA
- Visual Studio Code
- Eclipse
- NetBeans

### 3. Ejecutar

Ejecuta:

```text
Programa.java
```

La aplicación mostrará el menú principal en la consola.

---

## 📚 Aprendizajes obtenidos

Durante el desarrollo de este proyecto se reforzaron conceptos importantes de Java:

- Modelado de objetos.
- Encapsulamiento.
- Diseño de clases.
- Herencia.
- Abstracción.
- Polimorfismo.
- Interfaces.
- Sobrecarga.
- Arreglos de objetos.
- Casting.
- Validación.
- Modularización.
- Diseño de menús.
- Separación de responsabilidades.

Además, el proyecto permitió comenzar a relacionar la programación con escenarios de **automatización y sistemas industriales**.

---

## 🚀 Próximas mejoras

El proyecto puede continuar creciendo mediante la implementación de nuevas funcionalidades:

- [ ] Persistencia de datos en archivos.
- [ ] Implementación de `ArrayList`.
- [ ] Implementación de excepciones personalizadas.
- [ ] Registro histórico de mantenimiento.
- [ ] Estado real del mantenimiento.
- [ ] Registro de horas de operación.
- [ ] Gestión de sensores.
- [ ] Alertas de temperatura.
- [ ] Alertas de mantenimiento.
- [ ] Historial de producción.
- [ ] Sistema de usuarios.
- [ ] Base de datos.
- [ ] Interfaz gráfica.
- [ ] Integración con sistemas industriales.

---

## 📌 Estado del proyecto

🟡 **En desarrollo**

Este proyecto forma parte de un proceso de aprendizaje progresivo en Java y continuará evolucionando conforme se incorporen nuevos conceptos de programación y funcionalidades relacionadas con sistemas industriales.

---

## 👨‍💻 Autor

**Francisco Castillo**

Proyecto desarrollado como parte de mi proceso de aprendizaje y práctica de **Java, Programación Orientada a Objetos y sistemas industriales**.

---

## ⭐ Objetivo a largo plazo

El objetivo de este proyecto no es únicamente practicar Java, sino desarrollar progresivamente sistemas más completos que permitan aplicar conocimientos de programación en áreas como:

```text
Programación
     ↓
POO
     ↓
Estructuras de datos
     ↓
Bases de datos
     ↓
Backend
     ↓
Automatización
     ↓
Sistemas industriales
     ↓
Software industrial
```

Cada nueva versión representa un paso más en el desarrollo de habilidades para crear software más estructurado, mantenible y cercano a escenarios profesionales.