package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amix extends aihn implements aiis {
    public static final amix a;
    public int b;
    public String c = "";
    public String d = "";
    public long e;
    public long f;
    public amji g;
    public int h;
    public int i;
    public int j;

    static {
        amix amixVar = new amix();
        a = amixVar;
        aihn.registerDefaultInstance(amix.class, amixVar);
    }

    private amix() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဉ\u0005\u0006င\u0006\u0007င\u0007\n᠌\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", allf.m});
        }
        if (iOrdinal == 3) {
            return new amix();
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
        return aihn.getParserForClass(amix.class);
    }
}
