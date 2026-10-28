package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqji extends aihn implements aiis {
    public static final aqji a;
    private int b;
    private aobq c;
    private alhq d;
    private byte e = 2;

    static {
        aqji aqjiVar = new aqji();
        a = aqjiVar;
        aihn.registerDefaultInstance(aqji.class, aqjiVar);
    }

    private aqji() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf3e4\u2e6e\uf3fbヺ\u0002\u0000\u0000\u0002\uf3e4\u2e6eᐉ\u0000\uf3fbヺᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aqji();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqji.class);
            default:
                return null;
        }
    }
}
