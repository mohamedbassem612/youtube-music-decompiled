package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class argy extends aihn implements aiis {
    public static final argy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    private int g;

    static {
        argy argyVar = new argy();
        a = argyVar;
        aihn.registerDefaultInstance(argy.class, argyVar);
    }

    private argy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u000f\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0006\u000eဇ\r\u000fခ\u000e", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new argy();
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
        return aihn.getParserForClass(argy.class);
    }
}
