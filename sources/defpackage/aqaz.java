package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqaz extends aihn implements aiis {
    public static final aqaz a;
    public static final aihl b;
    public int c;
    public int d;
    private int e;

    static {
        aqaz aqazVar = new aqaz();
        a = aqazVar;
        aihn.registerDefaultInstance(aqaz.class, aqazVar);
        b = aihn.newSingularGeneratedExtension(akkc.a, aqazVar, aqazVar, null, 1000, aika.MESSAGE, aqaz.class);
    }

    private aqaz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"e", "c", akux.l, "d", akjs.d});
        }
        if (iOrdinal == 3) {
            return new aqaz();
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
        return aihn.getParserForClass(aqaz.class);
    }
}
