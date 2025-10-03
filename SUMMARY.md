# Árvore AVL
É uma árvore binária de busca que se **auto balanceia** utilizando um **fator de balanceamento**.  

Se fatorBalanceamento estiver fora do conjunto [-1, 0, 1] é necessária aplicar uma rotação. Segue exemplo do cálculo do fator de balanceamento: 
```
fatorBalanceamento = (alturaFilhoEsquerdo) - (alturaFilhoDireito)
```

## Rotações

### Simples à direita (LL)

Causa: Inserção na subárvore esquerda do filho esquerdo. 30 -> 20 -> **10**  
Correção: Rotação no 30. Vira filho direito do filho esquerdo dele

---

### Simples à esquerda (RR)

Causa: Inserção na subárvore direita do filho direito. 10 -> 20 -> **30**  
Correção: Rotação no 10. Vira filho esquerdo do filho direito dele

---

### Dupla à direita (LR)

Causa: Inserção na subárvore direita do filho esquerdo. 30 -> 10 -> **20**  
Correção: Rotação simples à esquerda no filho (10). Rotação simples à direita no 30

---

### Dupla à esquerda (RL)

Causa: Inserção na subárvore esquerda do filho direito. 10 -> 30 -> **20**  
Correção: Rotação simples à direita no filho (30). Rotação simples à esquerda no 10


# Árvore Rubro Negra
Também é uma árvore binária de busca autobalanceada porém **utiliza duas cores distintas em cada nó**. 
As regras durante a inserção e remoção são seguidas através das cores (no caso será **vermelho e preto**) e, se forem violadas é aplicado uma rotação

## Terminologias
- Nó avô
  - Pai do pai do último nó inserido

-  Nó tio
  - Filho oposto do avô

- Nó nulo
  - O oposto do filho de um nó onde o pai só tem um filho
 
- Nó externo
  - Quando o nó inserido é maior que o pai

- Nó interno
  - Quando o nó inserido é menor que o pai
 
## Regras
- Todo nó é vermelho ou preto
- A raiz é sempre preta
- Se um nó for vermelho, seus filhos devem ser pretos
- Todo caminho da raiz para uma folha, ou para um filho nulo, tem que conter o mesmo número de nós pretos

## Regras para inserção

| Situação pós inserção | Caso    | Ação |
|------------------------|---------|------|
| Pai é preto | Válido | – |
| Pai vermelho, tio vermelho | Recoloração | Recolorir o pai e o tio para preto; avô vira vermelho. Se isso causar violação acima, continuar subindo |
| Pai vermelho, tio preto, nó é filho externo (valor inserido maior que o pai) | Externo | Fazer **rotação simples** no avô + recoloração |
| Pai vermelho, tio preto, nó é filho interno (valor inserido menor que o pai) | Interno | Fazer **rotação dupla** (pai e avô) + recoloração |
