package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpt extends aihn implements aiis {
    public static final atpt a;
    public int b;
    public int c;
    public aiip d = aiip.a;
    public long e;

    static {
        atpt atptVar = new atpt();
        a = atptVar;
        aihn.registerDefaultInstance(atpt.class, atptVar);
    }

    private atpt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001᠌\u0000\u00022\u0003ဂ\u0001", new Object[]{"b", "c", aqvi.n, "d", new ahud(aika.STRING, "", aika.MESSAGE, atps.a), "e"});
        }
        if (iOrdinal == 3) {
            return new atpt();
        }
        if (iOrdinal == 4) {
            return new aihf((short[][][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(atpt.class);
        }
        return null;
    }
}
