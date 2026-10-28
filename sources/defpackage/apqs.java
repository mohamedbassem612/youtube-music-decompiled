package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apqs extends aihn implements aiis {
    public static final apqs a;
    public int b;
    public int c;
    public alay d;
    public alay e;
    public boolean f;
    public boolean g;
    public ajwo h;
    public ajwo i;
    public alay j;
    public alay k;
    public apqx l;
    public apqx m;
    public aiie n;
    private alay o;
    private alay p;
    private alay q;
    private apji r;
    private byte s = 2;

    static {
        apqs apqsVar = new apqs();
        a = apqsVar;
        aihn.registerDefaultInstance(apqs.class, apqsVar);
    }

    private apqs() {
        emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u001a\u0010\u0000\u0001\f\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ဇ\b\u0005ᐉ\f\u0006ᐉ\r\u0007ᐉ\u000e\b\u001b\tဇ\t\nᐉ\u000f\u000bᐉ\u0013\u000eᐉ\u0012\u000f᠌\u0000\u0012ᐉ\u0014\u0017ᐉ\u0007\u0019ᐉ\u0010\u001aᐉ\u0011", new Object[]{"b", "d", "e", "f", "h", "i", "j", "n", apru.class, "g", "k", "m", "l", "c", apsb.b, "r", "o", "p", "q"});
            case 3:
                return new apqs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqs.class);
            default:
                return null;
        }
    }
}
