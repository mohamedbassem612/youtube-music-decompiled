package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajdg extends aihn implements aiis {
    public static final ajdg a;
    public boolean b;
    public boolean c;
    public long d;
    private int e;

    static {
        ajdg ajdgVar = new ajdg();
        a = ajdgVar;
        aihn.registerDefaultInstance(ajdg.class, ajdgVar);
    }

    private ajdg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"e", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ajdg();
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
        return aihn.getParserForClass(ajdg.class);
    }
}
