package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqv extends aihn implements aiis {
    public static final alqv a;
    public int b;
    public alop c;
    public aiie d;
    public aiie e;
    public ajwo f;
    public ajwo g;
    private apji h;
    private ajwo i;
    private albe j;
    private byte k = 2;

    static {
        alqv alqvVar = new alqv();
        a = alqvVar;
        aihn.registerDefaultInstance(alqv.class, alqvVar);
    }

    private alqv() {
        aigj aigjVar = aigj.d;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001̉\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007Л\b\u001b\u0010ᐉ\u000b\u0012ᐉ\f̉ᐉ\r", new Object[]{"b", "c", "h", "i", "d", apvl.class, "e", apvn.class, "f", "g", "j"});
            case 3:
                return new alqv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqv.class);
            default:
                return null;
        }
    }
}
