package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amfq extends aihn implements aiis {
    public static final amfq a;
    public static final aihl b;
    public aigj c;
    public aigj d;
    private int e;

    static {
        amfq amfqVar = new amfq();
        a = amfqVar;
        aihn.registerDefaultInstance(amfq.class, amfqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, amfqVar, amfqVar, null, 168118343, aika.MESSAGE, amfq.class);
    }

    private amfq() {
        aigj aigjVar = aigj.d;
        this.c = aigjVar;
        this.d = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new amfq();
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
        return aihn.getParserForClass(amfq.class);
    }
}
