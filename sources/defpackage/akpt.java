package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akpt extends aihn implements aiis {
    public static final akpt a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public boolean f;
    public boolean g;
    public akps h;

    static {
        akpt akptVar = new akpt();
        a = akptVar;
        aihn.registerDefaultInstance(akpt.class, akptVar);
    }

    private akpt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002᠌\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0005\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"b", "c", aram.u, "d", "e", "h", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new akpt();
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
        return aihn.getParserForClass(akpt.class);
    }
}
