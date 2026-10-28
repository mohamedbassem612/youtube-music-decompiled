package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqhz extends aihn implements aiis {
    public static final aqhz a;
    public int b;
    public String c = "";
    public boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public int i;

    static {
        aqhz aqhzVar = new aqhz();
        a = aqhzVar;
        aihn.registerDefaultInstance(aqhz.class, aqhzVar);
    }

    private aqhz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007င\u0006", new Object[]{"b", "c", "d", "e", aqgv.f, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new aqhz();
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
        return aihn.getParserForClass(aqhz.class);
    }
}
