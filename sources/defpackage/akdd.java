package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akdd extends aihn implements aiis {
    public static final akdd a;
    private ajng A;
    public int b;
    public alay c;
    public alja d;
    public ajng g;
    public ajng h;
    public aipe i;
    public alay p;
    public alay q;
    public ajwo r;
    public ajwo s;
    public ajwo t;
    public alay u;
    public alay v;
    private alay w;
    private alay x;
    private ajwo y;
    private ajlx z;
    private byte B = 2;
    public String e = "";
    public aiie f = emptyProtobufList();
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();
    public aigj m = aigj.d;
    public aiie n = emptyProtobufList();
    public aiie o = emptyProtobufList();

    static {
        akdd akddVar = new akdd();
        a = akddVar;
        aihn.registerDefaultInstance(akdd.class, akddVar);
    }

    private akdd() {
        emptyProtobufList();
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001'\u0019\u0000\u0006\u0016\u0001ᐉ\u0000\u0002ᐉ\u001e\u0003ᐉ\u0019\u0004ᐉ\u001a\u0005ᐉ\u001b\u0006ᐉ\u000b\u0007ည\u0012\bЛ\tᐉ\u001c\nᐉ\u001d\fᐉ\u0006\rᐉ\u0007\u0010ᐉ\u0004\u0012ဈ\u0005\u0014Л\u0017Л\u0018Л\u0019Л\u001cᐉ\u000f\u001eᐉ\u0010\u001fᐉ\u001f#ᐉ\u0015$ᐉ\u0016&ᐉ\u000e'\u001b", new Object[]{"b", "c", "u", "p", "q", "r", "i", "m", "f", alay.class, "s", "t", "g", "h", "d", "e", "l", ajwo.class, "n", ajwo.class, "j", ajwo.class, "k", ajwo.class, "x", "y", "v", "z", "A", "w", "o", ajub.class});
            case 3:
                return new akdd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdd.class);
            default:
                return null;
        }
    }
}
