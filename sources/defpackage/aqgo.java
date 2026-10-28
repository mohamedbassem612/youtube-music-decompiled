package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqgo extends aihn implements aiis {
    public static final aqgo a;
    public int b;
    public alay c;
    public aqgp d;
    public ajng e;
    public ajng f;
    public int g;
    private byte i = 2;
    public aigj h = aigj.d;

    static {
        aqgo aqgoVar = new aqgo();
        a = aqgoVar;
        aihn.registerDefaultInstance(aqgo.class, aqgoVar);
    }

    private aqgo() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aqcj.u, "h"});
            case 3:
                return new aqgo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgo.class);
            default:
                return null;
        }
    }
}
