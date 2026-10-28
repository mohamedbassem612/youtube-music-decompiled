package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahya extends aihn implements aiis {
    public static final ahya a;
    public int b;
    public String c = "";
    public int d;

    static {
        ahya ahyaVar = new ahya();
        a = ahyaVar;
        aihn.registerDefaultInstance(ahya.class, ahyaVar);
    }

    private ahya() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ahxv.f});
        }
        if (iOrdinal == 3) {
            return new ahya();
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
        return aihn.getParserForClass(ahya.class);
    }
}
