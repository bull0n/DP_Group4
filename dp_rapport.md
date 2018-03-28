
# TP1 - Rapport

## Composite

## Singleton

Concernant la classe "Config", il a été demandé de la transformer en singleton.

Voici le code ajouté à la classe que nous avons reçu :

```java
// Constructeur privé afin de ne pas pouvoir le créer
// autrement que par "getConfig()"
private Config() {
   this.propertyFileName = CONFIG_FILE;
   load();
}

// Function statique permettant de créer une instance de Config si elle
// n'est pas encore existante
public static Config getConfig() {
   if (Config.instance == null) {
      Config.instance = new Config();
   }
   return Config.instance;
}

// Instance unique de notre classe "Config"
// De plus, on stocke le nom du fichier sous forme de constante
private static Config instance = null;
private static final String CONFIG_FILE = "config.properties";
```

Ce pattern nous permet de nous assurer qu'une seule et unique instance sera disponible. De plus, cette façon de faire permet d'avoir accès à l'instance à partir de n'importe quel endroit du code (un genre de variable global en somme).
C'est d'ailleurs pour cette dernière raison que certains programmeurs ne sont pas très enthousiastes concernant ce patron de conception.

De plus, il n'est pas possible de définir le nom de fichier dans la méthode getConfig() car cela n'aurait pas de sens. Une fois la première instance créé avec un certain nom de fichier, le prochain appel ne prendrais pas en compte un nouveau nom de fichier. C'est pourquoi nous avons décidé de mettre un nom de fichier en static.

En conclusion, nous pensons que ce patron de conception peut être bien utile. Cependant il faut l'utiliser avec parcimonie et avoir de bonnes raisons pour l'utiliser.
