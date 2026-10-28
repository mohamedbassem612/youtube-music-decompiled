package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzc extends aihn implements aiis {
    public static final apzc a;
    public static final aihl b;
    public int c;
    public String d = "";

    static {
        apzc apzcVar = new apzc();
        a = apzcVar;
        aihn.registerDefaultInstance(apzc.class, apzcVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apzcVar, apzcVar, null, 221126717, aika.MESSAGE, apzc.class);
    }

    private apzc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new apzc();
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
        return aihn.getParserForClass(apzc.class);
    }
}
