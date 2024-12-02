# Estilos y patrones arquitectónicos

<aside>
📖 Universidad de las Fuerzas Armadas - ESPE
Realizado por:
✅ Cristian Tello
✅ Karol Macas
✅ Mateo Barriga
26 de noviembre de 2024 
🖥️ Aplicaciones Distribuidas - NRC: 2546
🖥️ Proyecto:

</aside>

# Estilos de Arquitectura de Software( Client-Server, Microservicio, Event-Driven, Layered)

# Client-Server

La arquitectura cliente-servidor es un modelo de diseño de software en el que las aplicaciones se dividen en dos componentes principales: clientes y servidores. Esta separación facilita la gestión de recursos y permite que ambos interactúen de manera eficiente. El cliente realiza solicitudes de servicios o datos, mientras que el servidor proporciona esos recursos. Este sistema se basa en una comunicación constante mediante protocolos de red, lo que permite un flujo de información bidireccional entre ambos.

Ejemplos comunes incluyen navegadores web(clientes) que se comunica con servidores web o sistemas de correo electrónico como Gmail y Outlook, donde los clientes de correo se conectan a servidores para enviar y recibir mensajes.

### Ventajas

- Centralización de datos y recursos: Facilita la integridad y consistencia al manejar datos desde un único lugar.
- **Seguridad:** Se implementan medidas como firewalls y autenticación centralizada.
- **Escalabilidad:** Tanto clientes como servidores pueden evolucionar de manera independiente.
- **Separación de responsabilidades:** Los desarrolladores pueden trabajar por separado en la lógica del cliente y el servidor.

### Desventajas

- **Dependencia del servidor:** Si el servidor falla, los clientes no pueden acceder al sistema.
- **Actualizaciones complicadas:** Especialmente en entornos con muchos clientes, lo que puede generar incompatibilidades.
- **Problemas de concurrencia:** El servidor puede saturarse si no se gestiona adecuadamente un alto volumen de peticiones.

### Variaciones

1. **Dos capas:** Cliente-servidor básico.
2. **Tres capas:** Cliente, servidor de aplicaciones y servidor de base de datos.
3. **N capas:** Añade más servidores especializados, como de presentación o análisis, para mayor flexibilidad y rendimiento.

# Microservicio

La arquitectura de microservicios es un estilo de diseño donde una aplicación se divide en servicios independientes que funcionan de manera autónoma y se comunican mediante APIs. Cada microservicio gestiona una funcionalidad específica y puede desarrollarse, desplegarse y escalarse de forma individual. Esto la convierte en una alternativa popular a los sistemas monolíticos, especialmente en proyectos que requieren agilidad y escalabilidad.

### Ventajas

- **Escalabilidad:** Permite escalar servicios de forma independiente según las necesidades del sistema.
- **Flexibilidad Tecnológica:** Los equipos pueden elegir diferentes tecnologías o lenguajes para cada microservicio.
- **Despliegue Continuo:** Facilita la implementación y actualización de servicios sin interrumpir el sistema completo.
- **Aislamiento de Fallos:** Un fallo en un servicio específico no afecta directamente a los demás.
- **Productividad:** Los equipos pueden trabajar en paralelo en diferentes servicios, acelerando el desarrollo.

### Desafíos:

- **Complejidad Operativa:** Manejar múltiples servicios requiere una infraestructura robusta para la comunicación, monitoreo y orquestación (e.g., Kubernetes).
- **Costos de Implementación:** Inicialmente, la implementación es más costosa debido a la necesidad de herramientas y habilidades específicas.
- **Pruebas y Depuración:** La interconexión entre servicios complica las pruebas y la localización de errores.
- **Sobrecarga de Comunicación:** La comunicación entre servicios puede introducir latencia y fallos si no se diseña adecuadamente.

Un ejemplo de Implementación: En una tienda de comercio electrónico, los microservicios pueden dividirse en servicios como gestión de usuarios, inventarios, pagos y envíos. Cada servicio es autónomo pero interactúa con los demás para completar procesos de negocio complejos, como la compra de un producto.

### Herramientas Relacionadas:

1. **Docker:** Facilita la creación y despliegue de contenedores ligeros para cada microservicio.
2. **Kubernetes:** Gestiona y escala automáticamente los contenedores.
3. **ruebas Automatizadas:** Son esenciales para garantizar la calidad del sistema y detectar problemas en etapas tempranas.

# Arquitectura Event-Driven (EDA)

La arquitectura basada en eventos (Event-Driven Architecture o EDA) es un estilo arquitectónico en el que los componentes de un sistema reaccionan a eventos específicos. Un evento puede ser cualquier cambio de estado, como agregar un producto al carrito, realizar una transferencia bancaria o actualizar los datos de contacto de un cliente.

