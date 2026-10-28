package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahys extends aihn implements aiis {
    public static final ahys a;
    public int b;
    public long d;
    public long f;
    public String c = "";
    public String e = "";

    static {
        ahys ahysVar = new ahys();
        a = ahysVar;
        aihn.registerDefaultInstance(ahys.class, ahysVar);
    }

    private ahys() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"b", "c", "e", "d", "f"});
        }
        if (iOrdinal == 3) {
            return new ahys();
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
        return aihn.getParserForClass(ahys.class);
    }
}
