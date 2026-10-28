package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akko extends aihn implements aiis {
    public static final akko a;
    public int b;
    public boolean c;
    public akkn d;
    public akkn e;
    public akkn f;
    public akkn g;

    static {
        akko akkoVar = new akko();
        a = akkoVar;
        aihn.registerDefaultInstance(akko.class, akkoVar);
    }

    private akko() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001Ɛ\u0005\u0000\u0000\u0000\u0001ဇ\u0000dဉ\u0001Èဉ\u0002Ĭဉ\u0003Ɛဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new akko();
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
        return aihn.getParserForClass(akko.class);
    }
}
