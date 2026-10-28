package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arno extends aihn implements aiis {
    public static final arno a;
    public int b;
    public arnn c;
    public arnm d;
    public apnh e;
    public apne f;

    static {
        arno arnoVar = new arno();
        a = arnoVar;
        aihn.registerDefaultInstance(arno.class, arnoVar);
    }

    private arno() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\bဉ\u0007\rဉ\b", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new arno();
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
        return aihn.getParserForClass(arno.class);
    }
}
