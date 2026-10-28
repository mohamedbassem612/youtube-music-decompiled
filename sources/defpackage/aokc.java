package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokc extends aihn implements aiis {
    public static final aokc a;
    public int b;
    public alay c;
    public aoke e;
    public boolean f;
    public ajwo g;
    public aiie h;
    public aigj i;
    private alay j;
    private ajwo k;
    private byte l = 2;
    public aiie d = emptyProtobufList();

    static {
        aokc aokcVar = new aokc();
        a = aokcVar;
        aihn.registerDefaultInstance(aokc.class, aokcVar);
    }

    private aokc() {
        emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0012\t\u0000\u0002\u0007\u0001ᐉ\u0000\u0006ည\f\bЛ\tᐉ\u0004\nဇ\u0005\fᐉ\u0006\rᐉ\u0007\u000fЛ\u0012ᐉ\u0001", new Object[]{"b", "c", "i", "d", aoka.class, "e", "f", "g", "k", "h", ajwo.class, "j"});
            case 3:
                return new aokc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aokc.class);
            default:
                return null;
        }
    }
}
