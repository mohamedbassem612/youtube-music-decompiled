package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almh extends aihn implements aiis {
    public static final almh a;
    private int b;
    private ajwo c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        almh almhVar = new almh();
        a = almhVar;
        aihn.registerDefaultInstance(almh.class, almhVar);
    }

    private almh() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003ᐉ\u0000\u0006ᐉ\u0002\tᐉ\u0005\nᐉ\u0006\u000bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new almh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almh.class);
            default:
                return null;
        }
    }
}
