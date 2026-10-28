package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajeu extends aihn implements aiis {
    public static final ajeu a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;

    static {
        ajeu ajeuVar = new ajeu();
        a = ajeuVar;
        aihn.registerDefaultInstance(ajeu.class, ajeuVar);
    }

    private ajeu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = amyr.i;
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004᠌\u0004\u0005᠌\u0005\bဇ\u0007\nဇ\t\u000bင\n", new Object[]{"b", "c", "d", "e", "f", aihtVar, "g", aihtVar, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ajeu();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(ajeu.class);
    }
}
