package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajnf extends aihi implements aihj {
    public static final ajnf a;
    private apji B;
    private ajwo C;
    private ajwo D;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public int i;
    public int k;
    public boolean l;
    public alay m;
    public alhs p;
    public ajwo q;
    public ajwo r;
    public ajwo s;
    public aiqd u;
    public aiqe v;
    public aipe w;
    public int x;
    public amud z;
    public int c = 0;
    public int e = 0;
    public int g = 0;
    private byte E = 2;
    public String n = "";
    public String o = "";
    public aiie t = emptyProtobufList();
    public aigj y = aigj.d;
    public String A = "";

    static {
        ajnf ajnfVar = new ajnf();
        a = ajnfVar;
        aihn.registerDefaultInstance(ajnf.class, ajnfVar);
    }

    private ajnf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                this.E = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = aqvi.d;
                return newMessageInfo(a, "\u0001\u001c\u0003\u0001\u0001ϧ\u001c\u0000\u0001\r\u0001\u083f\u0000\u0002᠌\u0000\u0003ဇ\u0003\u0005ᐉ\u0006\u0007ᐉ\u000b\bм\u0001\tᐉ\f\nဉ\u0011\u000bဈ\u0007\fᐉ\u0013\rည\u0015\u000eᐉ\n\u0010ဉ\u0012\u0011<\u0000\u0012ဈ\t\u0013ᐉ\r\u0014<\u0000\u0015Л\u0016᠌\u0014\u0019᠌\u0001\u001aᐉ\u000e\u001bм\u0002\u001cᐉ\u000f\u001dဈ\u0017\"ᐉ\u0002#\u083f\u0001$\u083f\u0002ϧᐉ\u0016", new Object[]{"d", "c", "f", "e", "h", "g", "b", ajhk.i, "i", ajhk.h, "l", "m", "q", alja.class, "r", "u", "n", "w", "y", "p", "v", ajne.class, "o", "s", aqle.class, "t", ajwo.class, "x", ajhk.g, "k", ajhk.f, "C", alja.class, "D", "A", "B", aihtVar, aihtVar, "z"});
            case 3:
                return new ajnf();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnf.class);
            default:
                return null;
        }
    }
}
