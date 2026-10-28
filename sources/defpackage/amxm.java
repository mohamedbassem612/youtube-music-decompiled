package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxm extends aihn implements aiis {
    public static final amxm a;
    public int b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public amwt g;
    public boolean h;
    public int i;
    public amxg j;
    public String k = "";
    public long l;
    public amxg m;

    static {
        amxm amxmVar = new amxm();
        a = amxmVar;
        aihn.registerDefaultInstance(amxm.class, amxmVar);
    }

    private amxm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\b᠌\u0007\tဉ\b\nဈ\t\u000bဂ\n\fဉ\u000b", new Object[]{"b", "c", amys.i, "d", amys.a, "e", "f", "g", "h", "i", amys.h, "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new amxm();
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
        return aihn.getParserForClass(amxm.class);
    }
}
