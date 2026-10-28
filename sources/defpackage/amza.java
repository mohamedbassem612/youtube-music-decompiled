package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amza extends aihn implements aiis {
    public static final amza a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    private int g;
    private int h;

    static {
        amza amzaVar = new amza();
        a = amzaVar;
        aihn.registerDefaultInstance(amza.class, amzaVar);
    }

    private amza() {
        emptyProtobufList();
        emptyProtobufList();
        this.f = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0002\u00045\u0005\u0000\u0000\u0000\u0004ဇ\u0003\u0007ဇ\u0005\u001cဇ\u0016(ဇ 5ဈ,", new Object[]{"g", "h", "b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new amza();
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
        return aihn.getParserForClass(amza.class);
    }
}
