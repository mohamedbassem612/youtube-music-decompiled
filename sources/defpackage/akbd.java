package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbd extends aihn implements aiis {
    public static final akbd a;
    private int b;
    private alcj c;
    private alay d;
    private alay e;
    private alcl f;
    private alay g;
    private ajwo h;
    private byte i = 2;

    static {
        akbd akbdVar = new akbd();
        a = akbdVar;
        aihn.registerDefaultInstance(akbd.class, akbdVar);
    }

    private akbd() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002ᐉ\u0007\u0003ᐉ\u0003\u0004ᐉ\n\bᐉ\u0002\tᐉ\u0006\nᐉ\u0000", new Object[]{"b", "g", "e", "h", "d", "f", "c"});
            case 3:
                return new akbd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbd.class);
            default:
                return null;
        }
    }
}