### Ventajas

- **Escalabilidad:** Los componentes funcionan de forma independiente y pueden escalarse individualmente según las necesidades.
- **Bajo acoplamiento:** Los emisores y consumidores están desacoplados, facilitando actualizaciones y despliegues sin afectar a otros componentes.
- **Asincronía:** Permite un procesamiento fluido y eficiente de grandes volúmenes de datos sin necesidad de esperar respuestas inmediatas.
- **Adaptación al cambio:** Es ideal para sistemas que requieren evolución constante, como microservicios o migración de aplicaciones legacy.

### Desafíos

- **Complejidad:** Diseñar, implementar y gestionar sistemas EDA puede ser más complicado que con arquitecturas tradicionales.
- **Trazabilidad:** Identificar y gestionar fallos es un reto debido a la asincronía y el desacoplamiento de los componentes.
- **Consistencia:** Garantizar la consistencia en sistemas distribuidos es complicado, especialmente cuando múltiples eventos están relacionados.

### Ejemplos de Uso:

- **Aplicaciones de comercio electrónico:** Para gestionar eventos como actualizaciones de carritos o notificaciones en tiempo real.
- **Integración de sistemas:** Para conectar aplicaciones empresariales o sistemas SaaS mediante eventos.
- **Procesamiento de datos en tiempo real:** Utilizado en aplicaciones que manejan flujos de datos constantes, como análisis de redes sociales o sistemas IoT

### Tecnologías Comunes

1. **Apache Kafka:** Ideal para grandes volúmenes de datos en tiempo real.
2. **RabbitMQ:** Confiable y flexible, usado en sistemas que requieren alta persistencia y enrutamiento de mensajes.

# Layered

La arquitectura en capas es un estilo ampliamente utilizado para organizar aplicaciones dividiendo las funcionalidades en diferentes niveles o capas. Cada capa tiene una responsabilidad específica y comunica solo con las capas adyacentes.

### Ventajas

- **Separación de responsabilidades:** Permite un desarrollo modular y facilita el mantenimiento, ya que cada capa tiene una función específica (como presentación, lógica de negocio y acceso a datos).
- **Facilidad de pruebas:** Cada capa puede probarse de forma independiente, lo que agiliza la detección y resolución de errores.
- **Reusabilidad:** Componentes o servicios en capas inferiores pueden ser reutilizados por otras partes de la aplicación.

### Desventajas

- **Posible pérdida de rendimiento:** La navegación a través de múltiples capas puede incrementar el tiempo de respuesta, especialmente en aplicaciones críticas en tiempo real.
- **Complejidad en grandes aplicaciones:** Puede volverse difícil de gestionar en sistemas muy complejos o con múltiples dependencias cruzadas.

Ejemplo: 

En una aplicación web típica, se usa una **arquitectura de tres capas**:

- **Capa de presentación:** Encargada de la interfaz de usuario.
- **Capa de lógica de negocio:** Contiene las reglas del negocio.
- **Capa de acceso a datos:** Gestiona la interacción con la base de datos

# Patrones de arquitectura. (MVC, Repository, Event Sourcing)

Los patrones de arquitecturas son la conceptualización de una solución genérica y reutilizable, que es aplicable a un problema de diseño de software en un contexto determinado para asi poder satisfacer las necesidades del negocio. 

Los patrones de arquitectura son la representación de las buenas practicas y estructura miento de los diseños ya probados, de modo que estas puedan reutilizarse. 

## Patrones de arquitectura MVC

Este patrón de arquitectura convierte el desarrollo de aplicaciones complejas en un proceso mucho mas manejable. Permitiendo a varios desarrolladores trabajar simultáneamente en la aplicación. 

- M=modelo
- V=vista
- C=controlador

Modelo: el backend que contiene toda la lógica de datos. Se encarga de los datos, que son consultados a la base de datos. Actualizaciones, consultas, búsquedas, etc.

Vista: Es el frontend o interfas grafica de los usuarios  (GUI). Se encarga también de la parte visual de los datos, aquí solo se encarga de mostrar datos al usuario. 

Controlador: Es el cerebro de la aplicación que controla como se muestra los datos. Se encarga de recibir las ordenes de los usuarios al igual que realiza las solicitudes de los datos al modelo y de comunicárselo a la parte de la vista

### ¿Por qué se lo debe usar?

El patrón MVC ayuda a dividir el código que son para frontend y el backend permitiéndonos facilitar la administración del proyecto. 

