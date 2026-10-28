package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amue extends aihn implements aiis {
    public static final amue a;
    public int b;
    public amuf c;

    static {
        amue amueVar = new amue();
        a = amueVar;
        aihn.registerDefaultInstance(amue.class, amueVar);
    }

    private amue() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new amue();
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
        return aihn.getParserForClass(amue.class);
    }
}
