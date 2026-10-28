package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonh extends aihn implements aiis {
    public static final aonh a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public aoni i;
    public aoni j;
    public boolean k;

    static {
        aonh aonhVar = new aonh();
        a = aonhVar;
        aihn.registerDefaultInstance(aonh.class, aonhVar);
    }

    private aonh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u0013\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0005\u0003င\u0001\u0007င\u0004\bဇ\t\u000bဉ\u000b\fဉ\f\u0012ဇ\n\u0013ဇ\u0011", new Object[]{"b", "c", "f", "d", "e", "g", "i", "j", "h", "k"});
        }
        if (iOrdinal == 3) {
            return new aonh();
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
        return aihn.getParserForClass(aonh.class);
    }
}