Dentro de esta arquitectura se usa muhco lo que es el la responsabilidad única, que es la parte de modificación ya sea del modelo o la vista no debe llegar a afectar a otras partes del código, como por ejemplo si se llega hacer una modificación en la base de datos que en este caso es el Modelo, esto no le afectara a la parte de la Vista ya que no cada patrón debe tener una responsabilidad. 

![image.png](../Estilos-y-Patrones/img/image.png)

## Repository

El patrón repository es un patrón de diseño para ubicar el acceso a datos en la capa externa de la aplicación y así mantener el dominio agnóstico a sus fuentes de datos (y sobre todo a su implementación).

![image.png](../Estilos-y-Patrones/img/image%201.png)

Ventajas: 

- **Migraciones**: No es frecuente, pero es común que las aplicaciones deban migrar su base de datos. El proceso se complica si hay código específico de la fuente de datos en toda la aplicación o atado a las reglas de negocio.
- **Múltiples fuentes de datos**: Es frecuente tener varias fuentes de datos en una aplicación. Puede haber diferentes bases de datos, almacenamiento de archivos o sistemas de terceros como CRM o motores de búsqueda.
- **Facilitar el testing**: Las pruebas de bases de datos requieren un entorno separado. Separar el acceso a datos del dominio ahorra configuración en la mayoría de pruebas.

Desventajas: 

**Desventajas:**

1. **Complejidad adicional:** El uso del patrón Repository puede agregar una capa adicional de complejidad a tu aplicación. Si tienes una aplicación pequeña o sencilla, puede resultar innecesario y complicar el desarrollo.
2. **Aumento de la cantidad de código:** Al implementar el patrón Repository, es probable que necesites escribir más código para definir y mantener los repositorios. Esto puede aumentar la cantidad de código en tu proyecto y, en consecuencia, aumentar el tiempo de desarrollo.
3. **Curva de aprendizaje:** Si no estás familiarizado con el patrón Repository o no tienes experiencia previa con él, puede llevar tiempo comprender cómo implementarlo correctamente en Laravel. Esto puede requerir un esfuerzo adicional en la curva de aprendizaje y la capacitación del equipo de desarrollo.
4. **Posible sobrecarga de abstracción:** Si el uso del patrón Repository se aplica en exceso o de manera incorrecta, puede llevar a una sobrecarga de abstracción. Esto podría resultar en un código más complejo de mantener y dificultar la comprensión de la lógica de acceso a datos.

## Event Sourcing

El patrón Event Sourcing define un enfoque para controlar las operaciones basado en una secuencia de eventos, cada uno de los cuales se registra en un almacén de solo anexar. El código de la aplicación envía una serie de eventos que imperativamente describen cada acción que se ha producido en los datos del almacén de eventos, donde se conservan. Cada evento representa un conjunto de cambios en los datos (como `AddedItemToOrder`).

![image.png](../Estilos-y-Patrones/img/image%202.png)

Ventajas: 

- Puede mejorar considerablemente el rendimiento y la escalabilidad de las aplicaciones, especialmente en el nivel de presentación o en la interfaz de usuario.
- Los eventos son objetos simples que describen alguna acción que se ha producido, junto con los datos asociados necesarios para describir la acción que representa el evento. El uso de eventos puede simplificar la implementación y la administración.
- Los eventos suelen tener significado para un experto de dominio, mientras que los errores de coincidencia de impedancia relacional de objetos pueden dificultar la comprensión de las tablas de base de datos complejas.

Desventajas: 

- El sistema solo será coherente al crear vistas materializadas o proyecciones de los datos mediante la reproducción de eventos.
- No hay ningún enfoque estándar ni mecanismos existentes como consultas SQL para leer los eventos y obtener información.

Si desea capturar la intención, el propósito o el motivo en los datos. Por ejemplo, los cambios en una entidad de cliente se pueden capturar como una serie de tipos de evento específicos como *Cambio de domicilio*, *Cierre de cuenta* o *Fallecimiento*.

Cuando necesite desacoplar el proceso de entrada o actualización de datos de las tareas necesarias para aplicar estas acciones. Este cambio se puede realizar para mejorar el rendimiento de la interfaz de usuario o para distribuir eventos a otros agentes de escucha que realicen acciones cuando se producen los eventos. 

# Patrones de Diseño

Los patrones de diseño son soluciones probadas para problemas comunes en el desarrollo de software. Están clasificados en tres categorías principales:

1. **Patrones creacionales:** Se centran en la creación de objetos.
2. **Patrones estructurales:** Se enfocan en la composición de clases y objetos para formar estructuras más grandes.
3. **Patrones de comportamiento:** Definen cómo los objetos interactúan entre sí.

# Patrones de Lenguaje

