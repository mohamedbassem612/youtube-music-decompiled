package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apeo extends aihn implements aiis {
    public static final apeo a;
    public int b;
    public apen c;
    public int d;
    public int e;
    public int f;

    static {
        apeo apeoVar = new apeo();
        a = apeoVar;
        aihn.registerDefaultInstance(apeo.class, apeoVar);
    }

    private apeo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", apep.a, "e", apep.d, "f", apdr.e});
        }
        if (iOrdinal == 3) {
            return new apeo();
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
        return aihn.getParserForClass(apeo.class);
    }
}
