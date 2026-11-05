from dataclasses import dataclass


@dataclass(frozen=True)
class Producto:
    nombre: str
    categoria: str
    precio: float
    stock: int
