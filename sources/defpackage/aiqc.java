package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aiqc extends aihn implements aiis {
    public static final aiqc a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        aiqc aiqcVar = new aiqc();
        a = aiqcVar;
        aihn.registerDefaultInstance(aiqc.class, aiqcVar);
        b = aihn.newSingularGeneratedExtension(apjj.a, aiqcVar, aiqcVar, null, 2, aika.MESSAGE, aiqc.class);
    }

    private aiqc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiqc();
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
        return aihn.getParserForClass(aiqc.class);
    }
}
