package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anvi extends aihn implements aiis {
    public static final anvi a;
    public int b;
    public String c = "";
    public boolean d;
    public long e;
    public boolean f;
    public long g;

    static {
        anvi anviVar = new anvi();
        a = anviVar;
        aihn.registerDefaultInstance(anvi.class, anviVar);
    }

    private anvi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဃ\u0002\u0004ဇ\u0003\u0005ဃ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new anvi();
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
        return aihn.getParserForClass(anvi.class);
    }
}
