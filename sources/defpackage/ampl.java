package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ampl extends aihn implements aiis {
    public static final ampl a;
    public int b;
    public aqmh c;
    public ampm d;
    public aiie e;
    public aiie f;
    public aiie g;
    public ampi h;
    public ampi i;
    public ampi j;
    public ampi k;
    public apji l;
    public ajwo m;
    public ajwo n;
    public apji o;
    private alay p;
    private ampj q;
    private byte r = 2;

    static {
        ampl amplVar = new ampl();
        a = amplVar;
        aihn.registerDefaultInstance(ampl.class, amplVar);
    }

    private ampl() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0017\u000f\u0000\u0003\u000f\u0001ᐉ\u0000\u0003ᐉ\u0005\u0004Л\u0005ᐉ\u0007\u0006Л\u0007Л\nᐉ\u0001\fᐉ\f\u000eᐉ\u000e\u000fᐉ\u0010\u0010ᐉ\u000f\u0011ᐉ\b\u0015ᐉ\u0006\u0016ᐉ\t\u0017ᐉ\n", new Object[]{"b", "p", "d", "g", ampi.class, "h", "e", ampk.class, "f", ampj.class, "c", "l", "m", "o", "n", "i", "q", "j", "k"});
            case 3:
                return new ampl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ampl.class);
            default:
                return null;
        }
    }
}
