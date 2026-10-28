package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqgk extends aihn implements aiis {
    public static final aqgk a;
    public int b;
    public alay d;
    public ajwo e;
    public aiie f;
    public long g;
    public int h;
    public ajng i;
    public aigj j;
    public aiie k;
    public aiie l;
    private alay m;
    private ajwo n;
    private ajwo o;
    private byte p = 2;
    public aiie c = emptyProtobufList();

    static {
        aqgk aqgkVar = new aqgk();
        a = aqgkVar;
        aihn.registerDefaultInstance(aqgk.class, aqgkVar);
    }

    private aqgk() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
        this.j = aigj.d;
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u0012\r\u0000\u0004\b\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005Л\u0006ᐉ\u0004\u0007ဃ\u0006\b᠌\u0007\nည\u000b\u000bᐉ\t\rᐉ\u0003\u0011\u001b\u0012\u001b", new Object[]{"b", "c", aqgi.class, "d", "m", "e", "f", aqgl.class, "o", "g", "h", aqgv.b, "j", "i", "n", "k", aqgc.class, "l", aqga.class});
            case 3:
                return new aqgk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgk.class);
            default:
                return null;
        }
    }
}
