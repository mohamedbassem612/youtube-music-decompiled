package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahyk extends aihn implements aiis {
    public static final ahyk a;
    public int b;
    public ahyj c;
    public int d;

    static {
        ahyk ahykVar = new ahyk();
        a = ahykVar;
        aihn.registerDefaultInstance(ahyk.class, ahykVar);
    }

    private ahyk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", ahxv.k});
        }
        if (iOrdinal == 3) {
            return new ahyk();
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
        return aihn.getParserForClass(ahyk.class);
    }
}
