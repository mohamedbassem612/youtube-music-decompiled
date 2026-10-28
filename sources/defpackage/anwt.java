package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwt extends aihn implements aiis {
    public static final anwt a;
    public static final aihl b;
    private ajwo A;
    private alay B;
    private ajwo C;
    public int c;
    public alay d;
    public alay e;
    public alay f;
    public alja g;
    public apji m;
    public int n;
    public anwp o;
    public anwr p;
    public anwl q;
    public boolean t;
    public apji u;
    public int v;
    public boolean w;
    private alay z;
    private byte D = 2;
    public aiie h = emptyProtobufList();
    public String i = "";
    public aiie j = emptyProtobufList();
    public aiie k = emptyProtobufList();
    public aiie l = emptyProtobufList();
    public aigj r = aigj.d;
    public aiie s = emptyProtobufList();
    public aiie x = emptyProtobufList();
    public aiie y = emptyProtobufList();

    static {
        anwt anwtVar = new anwt();
        a = anwtVar;
        aihn.registerDefaultInstance(anwt.class, anwtVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, anwtVar, anwtVar, null, 91303872, aika.MESSAGE, anwt.class);
    }

    private anwt() {
    }

    public final void a() {
        aiie aiieVar = this.j;
        if (aiieVar.c()) {
            return;
        }
        this.j = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001 \u001a\u0000\u0007\u0013\u0001ᐉ\u0000\u0002Л\u0006ည\u0010\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\f\fင\u000b\rЛ\u000eᐉ\u0004\u000fЛ\u0010Л\u0011ᐉ\u0002\u0012ᐉ\r\u0013ဉ\u000e\u0014ဇ\u0011\u0016ᐉ\u0013\u0017᠌\u0014\u0018Л\u0019ဇ\u0015\u001aᐉ\n\u001bЛ\u001cဈ\u0005\u001dЛ ᐉ\u0003", new Object[]{"c", "d", "j", anwv.class, "r", "z", "A", "B", "C", "o", "n", "l", anwu.class, "g", "s", anwq.class, "k", anws.class, "e", "p", "q", "t", "u", "v", anvw.d, "h", apji.class, "w", "m", "x", alay.class, "i", "y", anwd.class, "f"});
            case 3:
                return new anwt();
            case 4:
                return new aihf((char[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anwt.class);
            default:
                return null;
        }
    }
}
