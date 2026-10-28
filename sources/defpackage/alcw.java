package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alcw extends aihn implements aiis {
    public static final alcw a;
    public int b;
    public alay c;
    public apji e;
    public alay f;
    public apji h;
    public apji i;
    public apji j;
    public apji k;
    private alay m;
    private alay n;
    private apji o;
    private apji p;
    private byte q = 2;
    public aiie d = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aigj l = aigj.d;

    static {
        alcw alcwVar = new alcw();
        a = alcwVar;
        aihn.registerDefaultInstance(alcw.class, alcwVar);
    }

    private alcw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0002\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004Л\u0006ည\f\u0007ᐉ\u0002\bᐉ\u0004\tᐉ\u0005\nЛ\u000bᐉ\u0006\fᐉ\u0007\rᐉ\b\u000eᐉ\t\u000fᐉ\n", new Object[]{"b", "c", "m", "o", "d", apji.class, "l", "n", "e", "f", "g", apji.class, "h", "i", "j", "k", "p"});
            case 3:
                return new alcw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcw.class);
            default:
                return null;
        }
    }
}
