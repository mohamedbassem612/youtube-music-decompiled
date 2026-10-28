package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahiv extends aihn implements aiis {
    public static final ahiv a;
    public int b;

    static {
        ahiv ahivVar = new ahiv();
        a = ahivVar;
        aihn.registerDefaultInstance(ahiv.class, ahivVar);
    }

    private ahiv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ahiv();
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
        return aihn.getParserForClass(ahiv.class);
    }
}
