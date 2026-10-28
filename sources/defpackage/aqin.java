package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqin extends aihn implements aiis {
    public static final aqin a;
    public boolean b;
    public int c;
    public int d;
    private int e;

    static {
        aqin aqinVar = new aqin();
        a = aqinVar;
        aihn.registerDefaultInstance(aqin.class, aqinVar);
    }

    private aqin() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aqin();
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
        return aihn.getParserForClass(aqin.class);
    }
}
