package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqbr extends aihn implements aiis {
    public static final aqbr a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private ajwo f;
    private ajwo g;
    private byte h = 2;

    static {
        aqbr aqbrVar = new aqbr();
        a = aqbrVar;
        aihn.registerDefaultInstance(aqbr.class, aqbrVar);
    }

    private aqbr() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqbr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbr.class);
            default:
                return null;
        }
    }
}
