package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akfm extends aihn implements aiis {
    public static final akfm a;
    private int b;
    private akfo c;
    private alay d;
    private akfn e;
    private ajng f;
    private alay g;
    private alay h;
    private byte i = 2;

    static {
        akfm akfmVar = new akfm();
        a = akfmVar;
        aihn.registerDefaultInstance(akfm.class, akfmVar);
    }

    private akfm() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0006\u0001ᐉ\t\u0003ᐉ\n\u0005ᐉ\u0007\u0006ᐉ\b\bᐉ\u0003\rᐉ\u0000", new Object[]{"b", "g", "h", "e", "f", "d", "c"});
            case 3:
                return new akfm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfm.class);
            default:
                return null;
        }
    }
}
