package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akqh extends aihn implements aiis {
    public static final akqh a;
    public int b = 0;
    public Object c;

    static {
        akqh akqhVar = new akqh();
        a = akqhVar;
        aihn.registerDefaultInstance(akqh.class, akqhVar);
    }

    private akqh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001;\u0000\u00023\u0000\u00035\u0000\u0004:\u0000\u0005<\u0000", new Object[]{"c", "b", aqla.class});
        }
        if (iOrdinal == 3) {
            return new akqh();
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
        return aihn.getParserForClass(akqh.class);
    }
}
