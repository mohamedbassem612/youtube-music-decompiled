package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asmu extends aihn implements aiis {
    public static final asmu a;
    public static final aihl b;
    public int c;
    public aigj d = aigj.d;

    static {
        asmu asmuVar = new asmu();
        a = asmuVar;
        aihn.registerDefaultInstance(asmu.class, asmuVar);
        b = aihn.newSingularGeneratedExtension(asoq.a, asmuVar, asmuVar, null, 169768054, aika.MESSAGE, asmu.class);
    }

    private asmu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new asmu();
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
        return aihn.getParserForClass(asmu.class);
    }
}
