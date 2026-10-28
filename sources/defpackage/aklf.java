package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aklf extends aihn implements aiis {
    public static final aklf a;
    private int b;
    private alay c;
    private alay d;
    private byte e = 2;

    static {
        aklf aklfVar = new aklf();
        a = aklfVar;
        aihn.registerDefaultInstance(aklf.class, aklfVar);
    }

    private aklf() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0002\u0005ᐉ\u0000\u0006ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aklf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklf.class);
            default:
                return null;
        }
    }
}
