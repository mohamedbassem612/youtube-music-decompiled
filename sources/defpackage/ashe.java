package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ashe extends aihn implements aiis {
    public static final ashe a;
    public int b;
    public float c;

    static {
        ashe asheVar = new ashe();
        a = asheVar;
        aihn.registerDefaultInstance(ashe.class, asheVar);
    }

    private ashe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ashe();
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
        return aihn.getParserForClass(ashe.class);
    }
}
