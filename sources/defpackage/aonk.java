package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aonk extends aihn implements aiis {
    public static final aonk a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private apji f;
    private apji g;
    private ajwo h;
    private byte i = 2;

    static {
        aonk aonkVar = new aonk();
        a = aonkVar;
        aihn.registerDefaultInstance(aonk.class, aonkVar);
    }

    private aonk() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0003\u0013\u0006\u0000\u0000\u0006\u0003ᐉ\u0002\u000bᐉ\u000b\rᐉ\u0003\u000eᐉ\u0004\u0012ᐉ\u000e\u0013ᐉ\f", new Object[]{"b", "c", "f", "d", "e", "h", "g"});
            case 3:
                return new aonk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aonk.class);
            default:
                return null;
        }
    }
}
