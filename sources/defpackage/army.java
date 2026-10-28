package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class army extends aihn implements aiis {
    public static final army a;
    public int b;
    public String c = "";
    public int d;

    static {
        army armyVar = new army();
        a = armyVar;
        aihn.registerDefaultInstance(army.class, armyVar);
    }

    private army() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", albk.m});
        }
        if (iOrdinal == 3) {
            return new army();
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
        return aihn.getParserForClass(army.class);
    }
}
