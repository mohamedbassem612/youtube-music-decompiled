package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxr extends aihn implements aiis {
    public static final afxr a;
    public int b;
    public int c;

    static {
        afxr afxrVar = new afxr();
        a = afxrVar;
        aihn.registerDefaultInstance(afxr.class, afxrVar);
    }

    private afxr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new afxr();
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
        return aihn.getParserForClass(afxr.class);
    }
}
