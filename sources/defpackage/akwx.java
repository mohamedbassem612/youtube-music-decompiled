package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwx extends aihn implements aiis {
    public static final akwx a;
    public int b = 0;
    public Object c;

    static {
        akwx akwxVar = new akwx();
        a = akwxVar;
        aihn.registerDefaultInstance(akwx.class, akwxVar);
    }

    private akwx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u0003;\u0000\u00043\u0000\u0005=\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new akwx();
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
        return aihn.getParserForClass(akwx.class);
    }
}
