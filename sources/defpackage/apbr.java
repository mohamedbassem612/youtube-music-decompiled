package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbr extends aihn implements aiis {
    public static final apbr a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int e;

    static {
        apbr apbrVar = new apbr();
        a = apbrVar;
        aihn.registerDefaultInstance(apbr.class, apbrVar);
    }

    private apbr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003%\u0003\u0000\u0000\u0000\u0003ဇ\u001b\u001bဇ\u0016%ဇ\u0005", new Object[]{"e", "d", "c", "b"});
        }
        if (iOrdinal == 3) {
            return new apbr();
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
        return aihn.getParserForClass(apbr.class);
    }
}
