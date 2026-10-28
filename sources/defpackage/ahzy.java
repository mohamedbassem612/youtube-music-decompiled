package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahzy extends aihn implements aiis {
    public static final ahzy a;
    public int b = 0;
    public Object c;

    static {
        ahzy ahzyVar = new ahzy();
        a = ahzyVar;
        aihn.registerDefaultInstance(ahzy.class, ahzyVar);
    }

    private ahzy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002\u083f\u0000", new Object[]{"c", "b", ahzf.j});
        }
        if (iOrdinal == 3) {
            return new ahzy();
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
        return aihn.getParserForClass(ahzy.class);
    }
}
