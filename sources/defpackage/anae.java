package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anae extends aihn implements aiis {
    public static final anae a;
    public int b;
    public int d;
    public boolean e;
    public int f;
    public int h;
    public anaf i;
    public String c = "";
    public String g = "";

    static {
        anae anaeVar = new anae();
        a = anaeVar;
        aihn.registerDefaultInstance(anae.class, anaeVar);
    }

    private anae() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0004\u0003᠌\u0005\u0004ဉ\u0006\u0005᠌\u0001\u0006᠌\u0003\u0007ဇ\u0002", new Object[]{"b", "c", "g", "h", amys.r, "i", "d", amys.q, "f", amys.u, "e"});
        }
        if (iOrdinal == 3) {
            return new anae();
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
        return aihn.getParserForClass(anae.class);
    }
}
