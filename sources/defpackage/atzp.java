package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atzp extends aihn implements aiis {
    public static final atzp a;
    public int b;
    public aigj c;
    public int d;
    public int e;

    static {
        atzp atzpVar = new atzp();
        a = atzpVar;
        aihn.registerDefaultInstance(atzp.class, atzpVar);
    }

    private atzp() {
        emptyProtobufList();
        this.c = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004ည\u0002\u0007ဋ\u0005\nဋ\b", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atzp();
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
        return aihn.getParserForClass(atzp.class);
    }
}
