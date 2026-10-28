package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aouj extends aihi implements aihj {
    public static final aouj a;
    public static final aihl b;
    private alay A;
    private alay B;
    private alay C;
    private amkt D;
    private angb E;
    private alay F;
    private aouf G;
    private ajnj H;
    private aoul I;
    private ajwo J;
    private alay K;
    public int c;
    public Object e;
    public alay f;
    public aiie g;
    public int h;
    public String i;
    public int k;
    public alay l;
    public alay m;
    public boolean n;
    public aigj o;
    public aiie p;
    public aouh q;
    public int r;
    private int s;
    private ajwo t;
    private apji u;
    private apji v;
    private apji w;
    private apji x;
    private aoui y;
    private apji z;
    public int d = 0;
    private byte L = 2;

    static {
        aouj aoujVar = new aouj();
        a = aoujVar;
        aihn.registerDefaultInstance(aouj.class, aoujVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, aoujVar, aoujVar, null, 50631000, aika.MESSAGE, aouj.class);
    }

    private aouj() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        emptyProtobufList();
        this.i = "";
        this.o = aigj.d;
        this.p = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.L);
            case 1:
                this.L = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001f\u0001\u0002\u00024\u001f\u0000\u0002\u0019\u0002Л\u0003င\u000b\u0005ဈ\r\u0006င\u000e\u0007ᐉ\u0011\bဇ\u0014\u000eᐉ\u001b\u000fЛ\u0010ᐉ\u0012\u0011ᐉ\u0013\u0012ᐉ\u000f\u0014ည\u001a\u0016ᐉ\u0001\u0018ᐉ\u0002\u0019ᐉ\u001d\u001aᐉ\u001e\u001dᐉ\u001f\u001eᐉ \u001fᐉ! ᐉ\"\"м\u0000$ᐉ\u0010%ᐉ%(ᐉ+)ᐉ\t*ᐉ\u0004+ᐉ\u00050င$1ᐉ\n3ᐉ\u00064ᐉ\u0007", new Object[]{"e", "d", "c", "s", "g", aoui.class, "h", "i", "k", "B", "n", "D", "p", aouo.class, "m", "C", "l", "o", "f", "t", "q", "E", "F", "G", "H", "I", apji.class, "A", "J", "K", "y", "u", "v", "r", "z", "w", "x"});
            case 3:
                return new aouj();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aouj.class);
            default:
                return null;
        }
    }
}
