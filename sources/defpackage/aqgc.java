package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqgc extends aihn implements aiis {
    public static final aqgc a;
    public int b = 0;
    public Object c;

    static {
        aqgc aqgcVar = new aqgc();
        a = aqgcVar;
        aihn.registerDefaultInstance(aqgc.class, aqgcVar);
    }

    private aqgc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u083f\u0000", new Object[]{"c", "b", aqgb.class, aqgd.class, aqcj.t});
        }
        if (iOrdinal == 3) {
            return new aqgc();
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
        return aihn.getParserForClass(aqgc.class);
    }
}
