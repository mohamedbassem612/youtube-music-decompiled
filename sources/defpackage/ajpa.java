package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajpa extends aihn implements aiis {
    public static final ajpa a;
    public int b;
    public String c = "";
    public aijp d;
    public boolean e;
    public int f;

    static {
        ajpa ajpaVar = new ajpa();
        a = ajpaVar;
        aihn.registerDefaultInstance(ajpa.class, ajpaVar);
    }

    private ajpa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", ajhd.r});
        }
        if (iOrdinal == 3) {
            return new ajpa();
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
        return aihn.getParserForClass(ajpa.class);
    }
}
