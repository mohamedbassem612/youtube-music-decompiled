package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atuk extends aihn implements aiis {
    public static final atuk a;
    public int b = 0;
    public Object c;

    static {
        atuk atukVar = new atuk();
        a = atukVar;
        aihn.registerDefaultInstance(atuk.class, atukVar);
    }

    private atuk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", atuh.class, atug.class, atuj.class, atui.class, atuf.class});
        }
        if (iOrdinal == 3) {
            return new atuk();
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
        return aihn.getParserForClass(atuk.class);
    }
}
