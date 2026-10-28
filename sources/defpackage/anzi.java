package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzi extends aihi implements aihj {
    public static final anzi a;
    public apji A;
    public apji B;
    public int b;
    public apji c;
    public int d;
    public alay e;
    public int f;
    public alay g;
    public alay h;
    public ajwo i;
    public ajwo k;
    public apji l;
    public apji m;
    public aiqe o;
    public apji p;
    public anzh q;
    public int r;
    public apji s;
    public aiie t;
    public aiie u;
    public anst v;
    public apji w;
    public int x;
    public int y;
    public boolean z;
    private byte C = 2;
    public aigj n = aigj.d;

    static {
        anzi anziVar = new anzi();
        a = anziVar;
        aihn.registerDefaultInstance(anzi.class, anziVar);
    }

    private anzi() {
        emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = emptyProtobufList();
    }

    public final void d() {
        aiie aiieVar = this.u;
        if (aiieVar.c()) {
            return;
        }
        this.u = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001\u001b\u0019\u0000\u0002\u000f\u0001ᐉ\u0000\u0002᠌\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0007ည\u000b\bဉ\f\tᐉ\r\nᐉ\u0007\u000bᐉ\u0002\fဉ\u000e\r᠌\u000f\u000eᐉ\u0010\u000fЛ\u0010ᐉ\b\u0011Л\u0012ဉ\u0011\u0013ᐉ\u0012\u0014᠌\u0013\u0016᠌\u0014\u0017᠌\u0001\u0018ဇ\u0015\u0019ᐉ\t\u001aᐉ\u0016\u001bᐉ\u0017", new Object[]{"b", "c", "f", anvw.s, "g", "h", "i", "n", "o", "p", "k", "e", "q", "r", anms.p, "s", "t", apji.class, "l", "u", apji.class, "v", "w", "x", anms.j, "y", anvw.r, "d", anvw.t, "z", "m", "A", "B"});
            case 3:
                return new anzi();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzi.class);
            default:
                return null;
        }
    }

    public final void e() {
        aiie aiieVar = this.t;
        if (aiieVar.c()) {
            return;
        }
        this.t = aihn.mutableCopy(aiieVar);
    }
}
