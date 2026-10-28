package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxq extends aihi implements aihj {
    public static final fxq a;
    private int b;
    private fxr c;
    private byte d = 2;

    static {
        fxq fxqVar = new fxq();
        a = fxqVar;
        aihn.registerDefaultInstance(fxq.class, fxqVar);
    }

    private fxq() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0001\u000eᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new fxq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(fxq.class);
            default:
                return null;
        }
    }
}
