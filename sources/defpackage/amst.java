package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amst extends aihn implements aiis {
    public static final amst a;
    private int b;
    private aovv c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private ajwo h;
    private byte i = 2;

    static {
        amst amstVar = new amst();
        a = amstVar;
        aihn.registerDefaultInstance(amst.class, amstVar);
    }

    private amst() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new amst();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amst.class);
            default:
                return null;
        }
    }
}
