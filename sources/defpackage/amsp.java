package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amsp extends aihn implements aiis {
    public static final amsp a;
    public int b;
    public ajwo d;
    public boolean e;
    public long g;
    public amso h;
    public boolean i;
    private byte j = 2;
    public String c = "";
    public int f = 1;

    static {
        amsp amspVar = new amsp();
        a = amspVar;
        aihn.registerDefaultInstance(amsp.class, amspVar);
    }

    private amsp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0002\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0006\u0005ဂ\u0005\u0006ဇ\u0003\u0007ဇ\u0007\n᠌\u0004", new Object[]{"b", "c", "d", "h", "g", "e", "i", "f", amoe.j});
            case 3:
                return new amsp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amsp.class);
            default:
                return null;
        }
    }
}
