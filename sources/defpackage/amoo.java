package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amoo extends aihn implements aiis {
    public static final amoo a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int h;

    static {
        amoo amooVar = new amoo();
        a = amooVar;
        aihn.registerDefaultInstance(amoo.class, amooVar);
    }

    private amoo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0003\u0012\u0006\u0000\u0000\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0006ဇ\u0004\rဇ\b\u000eဇ\t\u0012ဇ\n", new Object[]{"h", "b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new amoo();
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
        return aihn.getParserForClass(amoo.class);
    }
}
