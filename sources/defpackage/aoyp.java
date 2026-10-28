package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoyp extends aihn implements aiis {
    public static final aihw a = new aiat(20);
    public static final aihw b = new apej(1);
    public static final aoyp c;
    public aihv d = emptyIntList();
    public aihv e = emptyIntList();

    static {
        aoyp aoypVar = new aoyp();
        c = aoypVar;
        aihn.registerDefaultInstance(aoyp.class, aoypVar);
    }

    private aoyp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001ࠬ\u0002ࠬ", new Object[]{"d", aqcj.j, "e", aqcj.k});
        }
        if (iOrdinal == 3) {
            return new aoyp();
        }
        if (iOrdinal == 4) {
            return new aihf(c);
        }
        if (iOrdinal == 5) {
            return c;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aoyp.class);
    }
}
