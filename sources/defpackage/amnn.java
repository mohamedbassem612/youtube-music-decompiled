package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amnn extends aihn implements aiis {
    public static final amnn a;
    public int b;
    public boolean c;
    public aigu d;
    public boolean e;
    public String f = "";
    public boolean g;

    static {
        amnn amnnVar = new amnn();
        a = amnnVar;
        aihn.registerDefaultInstance(amnn.class, amnnVar);
    }

    private amnn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new amnn();
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
        return aihn.getParserForClass(amnn.class);
    }
}
