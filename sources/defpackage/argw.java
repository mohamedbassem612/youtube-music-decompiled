package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class argw extends aihn implements aiis {
    public static final argw a;
    public int b;
    public long c;
    public float d;
    public float e;
    public float f;
    public int g;

    static {
        argw argwVar = new argw();
        a = argwVar;
        aihn.registerDefaultInstance(argw.class, argwVar);
    }

    private argw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", aomi.l});
        }
        if (iOrdinal == 3) {
            return new argw();
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
        return aihn.getParserForClass(argw.class);
    }
}
