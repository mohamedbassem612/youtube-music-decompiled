package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammx extends aihn implements aiis {
    public static final ammx a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        ammx ammxVar = new ammx();
        a = ammxVar;
        aihn.registerDefaultInstance(ammx.class, ammxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammxVar, ammxVar, null, 1463, aika.MESSAGE, ammx.class);
    }

    private ammx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new ammx();
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
        return aihn.getParserForClass(ammx.class);
    }
}
