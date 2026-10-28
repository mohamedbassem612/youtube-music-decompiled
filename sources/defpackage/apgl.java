package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apgl extends aihn implements aiis {
    public static final apgl a;
    public int b;
    public apgi c;
    public apgm d;
    public apgn e;
    public int f;

    static {
        apgl apglVar = new apgl();
        a = apglVar;
        aihn.registerDefaultInstance(apgl.class, apglVar);
    }

    private apgl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", apep.l});
        }
        if (iOrdinal == 3) {
            return new apgl();
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
        return aihn.getParserForClass(apgl.class);
    }
}