La relación entre los patrones de diseño y los lenguajes de programación radica en cómo se implementan. Por ejemplo:

- En Java, se usan interfaces y clases abstractas para patrones como Factory Method y Abstract Factory.
- En Python, la programación dinámica facilita la implementación de patrones como Proxy o Strategy.
- En C#, los patrones de comportamiento como Observer se implementan utilizando eventos y delegados.

# Patrones Creaciones

## Factory Method

Crea objetos sin especificar sus clases concretas.

Ejemplo en Python:

```python
from abc import ABC, abstractmethod

class Product(ABC):
    @abstractmethod
    def operation(self) -> str:
        pass

class ConcreteProductA(Product):
    def operation(self) -> str:
        return "ConcreteProductA"

class ConcreteProductB(Product):
    def operation(self) -> str:
        return "ConcreteProductB"

class Creator(ABC):
    @abstractmethod
    def factory_method(self) -> Product:
        pass

    def some_operation(self) -> str:
        product = self.factory_method()
        return f"Creator: The product is {product.operation()}"

class ConcreteCreatorA(Creator):
    def factory_method(self) -> Product:
        return ConcreteProductA()

class ConcreteCreatorB(Creator):
    def factory_method(self) -> Product:
        return ConcreteProductB()

# Uso
creator = ConcreteCreatorA()
print(creator.some_operation())

```

## Abstract Factory

Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.

Ejemplo en Python:

```python
from abc import ABC, abstractmethod

class AbstractFactory(ABC):
    @abstractmethod
    def create_product_a(self) -> str:
        pass

    @abstractmethod
    def create_product_b(self) -> str:
        pass

class ConcreteFactory1(AbstractFactory):
    def create_product_a(self) -> str:
        return "ProductA1"

    def create_product_b(self) -> str:
        return "ProductB1"

class ConcreteFactory2(AbstractFactory):
    def create_product_a(self) -> str:
        return "ProductA2"

    def create_product_b(self) -> str:
        return "ProductB2"

factory = ConcreteFactory1()
print(factory.create_product_a())

```

# Patrones Estructurales

## Adapter

Convierte la interfaz de una clase en otra que los clientes esperan.

```python
class Target:
    def request(self) -> str:
        return "Target: Default behavior"

class Adaptee:
    def specific_request(self) -> str:
        return "Adaptee: Specific behavior"

class Adapter(Target):
    def __init__(self, adaptee: Adaptee):
        self.adaptee = adaptee

    def request(self) -> str:
        return f"Adapter: ({self.adaptee.specific_request()})"

adaptee = Adaptee()
adapter = Adapter(adaptee)
print(adapter.request())

```

## Composite

Permite tratar objetos individuales y composiciones de manera uniforme.

```python
class Component:
    def operation(self) -> str:
        pass

class Leaf(Component):
    def operation(self) -> str:
        return "Leaf"

class Composite(Component):
    def __init__(self):
        self.children = []

    def add(self, component: Component):
        self.children.append(component)

    def operation(self) -> str:
        return f"Composite({', '.join([child.operation() for child in self.children])})"

tree = Composite()
tree.add(Leaf())
print(tree.operation())

```

## Proxy

Ejemplo: Un sistema que maneja documentos protegidos. Solo los usuarios pueden acceder al contenido del documento. 

Interfas: 

```java
public interface Documento {
    void mostrarContenido();
}
```

Implementación: 

```java
public class DocumentoReal implements Documento {
    private String contenido;

    public DocumentoReal(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrarContenido() {
        System.out.println("Contenido del documento: " + contenido);
    }
}
```

Clase Proxy:

```java
public class DocumentoProxy implements Documento {
    private DocumentoReal documentoReal;
    private String contenido;
    private boolean accesoPermitido;

    public DocumentoProxy(String contenido, boolean accesoPermitido) {
        this.contenido = contenido;
        this.accesoPermitido = accesoPermitido;
    }

    @Override
    public void mostrarContenido() {
        if (accesoPermitido) {
            if (documentoReal == null) {
                documentoReal = new DocumentoReal(contenido);
            }
            documentoReal.mostrarContenido();
        } else {
            System.out.println("Acceso denegado: No tienes permisos para ver este documento.");
        }
    }
}
```

Clase Main: 

```java
public class Main {
    public static void main(String[] args) {
        Documento documento1 = new DocumentoProxy("Documento confidencial", true);
        Documento documento2 = new DocumentoProxy("Documento público", false);

        System.out.println("Intentando acceder a documento 1:");
        documento1.mostrarContenido();

        System.out.println("Intentando acceder a documento 2:");
        documento2.mostrarContenido();
    }
}
```

