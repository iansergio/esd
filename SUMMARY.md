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
