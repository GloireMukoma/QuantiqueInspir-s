package com.example.challengeapp.datasource;

public class DataSource {
    private String[] titreCroisSeulement = {
            "Crois seulement", "Grace etonnante", "Ils viennent", "Je l'aime", "Moment de prière", "Ho! combien j'aime Jesus",
            "Quand les rachetes s'y assembleront", "Ho! Je desire le voir", "Nous nous sentons si bien",
            "Apprends moi Seigneur a attendre", "Allulua, Nous ressusciterons", "Portons une couronne", "Merveilleuse grace",
            "Mont sion", "Nous marchons vers sion", "Purifie moi", "Mes brebis connaissent ma voix", "En avant soldats chretiens",
            "Parlons de Jesus", "Quand notre seigneur reviendra", "C'est la bataille", "Victoire en Jesus", "Ma foi regarde a toi",
            "Vivant par la foi", "J'abandonne", "Quand j'atteindrai cette cité", "Plus tard", "Remplis-moi d'amour", "J'ai résolu",
            "Lieux plus hauts", "Debout sur les promesses", "Dans peu de temps", "Rocher d'ages", "Quand je verrai le sang",
            "L'amour m'a sauvé", "Pluie de bénédiction", "Comme tu veux", "Attire-moi plus pres", "Je suis marqué",
            "Ne serait-ce pas merveilleux ?", "Sur les ailes d'une colombe", "J'ai envi d'y aller", "Viens diner", "Dieun nous conduit",
            "Reposant sur les bras eternels", "Lumiere", "Je sais en qui j'ai cru", "Apportant les fruits", "Un matin doré",
            "Pourrons nous a la rivière", "Gloire à son nom", "Il m'a sorti", "Bientot dans la douceur", "'Y a une fontaine",
            "Oh! quel precieux amour", "Jesus ne faillit", "Hymne de bataille de la république", "Amen!", "L'itinerant predicateur",
            "Chaque pas sur la route", "Je ne chancelle pas", "Hier, aujourd'hui, pour toujours", "L'ancien évangile",
            "Embarquez", "Là de l'autre coté", "Eclaire moi", "Etre comme lui", "Ta fidélité est grande", "Ouvre mes yeux pour que je vois",
            "Il est toute chose pour moi", "Je sais c'etait le sang", "Oh! veux-tu veiller avec moi ?", "Oh! oui, je triomphe",
            "Esprit du Dieu vivant", "Que la beauté de Jesus", "Enfermer avec Dieu", "Tourne ton regard vers Jesus", "Nous rendrons gloire à jesus",
            "Inonde mon ame", "Ami de Jesus", "Jesus est le seul", "Il vient de nouveau", "Le lys de la vallée", "Il prend soin de toi",
            "Quand j'atteindrai la fin", "Place a la croix", "Quand l'appel rétentira", "Le port de répos", "Jesus doit-il seul porter sa croix",
            "Beni soit le nom", "J'irai jusqu'au bout", "Parle, mon seigneur", "L'amour de Dieu", "La rencontre", "Il ruisselle de sang",
            "Saint, saint, saint", "Ce monde ne peut me lier", "Retour de notre seigneur", "Je le reconnaitrai", "Puis jesus vint",
            "Quand je contemple la croix", "Par l'eau", "N'oubliez pas la prière en famille", "Etre sur ce roc", "Oh! j'aime cet homme de galilee",
            "Tends la main et touche le seigneur", "Dans cette cité", "Jesus m'a affranchi", "Quand je m'en irai en vacance", "Oh! c'est Jesus",
            "Et alors ?", "La foi en jehovah", "Laisse-les", "Je peux crois, je croirai", "N'est-il pas merveilleux ?", "Le bateau de sauvetage",
            "Il coulera comme une rivière", "Le grand jugement", "J'ai traverser le voile fendu", "Il y a de la place à la fontaine",
            "Viens, allons", "Juste un autre toucher seigneur", "La cité blanche de perles", "Marcher plus près de toi", "Le message de sa vénue",
            "Les brébis de son père", "Es-tu lavé dans le sang ?", "Jesu m'aime", "Baptisé dans le corps", "C'est comme le ciel pour moi",
            "Que donneras-tu en échange ?", "Un merveilleux temps", "Quand il tendit sa main vers moi", "Ramene-les", "Que tu es grand!",
            "L'ancienne puissance", "Il y a force dans le sang", "Le roc solide", "Il demeure", "Rachete", "Rien que le sang de Jesus", "Jesus la lumière du monde",
            "Quand nous verrons Jesus", "Plus blanc que la neige", "Acclamez tous la puissance du nom de jesus", "A la croix", "Le grand je suis",
            "Presque persuader", "Point de déception", "Quel beau jour", "L'un d'entre eux", "Je serai quelque part", "La semaine de retour à la maison",
            "Tel que je suis", "Paix dans la vallée", "Grand est le seigneur", "Mon ancre est en jesus", "Le soleil couche", "Un enfant roi",
            "Tiens l'immuable main de Dieu", "Le jour de la redemption", "Confie-toi seulement", "Un jour!", "Descends, doux chariot",
            "Quand sonnéront les cloches", "Quand tous nous serons au ciel", "La veille croix rigueuse", "Ou il me conduit", "Merveilleux",
            "Ou irai-je ?", "Merveilleux paix", "Le soleil ne se couchera jamais", "Je me mis a genoux et criai <<Saint!>>",
            "Quand les saints entreront", "Je veux etre chretien", "Assurance bénie", "La nuée et le feu", "Je ne passerai le joudain seul",
            "Doucement et tendrement", "Près de toi", "Y a t-il pour toi des rivières ?", "Là-bas nous ne vieillirons jamais", "Elevez-Le",
            "Terre de l'epouse", "Le seigneur m'a sauver", "Rassemblant les gerbes", "Quel amour merveilleux!", "Il descendit de sa gloire",
            "Je te rencontrerai à l'aube", "Il t'observe", "Derriere le rideau du temps", "Du miel sur le roc", "Le christ devoilé",
            "Jesus brise toute chaine", "C'est le seigneur de gloire", "Je le louerai", "il y a un grand jour qui vient", "Il vient bientot",
            "Quel ami !", "Je vais à la terre promise", "Le grand medecin", "Je dois dire à jesus", "Rien ne separe", "Quel jour ce sera!",
            "Près de la croix", "Ne m'oublie pas", "Je vois un flot", "Viens au festin", "Seigneur, je reviens", "La porte de l'Est",
            "Jesus paya le tout", "Je crois en Dieu", "Nous travaillerons jusqu'a ce que jesus vienne", "Les fenetres du ciel", "Précieux souvenirs",
            "Le temps de la fin", "Ce n'est pas secret", "Qu'il est grand notre Dieu!", "Ainsi sois fidele", "Beni soit le lien", "Dieu soit avec nous",
            "Prends avec toi le nom de jesus", "Je m'envolerai", "Plus près de Toi, mon Dieu", "Prends ma main", "Ma richesse, ma gloire"

    };
    private String[] hozannaTitre = {
            "Grand Dieu", "Nous Te benissons", "Gloire, gloire a l'eternel", "Je veux chanter", "louer mon Dieu",
            "Jesus, jesu, jesus", "A Dieu soit la gloire", "A celui qui nous a léver", "Mon sauveur souffrit sur la croix",
            "Nous t'adorons", "je l'ai trouvé", "Les rayons, de l'amour divin", "Etre à tes pieds comme marie", "Jesus sort de la tombe",
            "Tu m'as aimer, seigneur", "Roi couvert de blessures", "Agneau de Dieu, messager", "Jesus-christ est la sagesse",
            "Bien loin de toi, mon pere", "O vous qui n'avez pas la paix", "Le maitre est la qui t'appelle", "Ou trouver une traitre",
            "Toi dont l'ame es tourmentée", "Viens, viens a Jesus!", "Il va finir, le beau jour", "O toi qui souffres solitaire",
            "Aujourd'hui jesus t'appelle", "Viens, ame perdus", "Tous mes pechés", "A la croix ou mourut", "O! pecheur hesitant",
            "Pauvre enfant, au bord", "O mon Dieu, dans ma souffrance", "O jour heureux", "Tel que je suis", "Seigneur ta grace m'appelle",
            "Je suis sauvé!", "Misericorde insondable", "Torrent d'amour et de grâce", "Aujourd'hui tu m'appelles", "Il m'a sauver",
            "Seigneur! du sein de la poussière", "O seigneur, benis la parole", "Pour triompher dans les combats", "Romps-nous le pain de vie",
            "A tes pieds, ô divin maitre", "Oh! que ton joug est facile!", "Mon ame en silence", "Que ta lumière", "Deja l'étoile", "Jesus, ta sainte presence",
            "Seigneur, ce que je reclame", "Grace infinie!", "Toi qui disposes", "O mon sauveur", "Demeure par ta grace", "Seigneur, tu donnes ta grace",
            "Priez toujours, priez sans cesse", "Le cri de mon ame", "La voix de christ nous appelle", "Prends ma vie...", "Precieux jesus, je t'aime",
            "Divin sauveur...", "Ma vie enfin je te donne", "Jesus, je te suivrai partout", "A toi, mon Dieu", "Entre tes mains j'abandonne",
            "Au pieds de la croix", "Seul refuse de mon ame", "Es-tu lasse, rempli de tristesse ?", "Pecheur, je voudrais te guerir", "Pour moi chretien"
    };
    private String[] autrestqTitre = {
            "Crois seulement", "Grace etonnante", "Ils viennent", "Je l'aime", "Moment de prière", "Ho! combien j'aime Jesus",
            "Quand les rachetes s'y assembleront", "Ho! Je desire le voir", "Nous nous sentons si bien",
            "Apprends moi Seigneur a attendre", "Allulua, Nous ressusciterons", "Portons une couronne",
            "Crois seulement", "Grace etonnante", "Ils viennent", "Je l'aime", "Moment de prière", "Ho! combien j'aime Jesus",
            "Apprends moi Seigneur a attendre", "Allulua, Nous ressusciterons", "Portons une couronne",
    };
    private String dataMusic = "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Impedit reprehenderit";
    public DataSource(){

    }

    public String[] getTitreCroisSeulement() {
        return titreCroisSeulement;
    }

    public void setTitreCroisSeulement(String[] titre) {
        this.titreCroisSeulement = titre;
    }

    public String getDataMusic() {
        return dataMusic;
    }

    public void setDataMusic(String dataMusic) {
        this.dataMusic = dataMusic;
    }

    public String[] getHozannaTitre() {
        return hozannaTitre;
    }

    public void setHozannaTitre(String[] hozannaTitre) {
        this.hozannaTitre = hozannaTitre;
    }

    public String[] getAutrestqTitre() {
        return autrestqTitre;
    }

    public void setAutrestqTitre(String[] autrestq) {
        this.autrestqTitre = autrestq;
    }
}
