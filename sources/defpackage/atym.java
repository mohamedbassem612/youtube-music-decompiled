package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atym extends aihn implements aiis {
    public static final atym a;
    public int b = 0;
    public Object c;

    static {
        atym atymVar = new atym();
        a = atymVar;
        aihn.registerDefaultInstance(atym.class, atymVar);
    }

    private atym() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", atyg.class, atyk.class, atyl.class, atyo.class, atyi.class, atyj.class});
        }
        if (iOrdinal == 3) {
            return new atym();
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
        return aihn.getParserForClass(atym.class);
    }
}
