package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asro extends aihn implements aiis {
    public static final asro a;
    public int b;
    public String c = "";
    public asrk d;
    public asrn e;
    public asrn f;
    public asrn g;
    public double h;

    static {
        asro asroVar = new asro();
        a = asroVar;
        aihn.registerDefaultInstance(asro.class, asroVar);
    }

    private asro() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007က\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new asro();
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
        return aihn.getParserForClass(asro.class);
    }
}
