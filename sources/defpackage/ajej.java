package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajej extends aihn implements aiis {
    public static final ajej a;
    public int b;
    public int c;
    public String d = "";
    public aqih e;

    static {
        ajej ajejVar = new ajej();
        a = ajejVar;
        aihn.registerDefaultInstance(ajej.class, ajejVar);
    }

    private ajej() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0004ဉ\u0004", new Object[]{"b", "c", aixp.p, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ajej();
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
        return aihn.getParserForClass(ajej.class);
    }
}
