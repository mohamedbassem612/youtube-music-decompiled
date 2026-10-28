package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akqs extends aihn implements aiis {
    public static final akqs a;
    public int b = 0;
    public Object c;

    static {
        akqs akqsVar = new akqs();
        a = akqsVar;
        aihn.registerDefaultInstance(akqs.class, akqsVar);
    }

    private akqs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0011\u0001\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"c", "b", akql.class, akpv.class, akpw.class, akpr.class, akqm.class, akqr.class, akpt.class, akqd.class, akqq.class, akpz.class, akqg.class, akpu.class, akqb.class, akqj.class, akqn.class, akqo.class, akpq.class});
        }
        if (iOrdinal == 3) {
            return new akqs();
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
        return aihn.getParserForClass(akqs.class);
    }
}
