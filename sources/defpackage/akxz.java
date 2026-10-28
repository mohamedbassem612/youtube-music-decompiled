package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akxz extends aihn implements aiis {
    public static final akxz a;
    public int b = 0;
    public Object c;

    static {
        akxz akxzVar = new akxz();
        a = akxzVar;
        aihn.registerDefaultInstance(akxz.class, akxzVar);
    }

    private akxz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", akyb.class});
        }
        if (iOrdinal == 3) {
            return new akxz();
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
        return aihn.getParserForClass(akxz.class);
    }
}
