package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apys extends aihn implements aiis {
    public static final apys a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        apys apysVar = new apys();
        a = apysVar;
        aihn.registerDefaultInstance(apys.class, apysVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apysVar, apysVar, null, 221532651, aika.MESSAGE, apys.class);
    }

    private apys() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new apys();
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
        return aihn.getParserForClass(apys.class);
    }
}
