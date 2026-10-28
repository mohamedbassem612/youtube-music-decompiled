package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atxd extends aihn implements aiis {
    public static final atxd a;
    public int b = 0;
    public Object c;

    static {
        atxd atxdVar = new atxd();
        a = atxdVar;
        aihn.registerDefaultInstance(atxd.class, atxdVar);
    }

    private atxd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", atxi.class, atxg.class, atxh.class, atxj.class, atxc.class, atxe.class, atxf.class});
        }
        if (iOrdinal == 3) {
            return new atxd();
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
        return aihn.getParserForClass(atxd.class);
    }
}
