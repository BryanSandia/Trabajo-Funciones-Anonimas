# Empareja productos y descuentos por posición.
from datos import productos

descuentos = [10.0, 5.0, 8.0, 12.0, 15.0, 20.0]
resultado = list(zip(productos, descuentos))
print([(p.nombre, descuento) for p, descuento in resultado])
