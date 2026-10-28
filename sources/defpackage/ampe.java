package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampe extends aihn implements aiis {
    public static final ampe a;
    public int b;
    public Object d;
    public alay f;
    public apji g;
    public ajwo h;
    private ajwo i;
    public int c = 0;
    private byte j = 2;
    public String e = "";

    static {
        ampe ampeVar = new ampe();
        a = ampeVar;
        aihn.registerDefaultInstance(ampe.class, ampeVar);
    }

    private ampe() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001ဈ\u0000\u0003м\u0000\u0004м\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\tᐉ\u0006", new Object[]{"d", "c", "b", "e", alja.class, apji.class, "f", "g", "h", "i"});
            case 3:
                return new ampe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampe.class);
            default:
                return null;
        }
    }
}
