package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akfp extends aihn implements aiis {
    public static final akfp a;
    public int b;
    public int c;
    public aihu d = emptyFloatList();
    private int e;

    static {
        akfp akfpVar = new akfp();
        a = akfpVar;
        aihn.registerDefaultInstance(akfp.class, akfpVar);
    }

    private akfp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003$", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new akfp();
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
        return aihn.getParserForClass(akfp.class);
    }
}
