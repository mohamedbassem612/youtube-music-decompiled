package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqle extends aihn implements aiis {
    public static final aqle a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aqle aqleVar = new aqle();
        a = aqleVar;
        aihn.registerDefaultInstance(aqle.class, aqleVar);
    }

    private aqle() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = aqkp.e;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", aihtVar, "d", aihtVar, "e", aihtVar});
        }
        if (iOrdinal == 3) {
            return new aqle();
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
        return aihn.getParserForClass(aqle.class);
    }
}
