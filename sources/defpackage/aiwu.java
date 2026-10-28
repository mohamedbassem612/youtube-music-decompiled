package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiwu extends aihn implements aiis {
    public static final aiwu a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        aiwu aiwuVar = new aiwu();
        a = aiwuVar;
        aihn.registerDefaultInstance(aiwu.class, aiwuVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aiwuVar, aiwuVar, null, 69487224, aika.MESSAGE, aiwu.class);
    }

    private aiwu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001a\u0005ည\u0003", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aiwu();
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
        return aihn.getParserForClass(aiwu.class);
    }
}
