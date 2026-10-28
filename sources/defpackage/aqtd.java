package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqtd extends aihn implements aiis {
    public static final aqtd a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aigj e = aigj.d;

    static {
        aqtd aqtdVar = new aqtd();
        a = aqtdVar;
        aihn.registerDefaultInstance(aqtd.class, aqtdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqtdVar, aqtdVar, null, 129506414, aika.MESSAGE, aqtd.class);
    }

    private aqtd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new aqtd();
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
        return aihn.getParserForClass(aqtd.class);
    }
}
