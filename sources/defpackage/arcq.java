package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arcq extends aihn implements aiis {
    public static final arcq a;
    public int b;
    public int c = 4;
    public int d = 4;
    public int e = 1;

    static {
        arcq arcqVar = new arcq();
        a = arcqVar;
        aihn.registerDefaultInstance(arcq.class, arcqVar);
    }

    private arcq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = ajzp.f;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", aihtVar, "d", aihtVar, "e", ajzp.g});
        }
        if (iOrdinal == 3) {
            return new arcq();
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
        return aihn.getParserForClass(arcq.class);
    }
}
