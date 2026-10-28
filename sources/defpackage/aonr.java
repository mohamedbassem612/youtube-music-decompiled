package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aonr extends aihn implements aiis {
    public static final aonr a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private ajkl h;
    private ajkl i;
    private ajkl j;
    private alay k;
    private alay l;
    private angb m;
    private byte n = 2;

    static {
        aonr aonrVar = new aonr();
        a = aonrVar;
        aihn.registerDefaultInstance(aonr.class, aonrVar);
    }

    private aonr() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0012\u000b\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\u000bᐉ\f\fᐉ\b\u000eᐉ\u000e\u000fᐉ\u0007\u0010ᐉ\t\u0012ᐉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "k", "i", "l", "h", "j", "m"});
            case 3:
                return new aonr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonr.class);
            default:
                return null;
        }
    }
}
