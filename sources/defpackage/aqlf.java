package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqlf extends aihn implements aiis {
    public static final aqlf a;
    public int b;
    public int c;
    public int d;

    static {
        aqlf aqlfVar = new aqlf();
        a = aqlfVar;
        aihn.registerDefaultInstance(aqlf.class, aqlfVar);
    }

    private aqlf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqlf();
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
        return aihn.getParserForClass(aqlf.class);
    }
}
