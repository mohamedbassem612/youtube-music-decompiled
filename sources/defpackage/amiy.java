package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amiy extends aihn implements aiis {
    public static final amiy a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        amiy amiyVar = new amiy();
        a = amiyVar;
        aihn.registerDefaultInstance(amiy.class, amiyVar);
    }

    private amiy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new amiy();
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
        return aihn.getParserForClass(amiy.class);
    }
}
