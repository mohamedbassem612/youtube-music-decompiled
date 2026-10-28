package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ashg extends aihn implements aiis {
    public static final ashg a;
    public int b = 0;
    public Object c;

    static {
        ashg ashgVar = new ashg();
        a = ashgVar;
        aihn.registerDefaultInstance(ashg.class, ashgVar);
    }

    private ashg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000\u0003\u083f\u0000", new Object[]{"c", "b", asel.g, asel.h, asel.e});
        }
        if (iOrdinal == 3) {
            return new ashg();
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
        return aihn.getParserForClass(ashg.class);
    }
}
