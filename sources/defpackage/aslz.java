package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aslz extends aihn implements aiis {
    public static final aslz a;
    public int b;
    public int c;

    static {
        aslz aslzVar = new aslz();
        a = aslzVar;
        aihn.registerDefaultInstance(aslz.class, aslzVar);
    }

    private aslz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", asmm.b});
        }
        if (iOrdinal == 3) {
            return new aslz();
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
        return aihn.getParserForClass(aslz.class);
    }
}
