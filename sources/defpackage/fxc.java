package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxc extends aihn implements aiis {
    public static final fxc a;
    public int b;
    public boolean c;
    public int d = 5000;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        fxc fxcVar = new fxc();
        a = fxcVar;
        aihn.registerDefaultInstance(fxc.class, fxcVar);
    }

    private fxc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new fxc();
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
        return aihn.getParserForClass(fxc.class);
    }
}
