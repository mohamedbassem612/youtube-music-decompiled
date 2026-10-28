package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class argb extends aihi implements aihj {
    public static final argb a;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private ajsc g;
    private alay h;
    private alay i;
    private alay k;
    private ajwo l;
    private arga m;
    private angb n;
    private ajwo o;
    private apji p;
    private ajkl q;
    private ajkl r;
    private ajkl s;
    private alay t;
    private aqyz u;
    private apji v;
    private apji w;
    private ajwo x;
    private apji y;
    private byte z = 2;

    static {
        argb argbVar = new argb();
        a = argbVar;
        aihn.registerDefaultInstance(argb.class, argbVar);
    }

    private argb() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0002\u0001%\u0015\u0000\u0000\u0015\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\tᐉ\n\u0010ᐉ\u0004\u0011ᐉ\u0014\u0012ᐉ\u0015\u0013ᐉ\u0016\u0014ᐉ\u0017\u0015ᐉ\u0007\u0017ᐉ\u0018\u001dᐉ\u001c\u001fᐉ  ᐉ!\"ᐉ\r$ᐉ\u000e%ᐉ\u001d", new Object[]{"b", "c", "d", "e", "f", "h", "i", "l", "m", "n", "g", "q", "r", "s", "t", "k", "u", "v", "x", "y", "o", "p", "w"});
            case 3:
                return new argb();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(argb.class);
            default:
                return null;
        }
    }
}
