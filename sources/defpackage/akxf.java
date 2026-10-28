package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akxf extends aihn implements aiis {
    public static final aihw a = new aiat(9);
    public static final akxf b;
    public String c = "";
    public aihv d = emptyIntList();
    private int e;

    static {
        akxf akxfVar = new akxf();
        b = akxfVar;
        aihn.registerDefaultInstance(akxf.class, akxfVar);
    }

    private akxf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"e", "c", "d", akux.i});
        }
        if (iOrdinal == 3) {
            return new akxf();
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
        return aihn.getParserForClass(akxf.class);
    }
}
