package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amcd extends aihn implements aiis {
    public static final amcd a;
    public int b;
    public argn d;
    public amdd e;
    public int f;
    public atqe g;
    private byte h = 2;
    public String c = "";

    static {
        amcd amcdVar = new amcd();
        a = amcdVar;
        aihn.registerDefaultInstance(amcd.class, amcdVar);
    }

    private amcd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", allf.k, "g"});
            case 3:
                return new amcd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amcd.class);
            default:
                return null;
        }
    }
}
