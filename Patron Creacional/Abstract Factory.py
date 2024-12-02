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
