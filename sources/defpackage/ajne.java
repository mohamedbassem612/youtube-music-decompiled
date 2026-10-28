package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajne extends aihn implements aiis {
    public static final ajne a;
    public int b = 0;
    public Object c;

    static {
        ajne ajneVar = new ajne();
        a = ajneVar;
        aihn.registerDefaultInstance(ajne.class, ajneVar);
    }

    private ajne() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uec16㡿\uec16㡿\u0001\u0000\u0000\u0000\uec16㡿<\u0000", new Object[]{"c", "b", ajkx.class});
        }
        if (iOrdinal == 3) {
            return new ajne();
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
        return aihn.getParserForClass(ajne.class);
    }
}
