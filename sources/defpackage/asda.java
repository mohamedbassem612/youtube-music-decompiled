package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asda extends aihn implements aiis {
    public static final asda a;
    public int b;
    public apgv c;
    public String d;

    static {
        asda asdaVar = new asda();
        a = asdaVar;
        aihn.registerDefaultInstance(asda.class, asdaVar);
    }

    private asda() {
        emptyProtobufList();
        this.d = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဉ\u0001", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new asda();
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
        return aihn.getParserForClass(asda.class);
    }
}
