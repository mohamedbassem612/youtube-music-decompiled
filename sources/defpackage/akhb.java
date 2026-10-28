package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akhb extends aihn implements aiis {
    public static final akhb a;
    public int b = 0;
    public Object c;
    public alcu d;
    public aigj e;
    public String f;
    private int g;

    static {
        akhb akhbVar = new akhb();
        a = akhbVar;
        aihn.registerDefaultInstance(akhb.class, akhbVar);
    }

    private akhb() {
        aigj aigjVar = aigj.d;
        this.e = aigj.d;
        this.f = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001=\u0000\u0002;\u0000\u0005ဉ\u0001\u0006ည\u0004\b;\u0000\t<\u0000\n;\u0000\u000bဈ\u0005", new Object[]{"c", "b", "g", "d", "e", akhp.class, "f"});
        }
        if (iOrdinal == 3) {
            return new akhb();
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
        return aihn.getParserForClass(akhb.class);
    }
}
