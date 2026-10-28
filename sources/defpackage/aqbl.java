package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqbl extends aihn implements aiis {
    public static final aqbl a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private aqbk h;
    private byte i = 2;

    static {
        aqbl aqblVar = new aqbl();
        a = aqblVar;
        aihn.registerDefaultInstance(aqbl.class, aqblVar);
    }

    private aqbl() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0006\r\u0006\u0000\u0000\u0006\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqbl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbl.class);
            default:
                return null;
        }
    }
}
