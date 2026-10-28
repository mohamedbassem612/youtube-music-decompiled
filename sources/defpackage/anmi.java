package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class anmi extends aihn implements aiis {
    public static final anmi a;
    public static final aihl b;
    public String c = "";
    private int d;

    static {
        anmi anmiVar = new anmi();
        a = anmiVar;
        aihn.registerDefaultInstance(anmi.class, anmiVar);
        b = aihn.newSingularGeneratedExtension(asnn.a, anmiVar, anmiVar, null, 463312111, aika.MESSAGE, anmi.class);
    }

    private anmi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
        }
        if (iOrdinal == 3) {
            return new anmi();
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
        return aihn.getParserForClass(anmi.class);
    }
}
