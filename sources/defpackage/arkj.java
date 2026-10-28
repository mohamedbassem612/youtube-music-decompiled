package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arkj extends aihn implements aiis {
    public static final aihw a = new apej(9);
    public static final arkj b;
    public aihv c = emptyIntList();
    public String d = "";
    private int e;

    static {
        arkj arkjVar = new arkj();
        b = arkjVar;
        aihn.registerDefaultInstance(arkj.class, arkjVar);
    }

    private arkj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠬ\u0002ဈ\u0000", new Object[]{"e", "c", arke.e, "d"});
        }
        if (iOrdinal == 3) {
            return new arkj();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(arkj.class);
    }
}
