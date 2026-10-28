package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzn extends aihn implements aiis {
    public static final anzn a;
    public int b;
    public apji c;
    public int d;
    public alay e;
    public alay f;
    public alay g;
    public ajwo h;
    public ajwo i;
    public apji j;
    public apji k;
    public apji n;
    public apji o;
    public apji p;
    public anst q;
    public apji r;
    public int s;
    public aiqe t;
    public aigj u;
    private apji v;
    private byte w = 2;
    public aiie l = emptyProtobufList();
    public aiie m = emptyProtobufList();

    static {
        anzn anznVar = new anzn();
        a = anznVar;
        aihn.registerDefaultInstance(anzn.class, anznVar);
    }

    private anzn() {
        emptyProtobufList();
        this.u = aigj.d;
    }

    public final void a() {
        aiie aiieVar = this.l;
        if (aiieVar.c()) {
            return;
        }
        this.l = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.m;
        if (aiieVar.c()) {
            return;
        }
        this.m = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0019\u0014\u0000\u0002\u000f\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0007ည\u0012\bᐉ\u000b\tဉ\u0010\nᐉ\u0004\u000bᐉ\b\u0010ᐉ\u0006\u0011ᐉ\t\u0012Л\u0013Л\u0014ᐉ\u0007\u0015ဉ\r\u0016ᐉ\n\u0017ᐉ\f\u0018ᐉ\u000e\u0019᠌\u000f", new Object[]{"b", "c", "d", anvw.u, "e", "f", "h", "u", "o", "t", "g", "k", "i", "v", "m", apji.class, "l", apji.class, "j", "q", "n", "p", "r", "s", anms.j});
            case 3:
                return new anzn();
            case 4:
                return new aihf((char[][][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzn.class);
            default:
                return null;
        }
    }
}
