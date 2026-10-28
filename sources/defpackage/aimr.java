package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aimr extends aihn implements aiis {
    public static final aimr a;
    public int b;
    public aims c;
    public aims d;
    public float e;

    static {
        aimr aimrVar = new aimr();
        a = aimrVar;
        aihn.registerDefaultInstance(aimr.class, aimrVar);
    }

    private aimr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ခ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aimr();
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
        return aihn.getParserForClass(aimr.class);
    }
}
