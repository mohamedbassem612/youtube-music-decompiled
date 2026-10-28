package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqvu extends aihn implements aiis {
    public static final aqvu a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private byte f = 2;

    static {
        aqvu aqvuVar = new aqvu();
        a = aqvuVar;
        aihn.registerDefaultInstance(aqvu.class, aqvuVar);
    }

    private aqvu() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\t\u0003\u0000\u0000\u0003\u0004ᐉ\u0003\u0006ᐉ\u0006\tᐉ\u0004", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new aqvu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqvu.class);
            default:
                return null;
        }
    }
}
