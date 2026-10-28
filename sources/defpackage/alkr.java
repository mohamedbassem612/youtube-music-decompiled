package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkr extends aihn implements aiis {
    public static final alkr a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private amkt g;
    private ajnn h;
    private angb i;
    private alay j;
    private alay k;
    private alay l;
    private alku m;
    private apji n;
    private apji o;
    private alkp p;
    private alkq q;
    private apji r;
    private alay s;
    private byte t = 2;

    static {
        alkr alkrVar = new alkr();
        a = alkrVar;
        aihn.registerDefaultInstance(alkr.class, alkrVar);
    }

    private alkr() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0018\u0011\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\u000bᐉ\u000b\fᐉ\f\rᐉ\u000e\u000fᐉ\u0001\u0011ᐉ\u0011\u0013ᐉ\u0012\u0014ᐉ\r\u0015ᐉ\u0013\u0016ᐉ\u0010\u0017ᐉ\u000f\u0018ᐉ\u0014", new Object[]{"b", "c", "e", "f", "g", "h", "i", "j", "k", "m", "d", "p", "q", "l", "r", "o", "n", "s"});
            case 3:
                return new alkr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkr.class);
            default:
                return null;
        }
    }
}
