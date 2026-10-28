package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akve extends aihn implements aiis {
    public static final akve a;
    public int b;
    public long c;
    public int d;
    public aigj e;
    public aigj f;

    static {
        akve akveVar = new akve();
        a = akveVar;
        aihn.registerDefaultInstance(akve.class, akveVar);
    }

    private akve() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ည\u0003\u0004ဂ\u0000\u0005᠌\u0001\u0006ည\u0002", new Object[]{"b", "f", "c", "d", akvb.c, "e"});
        }
        if (iOrdinal == 3) {
            return new akve();
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
        return aihn.getParserForClass(akve.class);
    }
}
