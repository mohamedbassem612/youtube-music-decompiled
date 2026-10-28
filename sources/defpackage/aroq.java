package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aroq extends aihn implements aiis {
    public static final aroq a;
    public int b;
    public arop c;

    static {
        aroq aroqVar = new aroq();
        a = aroqVar;
        aihn.registerDefaultInstance(aroq.class, aroqVar);
    }

    private aroq() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aroq();
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
        return aihn.getParserForClass(aroq.class);
    }
}
