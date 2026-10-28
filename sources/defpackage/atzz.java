package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atzz extends aihn implements aiis {
    public static final atzz a;
    public int b = 0;
    public Object c;

    static {
        atzz atzzVar = new atzz();
        a = atzzVar;
        aihn.registerDefaultInstance(atzz.class, atzzVar);
    }

    private atzz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"c", "b", atzy.class});
        }
        if (iOrdinal == 3) {
            return new atzz();
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
        return aihn.getParserForClass(atzz.class);
    }
}
