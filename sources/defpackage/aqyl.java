package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqyl extends aihn implements aiis {
    public static final aqyl a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private ajng h;
    private ajwo i;
    private byte j = 2;

    static {
        aqyl aqylVar = new aqyl();
        a = aqylVar;
        aihn.registerDefaultInstance(aqyl.class, aqylVar);
    }

    private aqyl() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\u000f\u0007\u0000\u0000\u0007\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u000bᐉ\u0003\u000fᐉ\t", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i"});
            case 3:
                return new aqyl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqyl.class);
            default:
                return null;
        }
    }
}
