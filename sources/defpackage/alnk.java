package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alnk extends aihn implements aiis {
    public static final alnk a;
    private int b;
    private alno c;
    private alnm d;
    private byte e = 2;

    static {
        alnk alnkVar = new alnk();
        a = alnkVar;
        aihn.registerDefaultInstance(alnk.class, alnkVar);
    }

    private alnk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0001", new Object[]{"b", "d", "c"});
            case 3:
                return new alnk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alnk.class);
            default:
                return null;
        }
    }
}
