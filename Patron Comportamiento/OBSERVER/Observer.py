class Subject:
    def __init__(self):
        self.observers = []  # Lista de observadores

    def add_observer(self, observer):
        self.observers.append(observer)

    def remove_observer(self, observer):
        self.observers.remove(observer)

    def notify_observers(self):
        for observer in self.observers:
            observer.update(self)
class Observer:
    def update(self, subject):
        pass  # Método que será implementado por los observadores
class WeatherData(Subject):
    def __init__(self):
        super().__init__()
        self._temperature = 0

    @property
    def temperature(self):
        return self._temperature

    @temperature.setter
    def temperature(self, value):
        self._temperature = value
        self.notify_observers()  # Notifica a los observadores cuando cambia la temperatura
class PhoneDisplay(Observer):
    def update(self, subject):
        print(f"[PhoneDisplay] Nueva temperatura: {subject.temperature}°C")

class WindowDisplay(Observer):
    def update(self, subject):
        print(f"[WindowDisplay] Actualización: {subject.temperature}°C")
if __name__ == "__main__":
    # Crear el sujeto (WeatherData)
    clima = WeatherData()

    # Crear observadores
    phone_display = PhoneDisplay()
    window_display = WindowDisplay()

    # Suscribir observadores al sujeto
    clima.add_observer(phone_display)
    clima.add_observer(window_display)

    # Cambiar la temperatura y notificar a los observadores
    print("Cambiando la temperatura a 25°C...")
    clima.temperature = 25

    print("\nCambiando la temperatura a 30°C...")
    clima.temperature = 30

    # Eliminar un observador
    print("\nEliminando WindowDisplay...")
    clima.remove_observer(window_display)

    print("\nCambiando la temperatura a 20°C...")
    clima.temperature = 20
