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
