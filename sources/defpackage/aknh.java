package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aknh extends aihn implements aiis {
    public static final aknh a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aknh aknhVar = new aknh();
        a = aknhVar;
        aihn.registerDefaultInstance(aknh.class, aknhVar);
    }

    private aknh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", "d", alip.d, "e"});
        }
        if (iOrdinal == 3) {
            return new aknh();
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
        return aihn.getParserForClass(aknh.class);
    }
}
