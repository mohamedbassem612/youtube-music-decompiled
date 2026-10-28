package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apmv extends aihn implements aiis {
    public static final apmv a;
    public static final aihl b;
    public int c;
    public int f;
    public int h;
    public boolean i;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        apmv apmvVar = new apmv();
        a = apmvVar;
        aihn.registerDefaultInstance(apmv.class, apmvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apmvVar, apmvVar, null, 135727656, aika.MESSAGE, apmv.class);
    }

    private apmv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0007င\u0006\bဇ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new apmv();
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
        return aihn.getParserForClass(apmv.class);
    }
}
