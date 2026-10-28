package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alan extends aihn implements aiis {
    public static final alan a;
    public int b;
    public long c;
    public int d;
    public long e;
    public long f;
    public String g = "";

    static {
        alan alanVar = new alan();
        a = alanVar;
        aihn.registerDefaultInstance(alan.class, alanVar);
    }

    private alan() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004᠌\u0001\u0005ဈ\u0004", new Object[]{"b", "c", "e", "f", "d", akvb.o, "g"});
        }
        if (iOrdinal == 3) {
            return new alan();
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
        return aihn.getParserForClass(alan.class);
    }
}
