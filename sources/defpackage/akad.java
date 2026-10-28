package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akad extends aihn implements aiis {
    public static final akad a;
    public int b = 0;
    public Object c;

    static {
        akad akadVar = new akad();
        a = akadVar;
        aihn.registerDefaultInstance(akad.class, akadVar);
    }

    private akad() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000", new Object[]{"c", "b", akag.class, akah.class, akae.class, akac.class, akab.class});
        }
        if (iOrdinal == 3) {
            return new akad();
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
        return aihn.getParserForClass(akad.class);
    }
}
