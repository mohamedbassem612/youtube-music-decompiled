package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atuo extends aihn implements aiis {
    public static final atuo a;
    public int b = 0;
    public Object c;

    static {
        atuo atuoVar = new atuo();
        a = atuoVar;
        aihn.registerDefaultInstance(atuo.class, atuoVar);
    }

    private atuo() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", atun.class, atum.class});
        }
        if (iOrdinal == 3) {
            return new atuo();
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
        return aihn.getParserForClass(atuo.class);
    }
}
