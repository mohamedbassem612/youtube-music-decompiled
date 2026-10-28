package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alkq extends aihn implements aiis {
    public static final alkq a;
    private int b;
    private albx c;
    private byte d = 2;

    static {
        alkq alkqVar = new alkq();
        a = alkqVar;
        aihn.registerDefaultInstance(alkq.class, alkqVar);
    }

    private alkq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf1f7㨈\uf1f7㨈\u0001\u0000\u0000\u0001\uf1f7㨈ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alkq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkq.class);
            default:
                return null;
        }
    }
}
