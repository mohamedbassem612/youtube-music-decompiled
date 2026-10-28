package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anjc extends aihn implements aiis {
    public static final anjc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajng f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private ajwo n;
    private ajkl o;
    private ajkl p;
    private ajkl q;
    private ajap r;
    private amgr s;
    private angb t;
    private ajng u;
    private byte v = 2;

    static {
        anjc anjcVar = new anjc();
        a = anjcVar;
        aihn.registerDefaultInstance(anjc.class, anjcVar);
    }

    private anjc() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0003$\u0013\u0000\u0000\u0013\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\u000b\u000bᐉ\r\u000eᐉ\u0011\u0012ᐉ\t\u0013ᐉ\u0012\u0015ᐉ\f\u0016ᐉ\u0013\u0018ᐉ\u000e\u0019ᐉ\u000f\u001aᐉ\u0010\u001cᐉ\u0003!ᐉ\u0005$ᐉ\u0019", new Object[]{"b", "c", "e", "g", "h", "i", "k", "l", "n", "r", "j", "s", "m", "t", "o", "p", "q", "d", "f", "u"});
            case 3:
                return new anjc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjc.class);
            default:
                return null;
        }
    }
}
