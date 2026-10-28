package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amco extends aihn implements aiis {
    public static final amco a;
    public int b;
    public Object d;
    public aixs e;
    public int c = 0;
    public aigj f = aigj.d;

    static {
        amco amcoVar = new amco();
        a = amcoVar;
        aihn.registerDefaultInstance(amco.class, amcoVar);
    }

    private amco() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004ဉ\u0001\u0005ည\u0002\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"d", "c", "b", amcn.class, amcp.class, "e", "f", amcj.class, amcv.class, amcl.class, amci.class, amcg.class, amcf.class, amcq.class, amct.class, amck.class, amcr.class, amcm.class, amch.class, amcu.class});
        }
        if (iOrdinal == 3) {
            return new amco();
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
        return aihn.getParserForClass(amco.class);
    }
}
