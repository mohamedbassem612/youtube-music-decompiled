package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aptq extends aihn implements aiis {
    public static final aptq a;
    public int b;
    public aptj c;
    public int d;
    public alay e;
    public aqmh f;
    public ajwo g;
    private ajwo i;
    private byte j = 2;
    public aigj h = aigj.d;

    static {
        aptq aptqVar = new aptq();
        a = aptqVar;
        aihn.registerDefaultInstance(aptq.class, aptqVar);
    }

    private aptq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001င\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0003\u0006ဉ\u0000\bည\u0007", new Object[]{"b", "d", "e", "g", "i", "f", "c", "h"});
            case 3:
                return new aptq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aptq.class);
            default:
                return null;
        }
    }
}
