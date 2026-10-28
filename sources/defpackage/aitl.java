package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aitl extends aihn implements aiis {
    public static final aitl a;
    public int b;
    public apji c;
    public apji d;
    public boolean e;
    public ajwo f;
    private aitk g;
    private byte h = 2;

    static {
        aitl aitlVar = new aitl();
        a = aitlVar;
        aihn.registerDefaultInstance(aitl.class, aitlVar);
    }

    private aitl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\"\u0005\u0000\u0000\u0004\u0001ᐉ\u0001\u0007ဇ\u0004\tᐉ\u0000\fᐉ\t\"ᐉ\u0002", new Object[]{"b", "d", "e", "c", "f", "g"});
            case 3:
                return new aitl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aitl.class);
            default:
                return null;
        }
    }
}
