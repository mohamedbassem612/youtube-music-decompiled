package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfy extends aihn implements aiis {
    public static final anfy a;
    public int b;
    public aigj e;
    public ange f;
    public boolean g;
    public aiqe h;
    public boolean i;
    public ajwo j;
    private anfr k;
    private ajwo l;
    private apji m;
    private ariu n;
    private byte o = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        anfy anfyVar = new anfy();
        a = anfyVar;
        aihn.registerDefaultInstance(anfy.class, anfyVar);
    }

    private anfy() {
        emptyProtobufList();
        this.e = aigj.d;
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.d;
        if (aiieVar.c()) {
            return;
        }
        this.d = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0018\f\u0000\u0002\b\u0001Л\u0004ည\u0001\u0005ᐉ\u0002\u0006Л\u0007ᐉ\u0003\bဇ\u0004\nဉ\b\u000fᐉ\n\u0011ᐉ\u000e\u0013ဇ\u0010\u0015ᐉ\u0011\u0018ᐉ\u0014", new Object[]{"b", "c", anfv.class, "e", "f", "d", angf.class, "k", "g", "h", "l", "m", "i", "j", "n"});
            case 3:
                return new anfy();
            case 4:
                return new aihf((boolean[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfy.class);
            default:
                return null;
        }
    }
}
