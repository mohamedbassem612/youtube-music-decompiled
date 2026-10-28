package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class araa extends aihn implements aiis {
    public static final araa a;
    public static final aihl b;
    public int c;
    public boolean e;
    public int f;
    public String d = "";
    public aigj g = aigj.d;

    static {
        araa araaVar = new araa();
        a = araaVar;
        aihn.registerDefaultInstance(araa.class, araaVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, araaVar, araaVar, null, 124861221, aika.MESSAGE, araa.class);
    }

    private araa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004င\u0002\u0005ည\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new araa();
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
        return aihn.getParserForClass(araa.class);
    }
}
