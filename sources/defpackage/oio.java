package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oio extends aihn implements aiis {
    public static final oio a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean h;
    public boolean i;

    static {
        oio oioVar = new oio();
        a = oioVar;
        aihn.registerDefaultInstance(oio.class, oioVar);
    }

    private oio() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new oio();
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
        return aihn.getParserForClass(oio.class);
    }
}
