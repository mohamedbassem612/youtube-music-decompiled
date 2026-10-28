package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alvj extends aihn implements aiis {
    public static final alvj a;
    public int b = 0;
    public Object c;

    static {
        alvj alvjVar = new alvj();
        a = alvjVar;
        aihn.registerDefaultInstance(alvj.class, alvjVar);
    }

    private alvj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000ﶞ㑃ﶞ㑃\u0001\u0000\u0000\u0000ﶞ㑃<\u0000", new Object[]{"c", "b", aonx.class});
        }
        if (iOrdinal == 3) {
            return new alvj();
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
        return aihn.getParserForClass(alvj.class);
    }
}
