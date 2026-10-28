package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aizg extends aihn implements aiis {
    public static final aizg a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        aizg aizgVar = new aizg();
        a = aizgVar;
        aihn.registerDefaultInstance(aizg.class, aizgVar);
    }

    private aizg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t᠌\u0001\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", aiwd.t, aizi.class, aizh.class, aizf.class, aizd.class, aize.class, aiye.class, aizc.class, "f", aiwd.s, aiza.class, aizb.class, aixv.class, aixu.class, aizp.class, aixt.class});
        }
        if (iOrdinal == 3) {
            return new aizg();
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
        return aihn.getParserForClass(aizg.class);
    }
}
