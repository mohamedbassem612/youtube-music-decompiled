package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyr extends aihn implements aiis {
    public static final ajyr a;
    public static final aihl b;
    public int c;
    public aiie d;
    public aiie e;
    public String f;
    private alay g;
    private ajwo h;
    private ajng i;
    private ajys j;
    private alay k;
    private apji l;
    private ajwo m;
    private apji n;
    private apji o;
    private alay p;
    private apji q;
    private ajyx r;
    private byte s = 2;

    static {
        ajyr ajyrVar = new ajyr();
        a = ajyrVar;
        aihn.registerDefaultInstance(ajyr.class, ajyrVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, ajyrVar, ajyrVar, null, 65060753, aika.MESSAGE, ajyr.class);
    }

    private ajyr() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0002\u000e\u0001Л\u0002Л\u0003ᐉ\b\u0006ᐉ\u0003\u0007ᐉ\u000e\bᐉ\u0004\nᐉ\u0000\fᐉ\u0005\u0010ᐉ\t\u0011ᐉ\u000f\u0012ဈ\u0010\u0013ᐉ\u0011\u0017ᐉ\u000b\u0018ᐉ\f\u0019ᐉ\r", new Object[]{"c", "d", ajyf.class, "e", ajyx.class, "k", "h", "p", "i", "g", "j", "l", "q", "f", "r", "m", "n", "o"});
            case 3:
                return new ajyr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyr.class);
            default:
                return null;
        }
    }
}
