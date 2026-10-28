package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almq extends aihn implements aiis {
    public static final almq a;
    public int b;
    public alop c;
    public ajqb d;
    public ajwo e;
    public aigj f;
    private albe g;
    private byte h = 2;

    static {
        almq almqVar = new almq();
        a = almqVar;
        aihn.registerDefaultInstance(almq.class, almqVar);
    }

    private almq() {
        emptyProtobufList();
        this.f = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0007ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new almq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almq.class);
            default:
                return null;
        }
    }
}
