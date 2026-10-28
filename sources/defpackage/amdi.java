package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdi extends aihn implements aiis {
    public static final amdi a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g = "";
    public int h;

    static {
        amdi amdiVar = new amdi();
        a = amdiVar;
        aihn.registerDefaultInstance(amdi.class, amdiVar);
    }

    private amdi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006᠌\u0005", new Object[]{"b", "c", aofw.n, "d", "e", aobi.f, "f", aocm.m, "g", "h", aocm.d});
        }
        if (iOrdinal == 3) {
            return new amdi();
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
        return aihn.getParserForClass(amdi.class);
    }
}