Resultado: 

![image.png](../Estilos-y-Patrones/img/image%203.png)

## Facade

Ejemplo: 

Sistema de cine que incluye varios subsistemas para reproducir películas: encender el proyector, bajar las luces, configurar el sonido, y reproducir el video. El cliente necesita una forma sencilla de interactuar con todo esto. 

Sistemas individuales: 

```java
public class Proyector {
    public void encender() {
        System.out.println("Proyector encendido.");
    }

    public void apagar() {
        System.out.println("Proyector apagado.");
    }
}

public class Luces {
    public void bajarIntensidad() {
        System.out.println("Luces bajadas al nivel adecuado para la película.");
    }

    public void restaurarIntensidad() {
        System.out.println("Luces restauradas a nivel normal.");
    }
}

public class SistemaDeSonido {
    public void configurarSonido() {
        System.out.println("Sonido configurado en modo cine.");
    }

    public void apagarSonido() {
        System.out.println("Sistema de sonido apagado.");
    }
}

public class ReproductorDeVideo {
    public void reproducirPelicula(String pelicula) {
        System.out.println("Reproduciendo la película: " + pelicula);
    }

    public void detenerReproduccion() {
        System.out.println("Reproducción detenida.");
    }
}

```

Facade: 

```java
public class CineFacade {
    private Proyector proyector;
    private Luces luces;
    private SistemaDeSonido sonido;
    private ReproductorDeVideo reproductor;

    public CineFacade() {
        this.proyector = new Proyector();
        this.luces = new Luces();
        this.sonido = new SistemaDeSonido();
        this.reproductor = new ReproductorDeVideo();
    }

    public void comenzarPelicula(String pelicula) {
        System.out.println("Preparando el cine para la película...");
        luces.bajarIntensidad();
        proyector.encender();
        sonido.configurarSonido();
        reproductor.reproducirPelicula(pelicula);
        System.out.println("¡Disfruta la película!");
    }

    public void finalizarPelicula() {
        System.out.println("Finalizando la experiencia de cine...");
        reproductor.detenerReproduccion();
        proyector.apagar();
        sonido.apagarSonido();
        luces.restaurarIntensidad();
        System.out.println("¡Gracias por visitar el cine!");
    }
}

```

Main: 

```java
public class Main {
    public static void main(String[] args) {
        CineFacade cine = new CineFacade();

        System.out.println("Iniciando sesión de cine...");
        cine.comenzarPelicula("El Señor de los Anillos");

        System.out.println("\nTerminando sesión de cine...");
        cine.finalizarPelicula();
    }
}
```

Resultado: 

![image.png](../Estilos-y-Patrones/img/image%204.png)

# Patrones de Comportamiento

## Command

Ejemplo:  Encerder apagar la luz

Interfas: 

```java
public interface Command {
    void execute(); // Método que ejecuta el comando.
}
```

Receptor: 

```java
public class Luz {
    public void encender() {
        System.out.println("La luz está encendida.");
    }

    public void apagar() {
        System.out.println("La luz está apagada.");
    }
}
```

Clases encender y apagar: 

```java
public class EncenderLuzCommand implements Command {
    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.encender(); // Llama al método del receptor.
    }
}

public class ApagarLuzCommand implements Command {
    private Luz luz;

    public ApagarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar(); // Llama al método del receptor.
    }
}
```

Clase control: 

```java
public class ControlRemoto {
    private Command comando; // El comando a ejecutar.

    public void setComando(Command comando) {
        this.comando = comando; // Asignar el comando.
    }

    public void presionarBoton() {
        comando.execute(); // Ejecutar el comando asignado.
    }
}
```

Main: 

```java
public class Main {
    public static void main(String[] args) {
        // Receptor (Luz)
        Luz luz = new Luz();

        // Comandos concretos
        Command encender = new EncenderLuzCommand(luz);
        Command apagar = new ApagarLuzCommand(luz);

        // Invocador (Control remoto)
        ControlRemoto control = new ControlRemoto();

        // Asignar y ejecutar el comando para encender la luz
        System.out.println("Presionando botón para encender la luz:");
        control.setComando(encender);
        control.presionarBoton();

        // Asignar y ejecutar el comando para apagar la luz
        System.out.println("\nPresionando botón para apagar la luz:");
        control.setComando(apagar);
        control.presionarBoton();
    }
}
```

Salida: 

![image.png](../Estilos-y-Patrones/img/image%205.png)

## Observer

Ejemplo: 

Cuando cambia la temperatura, se notifica automáticamente a los observadores.

