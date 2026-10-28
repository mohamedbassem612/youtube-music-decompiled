package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqed extends aihn implements aiis {
    public static final aqed a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public aigj f = aigj.d;

    static {
        aqed aqedVar = new aqed();
        a = aqedVar;
        aihn.registerDefaultInstance(aqed.class, aqedVar);
    }

    private aqed() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0002\u0003ည\u0003\u0004ဈ\u0001", new Object[]{"b", "c", aqcj.p, "e", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new aqed();
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
        return aihn.getParserForClass(aqed.class);
    }
}
