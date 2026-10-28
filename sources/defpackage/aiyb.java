package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiyb extends aihn implements aiis {
    public static final aiyb a;
    public int b = 0;
    public Object c;

    static {
        aiyb aiybVar = new aiyb();
        a = aiybVar;
        aihn.registerDefaultInstance(aiyb.class, aiybVar);
    }

    private aiyb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0013\u0001\u0000\u0001\u0013\u0013\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000", new Object[]{"c", "b", aiyg.class, aiyl.class, aiyh.class, aiyj.class, aiyi.class, aizo.class, aiyy.class, aiyp.class, aiyf.class, aiym.class, aiya.class, aiyk.class, aixw.class, aixy.class, aiyz.class, aizl.class, aiyd.class, aiyc.class, aiyn.class});
        }
        if (iOrdinal == 3) {
            return new aiyb();
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
        return aihn.getParserForClass(aiyb.class);
    }
}
