package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apfc extends aihn implements aiis {
    public static final apfc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private byte j = 2;

    static {
        apfc apfcVar = new apfc();
        a = apfcVar;
        aihn.registerDefaultInstance(apfc.class, apfcVar);
    }

    private apfc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0006\u0006ᐉ\n\tᐉ\u0004\u000bᐉ\u000b\fᐉ\f\rᐉ\u0001", new Object[]{"b", "c", "f", "g", "e", "h", "i", "d"});
            case 3:
                return new apfc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apfc.class);
            default:
                return null;
        }
    }
}
