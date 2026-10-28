package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbc extends aihn implements aiis {
    public static final akbc a;
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
    private ajwo m;
    private angb n;
    private byte o = 2;

    static {
        akbc akbcVar = new akbc();
        a = akbcVar;
        aihn.registerDefaultInstance(akbc.class, akbcVar);
    }

    private akbc() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0004\u0014\f\u0000\u0000\f\u0004ᐉ\u0003\u0006ᐉ\u0004\bᐉ\u0005\nᐉ\u0006\fᐉ\u0007\rᐉ\b\u000fᐉ\n\u0010ᐉ\u000b\u0011ᐉ\f\u0012ᐉ\r\u0013ᐉ\u000e\u0014ᐉ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new akbc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbc.class);
            default:
                return null;
        }
    }
}
