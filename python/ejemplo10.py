# Encuentra el primer producto que necesita reposición.
from datos import productos

resultado = next(filter(lambda p: p.stock < 10, productos), None)
print(resultado)
