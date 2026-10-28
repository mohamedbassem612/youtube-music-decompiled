package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atrg extends aihn implements aiis {
    public static final atrg a;
    public int b;
    public int c;
    public aimr d;
    public atqv e;
    public float f;
    public long g;
    public atrk h;
    public boolean i;
    public int j;

    static {
        atrg atrgVar = new atrg();
        a = atrgVar;
        aihn.registerDefaultInstance(atrg.class, atrgVar);
    }

    private atrg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဂ\u0005\u0007ခ\u0004\bဉ\u0007\tဇ\b\n᠌\t", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j", assp.j});
        }
        if (iOrdinal == 3) {
            return new atrg();
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
        return aihn.getParserForClass(atrg.class);
    }
}
