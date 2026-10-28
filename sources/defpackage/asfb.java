package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asfb extends aihn implements aiis {
    public static final asfb a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        asfb asfbVar = new asfb();
        a = asfbVar;
        aihn.registerDefaultInstance(asfb.class, asfbVar);
    }

    private asfb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", asel.c, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new asfb();
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
        return aihn.getParserForClass(asfb.class);
    }
}
