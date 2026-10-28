package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amjl extends aihn implements aiis {
    public static final amjl a;
    public int b;
    public boolean c;
    public String d = "";
    public String e;
    public String f;

    static {
        amjl amjlVar = new amjl();
        a = amjlVar;
        aihn.registerDefaultInstance(amjl.class, amjlVar);
    }

    private amjl() {
        emptyLongList();
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amjl();
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
        return aihn.getParserForClass(amjl.class);
    }
}
