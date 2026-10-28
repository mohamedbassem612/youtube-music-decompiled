package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apgg extends aihn implements aiis {
    public static final apgg a;
    public int b = 0;
    public Object c;

    static {
        apgg apggVar = new apgg();
        a = apggVar;
        aihn.registerDefaultInstance(apgg.class, apggVar);
    }

    private apgg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"c", "b", aoiw.class, aoix.class, aoje.class, aoiy.class, aoiz.class, aojb.class, aojg.class, aojd.class, aoja.class, aojh.class, aoji.class, aojc.class, aoiv.class});
        }
        if (iOrdinal == 3) {
            return new apgg();
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
        return aihn.getParserForClass(apgg.class);
    }
}
