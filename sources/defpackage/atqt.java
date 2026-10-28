package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atqt extends aihn implements aiis {
    public static final atqt a;
    public int b;
    public String c = "";
    public aimy d;

    static {
        atqt atqtVar = new atqt();
        a = atqtVar;
        aihn.registerDefaultInstance(atqt.class, atqtVar);
    }

    private atqt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new atqt();
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
        return aihn.getParserForClass(atqt.class);
    }
}
