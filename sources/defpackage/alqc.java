package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqc extends aihn implements aiis {
    public static final alqc a;
    private apji B;
    private apji C;
    private apji D;
    private apji E;
    public int b;
    public alop c;
    public apez d;
    public alvt e;
    public int f;
    public int h;
    public int i;
    public albe j;
    public ajwo k;
    public apji m;
    public apji n;
    public apji p;
    public ajwo q;
    public ajwo r;
    public aijp s;
    public apji u;
    public apji w;
    public apji x;
    public apji y;
    private byte F = 2;
    public aigj g = aigj.d;
    public String l = "";
    public aiie o = emptyProtobufList();
    public String t = "";
    public aiie v = emptyProtobufList();
    public aiie z = emptyProtobufList();
    public aiie A = emptyProtobufList();

    static {
        alqc alqcVar = new alqc();
        a = alqcVar;
        aihn.registerDefaultInstance(alqc.class, alqcVar);
    }

    private alqc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                this.F = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = apdr.c;
                return newMessageInfo(a, "\u0004\u001d\u0000\u0001\u0001̉\u001d\u0000\u0004\u0016\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0007᠌\u0003\nည\u0006\f᠌\u0007\rᐉ\n\u000eဈ\u000b\u000fᐉ\f\u0010ᐉ\u000e\u0011Л\u0012ᐉ\u000f\u0013ᐉ\r\u0015ᐉ\u0010\u0016ᐉ\u0012\u0017ဉ\u0013\u0018ဈ\u0014\u0019ᐉ\u0015\u001bᐉ\u0017\u001cЛ\u001dᐉ\u0011\u001eᐉ\u0018\u001fᐉ\u0019 ᐉ\u001a!Л\"Л#᠌\b$ᐉ\u001b̉ᐉ\t", new Object[]{"b", "c", "d", "e", "f", aotj.r, "g", "h", aihtVar, "k", "l", "B", "n", "o", akuf.class, "p", "m", "q", "C", "s", "t", "u", "D", "v", apji.class, "r", "w", "x", "y", "z", apzr.class, "A", apji.class, "i", aihtVar, "E", "j"});
            case 3:
                return new alqc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqc.class);
            default:
                return null;
        }
    }
}
