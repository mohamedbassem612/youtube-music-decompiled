package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akft extends aihn implements aiis {
    public static final akft a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        akft akftVar = new akft();
        a = akftVar;
        aihn.registerDefaultInstance(akft.class, akftVar);
    }

    private akft() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new akft();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akft.class);
            default:
                return null;
        }
    }
}
