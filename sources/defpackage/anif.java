package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anif extends aihn implements aiis {
    public static final anif a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private amkt f;
    private ajwo g;
    private byte h = 2;

    static {
        anif anifVar = new anif();
        a = anifVar;
        aihn.registerDefaultInstance(anif.class, anifVar);
    }

    private anif() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new anif();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anif.class);
            default:
                return null;
        }
    }
}
