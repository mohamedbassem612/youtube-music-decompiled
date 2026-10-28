package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahin extends aihn implements aiis {
    public static final ahin a;
    public int b;
    public aigj c = aigj.d;

    static {
        ahin ahinVar = new ahin();
        a = ahinVar;
        aihn.registerDefaultInstance(ahin.class, ahinVar);
    }

    private ahin() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ahin();
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
        return aihn.getParserForClass(ahin.class);
    }
}
