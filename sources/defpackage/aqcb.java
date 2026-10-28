package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqcb extends aihn implements aiis {
    public static final aqcb a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        aqcb aqcbVar = new aqcb();
        a = aqcbVar;
        aihn.registerDefaultInstance(aqcb.class, aqcbVar);
    }

    private aqcb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqcb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqcb.class);
            default:
                return null;
        }
    }
}
