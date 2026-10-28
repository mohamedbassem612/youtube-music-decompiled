package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ammt extends aihn implements aiis {
    public static final ammt a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        ammt ammtVar = new ammt();
        a = ammtVar;
        aihn.registerDefaultInstance(ammt.class, ammtVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammtVar, ammtVar, null, 130295727, aika.MESSAGE, ammt.class);
    }

    private ammt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new ammt();
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
        return aihn.getParserForClass(ammt.class);
    }
}
