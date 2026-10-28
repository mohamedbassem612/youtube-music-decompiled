package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aois extends aihn implements aiis {
    public static final aihw a = new aiat(18);
    public static final aois b;
    public int c;
    public String d = "";
    public aihv e = emptyIntList();

    static {
        aois aoisVar = new aois();
        b = aoisVar;
        aihn.registerDefaultInstance(aois.class, aoisVar);
    }

    private aois() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"c", "d", "e", aotj.n});
        }
        if (iOrdinal == 3) {
            return new aois();
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
        return aihn.getParserForClass(aois.class);
    }
}
