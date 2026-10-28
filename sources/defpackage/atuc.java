package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atuc extends aihn implements aiis {
    public static final atuc a;
    public int b = 0;
    public Object c;

    static {
        atuc atucVar = new atuc();
        a = atucVar;
        aihn.registerDefaultInstance(atuc.class, atucVar);
    }

    private atuc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", attz.class, atub.class, atua.class});
        }
        if (iOrdinal == 3) {
            return new atuc();
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
        return aihn.getParserForClass(atuc.class);
    }
}
