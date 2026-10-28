package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class area extends aihn implements aiis {
    public static final area a;
    private ajwo A;
    private byte B = 2;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private arec g;
    private aqev h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private areb p;
    private alay q;
    private ajkl r;
    private ajkl s;
    private amkt t;
    private ajnn u;
    private ardz v;
    private apji w;
    private apji x;
    private ardy y;
    private angb z;

    static {
        area areaVar = new area();
        a = areaVar;
        aihn.registerDefaultInstance(area.class, areaVar);
    }

    private area() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0001/\u0018\u0000\u0000\u0018\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\f\fᐉ\u000e\u0010ᐉ\u0013\u0017ᐉ\u0011\u0018ᐉ\u0019\u001bᐉ\u000b ᐉ!!ᐉ\u0004%ᐉ#&ᐉ$'ᐉ\u001a(ᐉ\u0015)ᐉ\u0016*ᐉ\u001b.ᐉ\u001c/ᐉ\u001d", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "n", "o", "q", "p", "t", "m", "y", "g", "z", "A", "u", "r", "s", "v", "w", "x"});
            case 3:
                return new area();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(area.class);
            default:
                return null;
        }
    }
}
