package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class algc extends aihn implements aiis {
    public static final algc a;
    private int b;
    private alay c;
    private apji d;
    private byte e = 2;

    static {
        algc algcVar = new algc();
        a = algcVar;
        aihn.registerDefaultInstance(algc.class, algcVar);
    }

    private algc() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\b\u000b\u0002\u0000\u0000\u0002\bᐉ\u0001\u000bᐉ\u0005", new Object[]{"b", "c", "d"});
            case 3:
                return new algc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(algc.class);
            default:
                return null;
        }
    }
}
