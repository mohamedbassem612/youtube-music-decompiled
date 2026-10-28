package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almf extends aihn implements aiis {
    public static final almf a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        almf almfVar = new almf();
        a = almfVar;
        aihn.registerDefaultInstance(almf.class, almfVar);
    }

    private almf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue53c⡇\ue932귣\u0003\u0000\u0000\u0003\ue53c⡇м\u0000\uec8bꎥм\u0000\ue932귣м\u0000", new Object[]{"c", "b", aqgy.class, anji.class, ajwq.class});
            case 3:
                return new almf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almf.class);
            default:
                return null;
        }
    }
}
