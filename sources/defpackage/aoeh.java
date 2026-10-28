package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoeh extends aihn implements aiis {
    public static final aoeh a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;

    static {
        aoeh aoehVar = new aoeh();
        a = aoehVar;
        aihn.registerDefaultInstance(aoeh.class, aoehVar);
    }

    private aoeh() {
        emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0004\u0007င\b\bဇ\t\nဇ\u0003\u000bဇ\u0006", new Object[]{"b", "c", "d", "f", "h", "i", "e", "g"});
        }
        if (iOrdinal == 3) {
            return new aoeh();
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
        return aihn.getParserForClass(aoeh.class);
    }
}
