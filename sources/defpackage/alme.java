package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alme extends aihn implements aiis {
    public static final alme a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alme almeVar = new alme();
        a = almeVar;
        aihn.registerDefaultInstance(alme.class, almeVar);
    }

    private alme() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001c\u0001\u0000ث\uedb1יִ\u0006\u001c\u0000\u0000\u001cثм\u0000ࣗм\u0000\ue7f5ណм\u0000\uf597ᣚм\u0000\ue9fdᮽм\u0000\ue592᯦м\u0000\uece4Ỽм\u0000\uf11e⠗м\u0000\uebb5ⴛм\u0000\uf3f6㑄м\u0000\ue422㢒м\u0000\ue5f1㢩м\u0000\uf5a4㧕м\u0000ﲿ䘟м\u0000\uf492䤳м\u0000\uf59d䫛м\u0000\ue214佨м\u0000\ued56凤м\u0000\uef90勀м\u0000\uf812憡м\u0000\uf175援м\u0000\ue09d甹м\u0000\ue12e睴м\u0000ﱿ銹м\u0000\ue559\ua63eм\u0000\ue209큇м\u0000\ueb5a힕м\u0000\uedb1יִ\u0006м\u0000", new Object[]{"c", "b", ajpp.class, aokz.class, apoq.class, almk.class, almj.class, angn.class, almh.class, akvu.class, akxx.class, aqol.class, aqom.class, aqxn.class, aqjx.class, aqpy.class, akrn.class, anzg.class, amho.class, akvt.class, anzf.class, akir.class, anrz.class, aqys.class, aqww.class, amzk.class, amtg.class, aqwh.class, ajtf.class, ajaq.class});
            case 3:
                return new alme();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alme.class);
            default:
                return null;
        }
    }
}
