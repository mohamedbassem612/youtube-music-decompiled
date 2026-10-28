package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anyb extends aihn implements aiis {
    public static final anyb a;
    public int b;
    public anyd c;
    public alay d;
    public alay e;
    public anya f;
    public boolean g;
    private byte i = 2;
    public aigj h = aigj.d;

    static {
        anyb anybVar = new anyb();
        a = anybVar;
        aihn.registerDefaultInstance(anyb.class, anybVar);
    }

    private anyb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new anyb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anyb.class);
            default:
                return null;
        }
    }
}
