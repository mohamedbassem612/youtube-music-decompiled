package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqhg extends aihn implements aiis {
    public static final aqhg a;
    private int b;
    private alay c;
    private aqhd d;
    private alay e;
    private aqhc f;
    private aqhf g;
    private alay h;
    private byte i = 2;

    static {
        aqhg aqhgVar = new aqhg();
        a = aqhgVar;
        aihn.registerDefaultInstance(aqhg.class, aqhgVar);
    }

    private aqhg() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\bᐉ\u0006\tᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqhg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqhg.class);
            default:
                return null;
        }
    }
}
