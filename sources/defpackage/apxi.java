package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apxi extends aihn implements aiis {
    public static final apxi a;
    public static final aihl b;
    public int c;
    public apmn d;

    static {
        apxi apxiVar = new apxi();
        a = apxiVar;
        aihn.registerDefaultInstance(apxi.class, apxiVar);
        b = aihn.newSingularGeneratedExtension(asss.a, apxiVar, apxiVar, null, 9, aika.MESSAGE, apxi.class);
    }

    private apxi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new apxi();
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
        return aihn.getParserForClass(apxi.class);
    }
}
