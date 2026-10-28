package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armc extends aihn implements aiis {
    public static final armc a;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        armc armcVar = new armc();
        a = armcVar;
        aihn.registerDefaultInstance(armc.class, armcVar);
    }

    private armc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u00027\u0000\u00034\u0000\u0004:\u0000\u0005;\u0000\u0006=\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f5\u0000", new Object[]{"d", "c", "b", "e", arlk.class, arlr.class, armb.class, armr.class, arlt.class});
        }
        if (iOrdinal == 3) {
            return new armc();
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
        return aihn.getParserForClass(armc.class);
    }
}
