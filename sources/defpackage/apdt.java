package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apdt extends aihn implements aiis {
    public static final apdt a;
    public static final aihl b;
    public int c;
    private int d;

    static {
        apdt apdtVar = new apdt();
        a = apdtVar;
        aihn.registerDefaultInstance(apdt.class, apdtVar);
        b = aihn.newSingularGeneratedExtension(aqpr.a, apdtVar, apdtVar, null, 1005, aika.MESSAGE, apdt.class);
    }

    private apdt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "c", aotj.p});
        }
        if (iOrdinal == 3) {
            return new apdt();
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
        return aihn.getParserForClass(apdt.class);
    }
}
