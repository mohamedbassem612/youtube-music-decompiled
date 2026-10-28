package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajdx extends aihn implements aiis {
    public static final ajdx a;
    public long b;
    public long c;
    public aqmh d;
    private int f;
    private ajwo g;
    private apji h;
    private byte i = 2;
    public aigj e = aigj.d;

    static {
        ajdx ajdxVar = new ajdx();
        a = ajdxVar;
        aihn.registerDefaultInstance(ajdx.class, ajdxVar);
    }

    private ajdx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0003\u0001ဂ\u0000\u0002ဂ\u0001\u0006ᐉ\u0002\tည\u0004\nᐉ\u0005\fᐉ\u0007", new Object[]{"f", "b", "c", "d", "e", "g", "h"});
            case 3:
                return new ajdx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajdx.class);
            default:
                return null;
        }
    }
}
