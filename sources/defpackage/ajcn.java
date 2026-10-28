package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajcn extends aihn implements aiis {
    public static final ajcn a;
    public boolean b;
    private int c;

    static {
        ajcn ajcnVar = new ajcn();
        a = ajcnVar;
        aihn.registerDefaultInstance(ajcn.class, ajcnVar);
    }

    private ajcn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new ajcn();
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
        return aihn.getParserForClass(ajcn.class);
    }
}
