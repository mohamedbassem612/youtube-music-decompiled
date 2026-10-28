package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxs extends aihn implements aiis {
    public static final amxs a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public amwt f;
    public boolean g;
    public int h;
    public amxg i;
    public String j = "";
    public long k;
    public amxg l;

    static {
        amxs amxsVar = new amxs();
        a = amxsVar;
        aihn.registerDefaultInstance(amxs.class, amxsVar);
    }

    private amxs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0007᠌\u0006\bဉ\u0007\tဈ\b\nဂ\t\u000bဉ\n", new Object[]{"b", "c", amys.i, "d", amys.a, "e", "f", "g", "h", amys.h, "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new amxs();
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
        return aihn.getParserForClass(amxs.class);
    }
}
