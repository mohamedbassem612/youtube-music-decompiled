package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiwf extends aihn implements aiis {
    public static final aiwf a;
    private int b;
    private auis c;
    private fxq d;
    private fxq e;
    private fxs f;
    private fxq g;
    private aios h;
    private byte i = 2;

    static {
        aiwf aiwfVar = new aiwf();
        a = aiwfVar;
        aihn.registerDefaultInstance(aiwf.class, aiwfVar);
    }

    private aiwf() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\rᐉ\t\u0014ᐉ\u0005\u0018ᐉ\u0007\u001bᐉ\b\u001cᐉ\u0006", new Object[]{"b", "c", "h", "d", "f", "g", "e"});
            case 3:
                return new aiwf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiwf.class);
            default:
                return null;
        }
    }
}
