package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class altx extends aihn implements aiis {
    public static final altx a;
    public int b;
    public String c = "";
    public long d;

    static {
        altx altxVar = new altx();
        a = altxVar;
        aihn.registerDefaultInstance(altx.class, altxVar);
    }

    private altx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new altx();
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
        return aihn.getParserForClass(altx.class);
    }
}
