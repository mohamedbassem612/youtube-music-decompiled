package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pym extends aihn implements aiis {
    public static final pym a;
    public int b;
    public long d;
    public boolean e;
    public int f;
    public int i;
    public boolean l;
    public String c = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        pym pymVar = new pym();
        a = pymVar;
        aihn.registerDefaultInstance(pym.class, pymVar);
    }

    private pym() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0002\u0004\u0007\u0005\f\u0006Ȉ\u0007Ȉ\b\f\tȈ\nȈ\u000b\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (iOrdinal == 3) {
            return new pym();
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
        return aihn.getParserForClass(pym.class);
    }
}
