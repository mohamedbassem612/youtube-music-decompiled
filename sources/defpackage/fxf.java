package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxf extends aihn implements aiis {
    public static final fxf a;
    public int b;
    public boolean d;
    public long c = 100;
    public long e = 1000;

    static {
        fxf fxfVar = new fxf();
        a = fxfVar;
        aihn.registerDefaultInstance(fxf.class, fxfVar);
    }

    private fxf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new fxf();
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
        return aihn.getParserForClass(fxf.class);
    }
}
