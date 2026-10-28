package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afxz extends aihn implements aiis {
    public static final afxz a;
    public String b = "";
    public float c;

    static {
        afxz afxzVar = new afxz();
        a = afxzVar;
        aihn.registerDefaultInstance(afxz.class, afxzVar);
    }

    private afxz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new afxz();
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
        return aihn.getParserForClass(afxz.class);
    }
}
