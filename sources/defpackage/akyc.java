package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akyc extends aihn implements aiis {
    public static final akyc a;
    public static final aihl b;
    public int c;
    public akyk d;

    static {
        akyc akycVar = new akyc();
        a = akycVar;
        aihn.registerDefaultInstance(akyc.class, akycVar);
        b = aihn.newSingularGeneratedExtension(asmq.a, akycVar, akycVar, null, 1001, aika.MESSAGE, akyc.class);
    }

    private akyc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new akyc();
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
        return aihn.getParserForClass(akyc.class);
    }
}
