package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivo extends aihn implements aiis {
    public static final aivo a;
    public aiie d;
    public aiie e;
    public aiie f;
    public aiie g;
    public aiie h;
    public aiie i;
    public aiie j;
    public aiie k;
    public aiie l;
    public aivd m;
    public aiie n;
    public aiie o;
    public aiie p;
    public aiie q;
    public aiie r;
    public aiie s;
    public aiie t;
    public aiie u;
    public aiie v;
    private int w;
    private byte x = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        aivo aivoVar = new aivo();
        a = aivoVar;
        aihn.registerDefaultInstance(aivo.class, aivoVar);
    }

    private aivo() {
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
        emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.x);
            case 1:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u001a\u0015\u0000\u0014\u0015\u0001Л\u0002Л\u0005Л\u0007Л\bЛ\tЛ\nЛ\u000bЛ\fЛ\rЛ\u000eЛ\u000fЛ\u0010Л\u0012Л\u0013Л\u0014Л\u0015Л\u0017ᐉ\u0000\u0018Л\u0019Л\u001aЛ", new Object[]{"w", "b", ajwo.class, "c", ajwo.class, "d", ajwo.class, "e", ajwo.class, "f", ajwo.class, "i", ajwo.class, "j", aiwc.class, "k", ajwo.class, "l", ajwo.class, "n", ajwo.class, "o", ajwo.class, "p", ajwo.class, "q", ajwo.class, "r", ajwo.class, "s", ajwo.class, "u", ajwo.class, "v", ajwo.class, "m", "g", ajwo.class, "h", ajwo.class, "t", ajwo.class});
            case 3:
                return new aivo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aivo.class);
            default:
                return null;
        }
    }
}
