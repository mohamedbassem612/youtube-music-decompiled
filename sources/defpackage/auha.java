package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auha extends aihn implements aiis {
    public static final auha a;
    public int b;
    public String c = "";
    public aqae d;
    public aqad e;

    static {
        auha auhaVar = new auha();
        a = auhaVar;
        aihn.registerDefaultInstance(auha.class, auhaVar);
    }

    private auha() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new auha();
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
        return aihn.getParserForClass(auha.class);
    }
}
