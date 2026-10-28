package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oiq extends aihn implements aiis {
    public static final oiq a;
    public int b;
    public long d;
    public int f;
    public oim g;
    public String c = "";
    public String e = "";

    static {
        oiq oiqVar = new oiq();
        a = oiqVar;
        aihn.registerDefaultInstance(oiq.class, oiqVar);
    }

    private oiq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", oia.h, "g"});
        }
        if (iOrdinal == 3) {
            return new oiq();
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
        return aihn.getParserForClass(oiq.class);
    }
}
