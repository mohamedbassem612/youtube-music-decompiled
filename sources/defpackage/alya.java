package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alya extends aihn implements aiis {
    public static final alya a;
    public alop b;
    public alye e;
    private int f;
    private alay g;
    private apji h;
    private albe i;
    private byte j = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        alya alyaVar = new alya();
        a = alyaVar;
        aihn.registerDefaultInstance(alya.class, alyaVar);
    }

    private alya() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0002\u0007\u0001ᐉ\u0000\u0006Л\u0007Л\bᐉ\u0003\u000bᐉ\u0001\fᐉ\u0002̉ᐉ\u0006", new Object[]{"f", "b", "c", alye.class, "d", alyb.class, "e", "g", "h", "i"});
            case 3:
                return new alya();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alya.class);
            default:
                return null;
        }
    }
}
