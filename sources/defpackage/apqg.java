package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apqg extends aihn implements aiis {
    public static final apqg a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        apqg apqgVar = new apqg();
        a = apqgVar;
        aihn.registerDefaultInstance(apqg.class, apqgVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apqgVar, apqgVar, null, 61052240, aika.MESSAGE, apqg.class);
    }

    private apqg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new apqg();
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
        return aihn.getParserForClass(apqg.class);
    }
}
