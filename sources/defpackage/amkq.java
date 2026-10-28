package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amkq extends aihn implements aiis {
    public static final amkq a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    private int k;

    static {
        amkq amkqVar = new amkq();
        a = amkqVar;
        aihn.registerDefaultInstance(amkq.class, amkqVar);
    }

    private amkq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u001c\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0006ဇ\u0005\fဇ\n\u000fဇ\r\u0015ဇ\u0011\u0019ဇ\u0015\u001aဇ\u0016\u001cဇ\u0018", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new amkq();
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
        return aihn.getParserForClass(amkq.class);
    }
}
