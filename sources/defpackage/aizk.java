package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aizk extends aihn implements aiis {
    public static final aizk a;
    public int b;
    public int c;
    public int d;
    public int e = 1;
    public aizj f;
    public int g;

    static {
        aizk aizkVar = new aizk();
        a = aizkVar;
        aihn.registerDefaultInstance(aizk.class, aizkVar);
    }

    private aizk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0003\u0005᠌\u0005\u0006᠌\u0001\bင\u0002", new Object[]{"b", "c", aixp.b, "f", "g", aiwd.i, "d", aixp.d, "e"});
        }
        if (iOrdinal == 3) {
            return new aizk();
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
        return aihn.getParserForClass(aizk.class);
    }
}