```java
// Clase Sujeto (Subject)
class WeatherData {
    constructor() {
        this.observers = []; // Lista de observadores
        this.temperature = 0;
    }

    // Suscribir un observador
    addObserver(observer) {
        this.observers.push(observer);
    }

    // Eliminar un observador
    removeObserver(observer) {
        this.observers = this.observers.filter(obs => obs !== observer);
    }

    // Notificar a todos los observadores
    notifyObservers() {
        this.observers.forEach(observer => observer.update(this.temperature));
    }

    // Cambiar la temperatura y notificar
    setTemperature(newTemperature) {
        this.temperature = newTemperature;
        this.notifyObservers();
    }
}

// Clase Observador (Observer)
class Display {
    constructor(name) {
        this.name = name;
    }

    // Método llamado cuando hay una actualización
    update(temperature) {
        console.log(`[${this.name}] La nueva temperatura es: ${temperature}°C`);
    }
}

// Uso del sistema
const weatherData = new WeatherData();

// Crear observadores
const phoneDisplay = new Display("PhoneDisplay");
const windowDisplay = new Display("WindowDisplay");

// Suscribir observadores
weatherData.addObserver(phoneDisplay);
weatherData.addObserver(windowDisplay);

// Cambiar la temperatura
console.log("Cambiando la temperatura a 25°C...");
weatherData.setTemperature(25);

console.log("\nCambiando la temperatura a 30°C...");
weatherData.setTemperature(30);

// Eliminar un observador
console.log("\nEliminando WindowDisplay...");
weatherData.removeObserver(windowDisplay);

console.log("\nCambiando la temperatura a 20°C...");
weatherData.setTemperature(20);
```

Salida: 

![image.png](../Estilos-y-Patrones/img/image%206.png)

## Strategy

Define una familia de algoritmos, encapsulándolos en clases separadas para que puedan ser intercambiables.

```python
class Strategy:
    def execute(self) -> str:
        pass

class ConcreteStrategyA(Strategy):
    def execute(self) -> str:
        return "Strategy A"

class ConcreteStrategyB(Strategy):
    def execute(self) -> str:
        return "Strategy B"

class Context:
    def __init__(self, strategy: Strategy):
        self.strategy = strategy

    def execute_strategy(self) -> str:
        return self.strategy.execute()

context = Context(ConcreteStrategyA())
print(context.execute_strategy())

```

# **Relación entre Patrones y Lenguajes de Programación**

Los patrones de diseño son soluciones comprobadas y reutilizables que resuelven problemas frecuentes en el desarrollo de software. Si bien estos patrones son independientes del lenguaje de programación, cada lenguaje los implementa de manera distinta según sus características y capacidades. Analizaremos cómo se aplican patrones específicos en Java, Python y C#, y qué ventajas ofrece su uso en estos lenguajes. 

## **Java y el Patrón Factory: La Creación Modular en Android**

El patrón **Factory** en Java se asemeja a la fabricación modular de componentes en **Android**, la plataforma móvil líder mundial. En Android, las **Activities** y **Fragments** se generan mediante una estructura estandarizada, permitiendo personalizaciones específicas para cada aplicación.

- **Ejemplo real: Creación de vistas en Android**

Android utiliza una fábrica central para gestionar la creación de vistas dinámicas en la interfaz de usuario. Los desarrolladores especifican el tipo de vista deseada (botones, cuadros de texto o listas), y el sistema asegura que cada componente se integre correctamente en el diseño de la aplicación.

1. **Encapsulación**: La lógica de generación de vistas permanece independiente de su implementación final, lo que optimiza la reutilización del código.
2. **Extensibilidad**: Los desarrolladores pueden incorporar nuevos tipos de vistas sin alterar la fábrica base.

**Paralelo con la realidad**: Se asemeja a una línea de producción automotriz donde cada modelo (vista) se ensambla con características específicas, siguiendo un proceso estandarizado.

Implementación en Java

```jsx
// Interfaz del producto
interface Product {
    void operation();
}

// Implementaciones concretas del producto
class ConcreteProduct1 implements Product {
    public void operation() {
        System.out.println("Operación del Producto 1");
    }
}

class ConcreteProduct2 implements Product {
    public void operation() {
        System.out.println("Operación del Producto 2");
    }
}

// Clase Factory
class ProductFactory {
    public Product createProduct(String type) {
        if (type.equalsIgnoreCase("1")) {
            return new ConcreteProduct1();
        } else if (type.equalsIgnoreCase("2")) {
            return new ConcreteProduct2();
        }
        return null;
    }
}
```

### Ventajas en Java

