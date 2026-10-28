package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aknj extends aihn implements aiis {
    public static final aknj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        aknj aknjVar = new aknj();
        a = aknjVar;
        aihn.registerDefaultInstance(aknj.class, aknjVar);
    }

    private aknj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = alip.f;
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", aihtVar, "e", aihtVar, "f", alip.e, "g"});
        }
        if (iOrdinal == 3) {
            return new aknj();
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
        return aihn.getParserForClass(aknj.class);
    }
}
