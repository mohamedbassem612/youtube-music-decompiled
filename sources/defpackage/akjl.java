package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjl extends aihn implements aiis {
    public static final akjl a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        akjl akjlVar = new akjl();
        a = akjlVar;
        aihn.registerDefaultInstance(akjl.class, akjlVar);
    }

    private akjl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0006ဇ\u0005\tဇ\b\fဇ\u000b\r᠌\f\u000eဇ\r\u0010ဇ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", ajhk.r, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new akjl();
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
        return aihn.getParserForClass(akjl.class);
    }
}