1. **Encapsulación de la creación de objetos**: El patrón Factory encapsula el proceso de creación de objetos, simplificando la gestión y mantenimiento del código.
2. **Flexibilidad y extensibilidad**: Permite añadir nuevos tipos de productos sin alterar el código existente, siguiendo el principio Open/Closed.
3. **Aprovechamiento del polimorfismo**: Java aprovecha su sistema de tipos estricto y orientación a objetos mediante interfaces y polimorfismo en la implementación del patrón Factory.
4. **Mejora de la modularidad**: Separa la lógica de creación de objetos de su implementación, resultando en un código más organizado y mantenible.

## **Python y el Patrón Singleton: Django y su Configuración Global**

El **Patrón Singleton** es fundamental en frameworks como **Django**, el popular marco de desarrollo web de Python. En Django, las configuraciones globales —como conexiones a bases de datos y ajustes del servidor— se administran mediante un único punto de acceso, lo que garantiza consistencia y eficiencia.

- **Ejemplo real: Gestor de configuraciones en Django**

El objeto settings de Django implementa el patrón Singleton de manera efectiva. Cada componente de la aplicación accede a este objeto único para consultar o modificar las configuraciones globales, incluyendo el motor de bases de datos y el middleware.

1. **Simplicidad**: Los desarrolladores trabajan con una única instancia del gestor de configuraciones.
2. **Consistencia**: Las configuraciones se mantienen uniformes en toda la aplicación.

**Paralelo de la vida real**: Funciona como el sistema eléctrico de un edificio, donde todos los apartamentos se conectan a una única fuente de energía central en lugar de usar generadores independientes.

Implementación en Python

```jsx
class Singleton:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
            cls._instance.config = {}
        return cls._instance

    def set_config(self, key, value):
        self.config[key] = value

    def get_config(self, key):
        return self.config.get(key)

# Uso
config1 = Singleton()
config1.set_config("database", "mysql")

config2 = Singleton()
print(config2.get_config("database"))  # Imprime: mysql
```

### Ventajas en Python

1. **Gestión eficiente de recursos**: El patrón Singleton en Python optimiza el manejo de recursos compartidos como configuraciones globales, eliminando instancias redundantes.
2. **Simplicidad de implementación**: La naturaleza dinámica de Python permite una implementación más elegante y concisa del Singleton, superando a lenguajes más rígidos.
3. **Consistencia en la configuración**: Asegura que toda la aplicación utilice la misma instancia de configuración, manteniendo la integridad del sistema.
4. **Flexibilidad en el acceso**: El dinamismo de Python permite modificar y acceder a la configuración durante la ejecución de manera fluida.

## **C# y el Patrón Observer: Model-View-Controller (MVC) en ASP.NET**

El **Patrón Observer** es fundamental en el diseño de interfaces reactivas, particularmente en el patrón **Model-View-Controller (MVC)** implementado en **ASP.NET**. En este framework, los **Views** (vistas) funcionan como observadores que responden automáticamente a las modificaciones en los **Models** (modelos).

- **Ejemplo real: Actualización dinámica en ASP.NET**

