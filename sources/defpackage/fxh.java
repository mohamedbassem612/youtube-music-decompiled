package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxh extends aihn implements aiis {
    public static final fxh a;
    public int b;
    public long c = -1;
    public int d = 1000;
    public int e = 1000;

    static {
        fxh fxhVar = new fxh();
        a = fxhVar;
        aihn.registerDefaultInstance(fxh.class, fxhVar);
    }

    private fxh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            aiht aihtVar = fxi.d;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", aihtVar, "e", aihtVar});
        }
        if (iOrdinal == 3) {
            return new fxh();
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
        return aihn.getParserForClass(fxh.class);
    }
}
