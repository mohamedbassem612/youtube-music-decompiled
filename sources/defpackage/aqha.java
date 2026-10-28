package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqha extends aihn implements aiis {
    public static final aqha a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private ajwo f;
    private ajwo g;
    private ajwo h;
    private alay i;
    private byte j = 2;

    static {
        aqha aqhaVar = new aqha();
        a = aqhaVar;
        aihn.registerDefaultInstance(aqha.class, aqhaVar);
    }

    private aqha() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqha();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqha.class);
            default:
                return null;
        }
    }
}
