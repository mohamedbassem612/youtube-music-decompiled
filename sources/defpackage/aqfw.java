package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqfw extends aihn implements aiis {
    public static final aqfw a;
    public int b;
    public int c;
    public aivn d;
    private int e;

    static {
        aqfw aqfwVar = new aqfw();
        a = aqfwVar;
        aihn.registerDefaultInstance(aqfw.class, aqfwVar);
    }

    private aqfw() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0005ဉ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqfw();
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
        return aihn.getParserForClass(aqfw.class);
    }
}
