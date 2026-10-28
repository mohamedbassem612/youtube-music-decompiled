package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class agzm extends aihn implements aiis {
    public static final agzm a;
    public int b;
    public agzn c;
    public aihv d;

    static {
        agzm agzmVar = new agzm();
        a = agzmVar;
        aihn.registerDefaultInstance(agzm.class, agzmVar);
    }

    private agzm() {
        emptyProtobufList();
        this.d = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004ࠞ", new Object[]{"b", "c", "d", agzi.i});
        }
        if (iOrdinal == 3) {
            return new agzm();
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
        return aihn.getParserForClass(agzm.class);
    }
}
