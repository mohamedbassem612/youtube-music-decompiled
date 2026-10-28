package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aktm extends aihn implements aiis {
    public static final aktm a;
    public int b;
    public aipe d;
    public aigj e;
    private alay f;
    private alay g;
    private alay h;
    private byte i = 2;
    public aiie c = emptyProtobufList();

    static {
        aktm aktmVar = new aktm();
        a = aktmVar;
        aihn.registerDefaultInstance(aktm.class, aktmVar);
    }

    private aktm() {
        emptyProtobufList();
        this.e = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0005\u0002Л\u0004ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\bᐉ\r\tည\u000e", new Object[]{"b", "c", aktl.class, "f", "g", "h", "d", "e"});
            case 3:
                return new aktm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aktm.class);
            default:
                return null;
        }
    }
}
