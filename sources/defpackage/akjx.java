package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akjx extends aihn implements aiis {
    public static final aihw a = new qle(5);
    public static final akjx b;
    public int c;
    public long d;
    public aihv e = emptyIntList();
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        akjx akjxVar = new akjx();
        b = akjxVar;
        aihn.registerDefaultInstance(akjx.class, akjxVar);
    }

    private akjx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0003ࠞ\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"c", "d", "e", amyr.h, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new akjx();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(akjx.class);
    }
}
