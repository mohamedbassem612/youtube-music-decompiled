package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alic extends aihi implements aihj {
    public static final alic a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        alic alicVar = new alic();
        a = alicVar;
        aihn.registerDefaultInstance(alic.class, alicVar);
    }

    private alic() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new alic();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alic.class);
            default:
                return null;
        }
    }
}
