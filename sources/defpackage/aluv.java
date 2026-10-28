package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluv extends aihn implements aiis {
    public static final aluv a;
    public int b;
    public aogd c;

    static {
        aluv aluvVar = new aluv();
        a = aluvVar;
        aihn.registerDefaultInstance(aluv.class, aluvVar);
    }

    private aluv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue359ᢐ\ue359ᢐ\u0001\u0000\u0000\u0000\ue359ᢐဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aluv();
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
        return aihn.getParserForClass(aluv.class);
    }
}
