package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aifv extends aihn implements aiis {
    public static final aifv a;
    public String b = "";
    public aigj c = aigj.d;

    static {
        aifv aifvVar = new aifv();
        a = aifvVar;
        aihn.registerDefaultInstance(aifv.class, aifvVar);
    }

    private aifv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aifv();
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
        return aihn.getParserForClass(aifv.class);
    }
}
