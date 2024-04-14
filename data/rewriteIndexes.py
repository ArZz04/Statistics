import pandas as pd

# Lee el archivo CSV
df = pd.read_csv('../data/ltickets.csv')

# Convierte la columna 'Amount' de str a int
df['Amount'] = df['Amount'].astype(float)

# Imprime el DataFrame para verificar los cambios
print(df)

df.to_csv('new.csv', index=False)
