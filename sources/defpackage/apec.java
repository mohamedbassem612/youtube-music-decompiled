package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apec extends aihn implements aiis {
    public static final apec a;
    public static final aihl b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        apec apecVar = new apec();
        a = apecVar;
        aihn.registerDefaultInstance(apec.class, apecVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apecVar, apecVar, null, 516679517, aika.MESSAGE, apec.class);
    }

    private apec() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"c", "d", aotj.t, "e", aotj.u, "f"});
        }
        if (iOrdinal == 3) {
            return new apec();
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
        return aihn.getParserForClass(apec.class);
    }
}
