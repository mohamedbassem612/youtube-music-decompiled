package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqsy extends aihn implements aiis {
    public static final aqsy a;
    public static final aihl b;
    public aqsz c;
    private int d;
    private byte e = 2;

    static {
        aqsy aqsyVar = new aqsy();
        a = aqsyVar;
        aihn.registerDefaultInstance(aqsy.class, aqsyVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqsyVar, aqsyVar, null, 128200871, aika.MESSAGE, aqsy.class);
    }

    private aqsy() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\uf34d㲔\uf34d㲔\u0001\u0000\u0000\u0001\uf34d㲔ᐉ\u0000", new Object[]{"d", "c"});
            case 3:
                return new aqsy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqsy.class);
            default:
                return null;
        }
    }
}