En una aplicación web [ASP.NET](http://ASP.NET), cuando se modifica un modelo, todas sus vistas asociadas se actualizan de forma instantánea. Esto garantiza que la información mostrada al usuario permanezca siempre sincronizada con el estado del sistema.

1. **Desacoplamiento**: Las vistas operan independientemente de la lógica de los modelos, limitándose a observar y reaccionar ante sus cambios.
2. **Eficiencia**: El sistema de notificaciones automáticas elimina la necesidad de actualizaciones manuales y comprobaciones innecesarias.

**Paralelo de la vida real**: Funciona como un sistema de información ferroviario, donde las estaciones reciben y muestran actualizaciones instantáneas sobre el estado de los trenes.

Implementación en C#

```jsx
using System;
using System.Collections.Generic;

// Interfaz para el sujeto (observable)
public interface ISubject
{
    void Attach(IObserver observer);
    void Detach(IObserver observer);
    void Notify();
}

// Interfaz para el observador
public interface IObserver
{
    void Update(string message);
}

// Implementación concreta del sujeto
public class ConcreteSubject : ISubject
{
    private List<IObserver> _observers = new List<IObserver>();
    private string _state;

    public string State
    {
        get { return _state; }
        set
        {
            _state = value;
            Notify();
        }
    }

    public void Attach(IObserver observer)
    {
        _observers.Add(observer);
    }

    public void Detach(IObserver observer)
    {
        _observers.Remove(observer);
    }

    public void Notify()
    {
        foreach (var observer in _observers)
        {
            observer.Update(_state);
        }
    }
}

// Implementación concreta del observador
public class ConcreteObserver : IObserver
{
    private string _name;

    public ConcreteObserver(string name)
    {
        _name = name;
    }

    public void Update(string message)
    {
        Console.WriteLine($"{_name} recibió notificación: {message}");
    }
}
```

### Ventajas en C#

1. **Desacoplamiento efectivo**: El patrón Observer en C# separa claramente el sujeto de los observadores, lo que facilita la extensión y el mantenimiento del código.
2. **Soporte nativo para eventos**: C# incluye un sistema de eventos integrado que complementa naturalmente al patrón Observer, simplificando su implementación.
3. **Tipado fuerte**: El sistema de tipos de C# detecta errores relacionados con el patrón Observer durante la compilación, evitando fallos en tiempo de ejecución.
4. **Integración con LINQ**: La compatibilidad con LINQ permite gestionar las colecciones de observadores de forma elegante y eficiente.

## **Ventajas del Uso de Patrones Específicos en Diferentes Lenguajes**

1. **Adaptabilidad a las características del lenguaje**: Cada lenguaje posee fortalezas únicas que los patrones pueden aprovechar. La implementación del Singleton en Python, por ejemplo, resulta más concisa gracias a su naturaleza dinámica.
2. **Mejora en la calidad del código**: Los patrones fomentan las buenas prácticas de programación, generando código más limpio, mantenible y reutilizable en cualquier lenguaje.
3. **Facilitación de la comunicación entre desarrolladores**: Los patrones crean un vocabulario común entre programadores, sin importar el lenguaje que utilicen.
4. **Optimización del rendimiento**: La implementación de ciertos patrones puede optimizarse en lenguajes específicos, aprovechando sus características particulares para mejorar el desempeño.
5. **Flexibilidad en el diseño**: Los patrones proporcionan soluciones adaptables a diversos requisitos y escenarios en diferentes lenguajes de programación.

## **Ventajas y Desventajas de Estilos y Patrones Seleccionados**

## Ventajas

1. **Reutilización de código**: Los patrones de diseño permiten aprovechar soluciones comprobadas, reduciendo el tiempo de desarrollo y la probabilidad de errores.
2. **Escalabilidad**: Permiten expandir los sistemas de manera eficiente sin alterar significativamente su estructura fundamental.
3. **Mantenibilidad**: El uso de estructuras estandarizadas facilita la comprensión y el mantenimiento del código para todo el equipo de desarrollo.
4. **Robustez**: Al estar probados y perfeccionados extensivamente, los patrones garantizan soluciones más estables y fiables.
5. **Flexibilidad**: Facilitan la adaptación del software a nuevos requerimientos de manera ágil y eficiente.

## Desventajas

1. **Complejidad inicial**: La implementación de patrones puede incrementar la complejidad del código, especialmente para desarrolladores novatos.
2. **Sobreaplicación**: Existe el riesgo de implementar patrones sin necesidad real, lo que resulta en un diseño innecesariamente complejo.
3. **Curva de aprendizaje**: El dominio de los patrones de diseño exige tiempo y práctica considerable, lo que puede retrasar el desarrollo inicial.
4. **Rendimiento**: Algunos patrones pueden generar una pequeña sobrecarga en el rendimiento, aunque por lo general es insignificante.
5. **Rigidez potencial**: Una implementación inadecuada de los patrones puede resultar en estructuras rígidas difíciles de modificar.

## Bibliografía:

*Arquitectura de microservicios: ejemplos y conceptos claves*. (n.d.). https://www.pragma.co/es/blog/que-es-un-microservicio-conceptos-claves-y-ejemplos

Cuervo, V. (2024, July 22). Arquitectura Basada en Eventos (EDA). *Arquitecto IT*. https://arquitectoit.com/eda/arquitectura-basada-en-eventos-eda/

*Event-driven architecture (EDA)*. (n.d.). https://reactiveprogramming.io/blog/es/estilos-arquitectonicos/eda

Gomez, C. (2024, October 1). *Qué es la arquitectura cliente servidor y cómo funciona*. Daemon4. https://www.daemon4.com/empresa/noticias/arquitectura-cliente-servidor/

Moraguez, E. R. (2024, October 7). *Microservicios: ventajas y desafíos en su arquitectura*. LovTechnology. https://lovtechnology.com/microservicios-ventajas-y-desafios-en-su-arquitectura/

Juandc. (2023, 16 junio). *¿Qué es el Patrón Repository para Arquitecturas Limpias?* Platzi. https://platzi.com/blog/patron-repository/
RobBagby. (s. f.-b). *Patrón Event Sourcing - Azure Architecture Center*. Microsoft Learn. https://learn.microsoft.com/es-es/azure/architecture/patterns/event-sourcing