package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajgs extends aihn implements aiis {
    public static final ajgs a;
    public int b = 0;
    public Object c;

    static {
        ajgs ajgsVar = new ajgs();
        a = ajgsVar;
        aihn.registerDefaultInstance(ajgs.class, ajgsVar);
    }

    private ajgs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002;\u0000\u0003;\u0000\u0004;\u0000\u0005;\u0000\u0006;\u0000\u0007;\u0000\b;\u0000\t;\u0000\n;\u0000\u000b;\u0000\f<\u0000\r;\u0000", new Object[]{"c", "b", ajgr.class, atqm.class});
        }
        if (iOrdinal == 3) {
            return new ajgs();
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
        return aihn.getParserForClass(ajgs.class);
    }
}
