package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqxr extends aihn implements aiis {
    public static final aqxr a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private ajwo f;
    private apji g;
    private ajwo h;
    private byte i = 2;

    static {
        aqxr aqxrVar = new aqxr();
        a = aqxrVar;
        aihn.registerDefaultInstance(aqxr.class, aqxrVar);
    }

    private aqxr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0003\nᐉ\b\rᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqxr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqxr.class);
            default:
                return null;
        }
    }
}
