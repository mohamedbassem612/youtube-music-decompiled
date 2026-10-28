package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxb extends aihn implements aiis {
    public static final ajxb a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int g;

    static {
        ajxb ajxbVar = new ajxb();
        a = ajxbVar;
        aihn.registerDefaultInstance(ajxb.class, ajxbVar);
    }

    private ajxb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0012\u0019\u0005\u0000\u0000\u0000\u0012ဇ\f\u0015ဇ\u000f\u0016ဇ\u0012\u0018ဇ\u0010\u0019ဇ\u0011", new Object[]{"g", "b", "c", "f", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajxb();
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
        return aihn.getParserForClass(ajxb.class);
    }
}
