package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqpw extends aihn implements aiis {
    public static final aqpw a;
    public int b = 0;
    public Object c;

    static {
        aqpw aqpwVar = new aqpw();
        a = aqpwVar;
        aihn.registerDefaultInstance(aqpw.class, aqpwVar);
    }

    private aqpw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u083f\u0000", new Object[]{"c", "b", aqvi.b});
        }
        if (iOrdinal == 3) {
            return new aqpw();
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
        return aihn.getParserForClass(aqpw.class);
    }
}
