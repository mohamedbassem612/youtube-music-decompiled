package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjc extends aihn implements aiis {
    public static final ahjc a;
    public int b;
    public int c;
    public int d;

    static {
        ahjc ahjcVar = new ahjc();
        a = ahjcVar;
        aihn.registerDefaultInstance(ahjc.class, ahjcVar);
    }

    private ahjc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahjc();
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
        return aihn.getParserForClass(ahjc.class);
    }
}
