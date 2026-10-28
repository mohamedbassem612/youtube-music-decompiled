package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akgz extends aihn implements aiis {
    public static final akgz a;
    public int b;
    public boolean c;
    public int d;
    private int e;

    static {
        akgz akgzVar = new akgz();
        a = akgzVar;
        aihn.registerDefaultInstance(akgz.class, akgzVar);
    }

    private akgz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"e", "b", ajzp.p, "c", "d", akux.k});
        }
        if (iOrdinal == 3) {
            return new akgz();
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
        return aihn.getParserForClass(akgz.class);
    }
}
