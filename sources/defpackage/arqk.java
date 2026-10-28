package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arqk extends aihn implements aiis {
    public static final arqk a;
    public int b;
    public arqj c;
    public alay e;
    public apji f;
    public apji g;
    public aiie h;
    public aiie i;
    public aigj j;
    private byte k = 2;
    public aiie d = emptyProtobufList();

    static {
        arqk arqkVar = new arqk();
        a = arqkVar;
        aihn.registerDefaultInstance(arqk.class, arqkVar);
    }

    private arqk() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0003\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007Л\tည\u0005", new Object[]{"b", "c", "d", arqi.class, "e", "f", "g", "h", ajwo.class, "i", ajwo.class, "j"});
            case 3:
                return new arqk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arqk.class);
            default:
                return null;
        }
    }
}
