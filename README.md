# Projecte-Gestio-Biblioteca

##  Descripció

Aquest projecte consisteix en el desenvolupament d'un sistema de gestió d'una biblioteca utilitzant Java i Programació Orientada a Objectes (POO).
L'objectiu és gestionar llibres, usuaris i operacions com afegir, buscar i eliminar llibres.

##  Treball realitzat

En aquest projecte he desenvolupat principalment:

* Classe **Llibre** → atributs del llibre (títol, autor, estat)
* Classe **Biblioteca** → gestió dels llibres (afegir, buscar, eliminar)
* Mètodes de cerca:

  * Cerca normal
  * Cerca sense accents
  * Llistar llibres disponibles

També he treballat amb Git i GitHub per gestionar el projecte en equip.

##  Funcionalitats

* Afegir llibres a la biblioteca
* Buscar llibres per títol
* Buscar llibres ignorant majúscules/minúscules
* Buscar llibres sense accents
* Eliminar llibres
* Llistar tots els llibres

## Procés amb Git i GitHub

Durant el projecte he seguit aquests passos:

1. Creació del repositori a GitHub
2. Inicialització del projecte amb:

   * `git init`
3. Afegir fitxers:

   * `git add .`
4. Crear commit:

   * `git commit -m "Proyecto biblioteca inicial"`
5. Connexió amb el repositori remot:

   * `git remote add origin URL`
6. Pujar el projecte:

   * `git push -u origin main`
7. Creació de branca personal:

   * `git checkout -b Fatima`
8. Treball en la branca i pujada:

   * `git push origin Fatima`

## Problemes trobats i solucions

Durant el desenvolupament he tingut diversos problemes:

###  Error: "repository not found"

* Causa: URL incorrecta del repositori
* Solució: corregir l'enllaç amb `/` correcte

---

###  Error: "rejected (fetch first)"

* Causa: el repositori remot tenia fitxers (README)
* Solució:

  * `git pull origin main --allow-unrelated-histories`

---

###  Error: "pathspec did not match"

* Causa: la branca no existia en local
* Solució:

  * `git fetch`
  * `git checkout -b Fatima origin/Fatima`

---

###   Error: "refusing to merge unrelated histories"

* Causa: historials diferents entre branques
* Solució:

  * `git merge main --allow-unrelated-histories`

---

###   Problema amb l'editor (pantalla negra)

* Causa: Git obre editor per confirmar merge
* Solució:

  * `ESC`
  * escriure `:wq`
  * ENTER


##  Treball en equip

El projecte s'ha desenvolupat en grup:

* Cada persona treballava en una branca diferent
* Jo he treballat en la branca **Fatima**
* La meva companya en una altra branca
* Després hem unit el treball amb **Pull Request** i **Merge**


##  Merge final

Per unir el treball:

1. Crear Pull Request (Fatima → main)
2. Fer Merge
3. Confirmar Merge
4. Repetir amb la branca de la companya

##  Resultat final

* Projecte complet en la branca `main`
* Codi unificat
* Treball en equip funcional

##  Aprenentatges

Aquest projecte m'ha ajudat a entendre:

* Programació Orientada a Objectes (POO)
* Funcionament de Git i GitHub
* Treball amb branques
* Resolució d'errors
* Treball en equip

##  Autores

* Fatima
* Loubna

>>>>>>> 000f6bc5644411c28dfbfb5b073bcbd57579c972
