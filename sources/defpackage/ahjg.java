package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahjg extends aihn implements aiis {
    public static final ahjg a;
    public int b;
    public int c;
    public int d;

    static {
        ahjg ahjgVar = new ahjg();
        a = ahjgVar;
        aihn.registerDefaultInstance(ahjg.class, ahjgVar);
    }

    private ahjg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ahjg();
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
        return aihn.getParserForClass(ahjg.class);
    }
}
