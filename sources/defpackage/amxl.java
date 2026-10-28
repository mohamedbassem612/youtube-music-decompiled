package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amxl extends aihn implements aiis {
    public static final amxl a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        amxl amxlVar = new amxl();
        a = amxlVar;
        aihn.registerDefaultInstance(amxl.class, amxlVar);
    }

    private amxl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", amys.f, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amxl();
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
        return aihn.getParserForClass(amxl.class);
    }
}
