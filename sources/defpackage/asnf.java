package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asnf extends aihn implements aiis {
    public static final asnf a;
    public static final aihl b;
    public int c;
    public int d;
    private int e;

    static {
        asnf asnfVar = new asnf();
        a = asnfVar;
        aihn.registerDefaultInstance(asnf.class, asnfVar);
        b = aihn.newSingularGeneratedExtension(asop.a, asnfVar, asnfVar, null, 212323971, aika.MESSAGE, asnf.class);
    }

    private asnf() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asnf();
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
        return aihn.getParserForClass(asnf.class);
    }
}
