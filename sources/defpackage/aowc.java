package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aowc extends aihi implements aihj {
    public static final aowc a;
    public String b;
    private int c;
    private int d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private ajwo k;
    private ajkl l;
    private ajkl m;
    private ajkl n;
    private ajng o;
    private angb p;
    private aowb q;
    private ajwo r;
    private alay s;
    private aqyz t;
    private apji u;
    private apji v;
    private apji w;
    private byte x = 2;

    static {
        aowc aowcVar = new aowc();
        a = aowcVar;
        aihn.registerDefaultInstance(aowc.class, aowcVar);
    }

    private aowc() {
        emptyProtobufList();
        emptyProtobufList();
        this.b = "";
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0002\u0003'\u0013\u0000\u0000\u0012\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0006\nဈ\f\u000fᐉ\u0011\u0013ᐉ\u0010\u0015ᐉ\u0016\u0017ᐉ\u0017\u0018ᐉ\t\u001aᐉ\n\u001bᐉ\b\u001cᐉ\u0019 ᐉ\u000b!ᐉ\u001c#ᐉ\u001e%ᐉ\u0005'ᐉ ", new Object[]{"c", "d", "e", "f", "g", "h", "k", "b", "q", "p", "r", "s", "m", "n", "l", "t", "o", "u", "v", "i", "w"});
            case 3:
                return new aowc();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowc.class);
            default:
                return null;
        }
    }
}
