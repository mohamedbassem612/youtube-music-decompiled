package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atot extends aihn implements aiis {
    public static final atot a;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    private int f;

    static {
        atot atotVar = new atot();
        a = atotVar;
        aihn.registerDefaultInstance(atot.class, atotVar);
    }

    private atot() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဈ\u0001\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new atot();
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
        return aihn.getParserForClass(atot.class);
    }
}
