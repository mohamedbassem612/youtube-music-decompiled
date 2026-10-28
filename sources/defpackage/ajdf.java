package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdf extends aihn implements aiis {
    public static final ajdf a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private int j;

    static {
        ajdf ajdfVar = new ajdf();
        a = ajdfVar;
        aihn.registerDefaultInstance(ajdf.class, ajdfVar);
    }

    private ajdf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\tဇ\b\fဇ\f", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new ajdf();
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
        return aihn.getParserForClass(ajdf.class);
    }
}
