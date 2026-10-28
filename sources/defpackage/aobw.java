package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobw extends aihn implements aiis {
    public static final aobw a;
    private int b;
    private alay c;
    private aobv d;
    private byte e = 2;

    static {
        aobw aobwVar = new aobw();
        a = aobwVar;
        aihn.registerDefaultInstance(aobw.class, aobwVar);
    }

    private aobw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0004ᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new aobw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aobw.class);
            default:
                return null;
        }
    }
}
