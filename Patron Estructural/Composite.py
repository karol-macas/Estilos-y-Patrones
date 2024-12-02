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
