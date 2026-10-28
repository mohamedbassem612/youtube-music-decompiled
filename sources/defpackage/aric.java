package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aric extends aihn implements aiis {
    public static final aric a;
    public int b;
    public boolean c;

    static {
        aric aricVar = new aric();
        a = aricVar;
        aihn.registerDefaultInstance(aric.class, aricVar);
    }

    private aric() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aric();
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
        return aihn.getParserForClass(aric.class);
    }
}
