package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfi extends aihn implements aiis {
    public static final amfi a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        amfi amfiVar = new amfi();
        a = amfiVar;
        aihn.registerDefaultInstance(amfi.class, amfiVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amfiVar, amfiVar, null, 219186518, aika.MESSAGE, amfi.class);
    }

    private amfi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new amfi();
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
        return aihn.getParserForClass(amfi.class);
    }
}
