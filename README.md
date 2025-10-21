# 🧮 Calculadora CI/CD
![Java CI](https://github.com/samypipe470/calculadora-ci-devops/workflows/Java%20CI%20con%20Maven/badge.svg)
![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-3.9-blue)
![License](https://img.shields.io/badge/License-MIT-green)

## 📝 Descripción
Proyecto de ejemplo para aprender **DevOps** y **CI/CD** con **Java**, **Maven** y **GitHub Actions**.

---

## 🚀 Características
- Integración Continua con **GitHub Actions**
- Tests automatizados con **JUnit 5**
- Build automatizado con **Maven**
- Generación de artefactos **JAR**

---

## 🏗️ Estructura del Proyecto

calculadora-ci/
├── src/ │
├── main/java/co/edu/javeriana/demo/ │
│ └── Calculadora.java
└── test/java/co/edu/javeriana/demo/ │
└── CalculadoraTest.java ├── .github/workflows/ │
└── ci.yml
├── pom.xml
└── README.md

---

## Ejecutar Localmente

### Prerequisitos
- Java JDK 17+
- Maven 3.9+

### Comandos
```bash
# Compilar
mvn clean compile

# Ejecutar tests
mvn test

# Generar JAR
mvn package

📊 Funcionalidades de la Calculadora
Sumar dos números

Restar dos números

Multiplicar dos números

Dividir dos números

Calcular módulo

🔄 CI/CD Pipeline
Cada push ejecuta automáticamente:

Compilación con Maven

Ejecución de tests

Generación de reportes

Empaquetado del JAR

Upload del artefacto

👥 Autores
Samuel Felipe Manrique Vargas, Miguel Acuña, Javier Jaimes, Diego Negro - Proyecto del curso de Fundamentos de Ingeniería de Software


Preguntas de reflexión

a) ¿Qué ventajas ven de usar CI vs ejecutar tests manualmente?

b) ¿Qué pasaría si 10 desarrolladores trabajaran en el mismo proyecto?

c) ¿Cómo aplicarían esto a su proyecto del curso?

d) ¿Qué fue lo más difícil de la actividad?

e) ¿Qué aprendieron sobre DevOps?

Respuestas Samuel Felipe Manrique Vargas

a) La principal ventaja de usar CI es la obtención de retroalimentación rápida y la reducción de 
tiempo al detectar errores tempranamente. Mientras que las pruebas manuales son lentas y propensas
a errores humanos, un pipeline de CI automatiza la compilación y la ejecución de tests cada vez 
que se integra código nuevo. Esto no solo acelera el proceso, sino que previene que ta integracion sea caotica 
al identificar conflictos de código de forma casi instantánea, permitiendo que 
los equipos corrijan bugs antes de que estos sean más grandes, es decir, durante la fase de 
desarrollo.

b) Con 10 desarrolladores, un proceso manual de integración sería caótico y propenso a conflictos, 
creando el caos de código que DevOps busca eliminar. La adopción de un pipeline de CI se volvería 
muy importante, ya que actuaría como un punto de control central y automatizado. Cada 
desarrollador podría integrar sus cambios varias veces al día, y el sistema verificaría 
automáticamente que las nuevas contribuciones no rompan la funcionalidad existente.

c) En nuestro proyecto, podríamos crear un repositorio central en GitHub con un pipeline de CI 
configurado. Cada equipo trabajaría en sus funcionalidades en ramas separadas y antes de 
integrar cualquier cambio a la rama principal, se crearía un pull request que activaría 
automáticamente el pipeline de CI. Este ayudaría a preservar la integridad y la calidad, 
ejecutando todas las unitarias y de integración. De esta forma, solo el código que pase 
exitosamente las pruebas podría ser fusionado, garantizando que la base del código del 
proyecto se mantenga siempre estable y funcional para todos los equipos.

d) La curva de aprendizaje inicial con las herramientas y la configuración del pipeline al 
comienzo no era tan fácil de entender. La familiarización con los comandos de Maven y la 
sintaxis YAML de GitHub Actions se necesitó prestarle bastante atención y específicamente, 
el desafío de probar con múltiples versiones de Java fue complejo, ya que implicó diagnosticar 
y resolver conflictos entre la configuración del pom.xml y el archivo del workflow. 
Entender que el entorno de ejecución del pipeline (Java 11) debía ser compatible con 
la versión de compilación del proyecto fue un aprendizaje clave.

e) La actividad práctica permitió experimentar los tres pilares fundamentales de DevOps: 
como la cultura, al colaborar para resolver los problemas del pipeline, la automatización, 
al crear un proceso que compila y prueba el código sin intervención humana y la medición, 
al recibir resultados claros de éxito o fallo que permitieron mejorar. Aprendí que el 
objetivo es crear un ciclo de mejora continua que agiliza la entrega de software de calidad.