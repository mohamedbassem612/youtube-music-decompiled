package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arnm extends aihn implements aiis {
    public static final arnm a;
    public int b;
    public String c;

    static {
        arnm arnmVar = new arnm();
        a = arnmVar;
        aihn.registerDefaultInstance(arnm.class, arnmVar);
    }

    private arnm() {
        emptyIntList();
        this.c = "";
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000bဈ\t", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new arnm();
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
        return aihn.getParserForClass(arnm.class);
    }
}
