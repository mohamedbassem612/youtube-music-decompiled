package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqmq extends aihn implements aiis {
    public static final aqmq a;
    private int b;
    private apji c;
    private apji d;
    private ajwo e;
    private ajwo f;
    private ajwo g;
    private ajwo h;
    private apji i;
    private byte j = 2;

    static {
        aqmq aqmqVar = new aqmq();
        a = aqmqVar;
        aihn.registerDefaultInstance(aqmq.class, aqmqVar);
    }

    private aqmq() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u000e\u0007\u0000\u0000\u0007\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\nᐉ\r\rᐉ\u0005\u000eᐉ\u0007", new Object[]{"b", "c", "d", "e", "g", "i", "f", "h"});
            case 3:
                return new aqmq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqmq.class);
            default:
                return null;
        }
    }
}
