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
