package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class akmh extends aihn implements aiis {
    public static final akmh a;
    public int b;
    public alja c;
    public aipe g;
    public aigj h;
    private apji i;
    private byte j = 2;
    public String d = "";
    public String e = "";
    public aiie f = emptyProtobufList();

    static {
        akmh akmhVar = new akmh();
        a = akmhVar;
        aihn.registerDefaultInstance(akmh.class, akmhVar);
    }

    private akmh() {
        emptyProtobufList();
        this.h = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001ဈ\u0002\u0002ᐉ\u0005\u0003ည\u0006\u0004ဈ\u0001\u0005ᐉ\u0000\u0006Л\bᐉ\u0003", new Object[]{"b", "e", "g", "h", "d", "c", "f", alay.class, "i"});
            case 3:
                return new akmh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akmh.class);
            default:
                return null;
        }
    }
}
