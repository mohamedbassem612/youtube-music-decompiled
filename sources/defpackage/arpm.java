package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arpm extends aihn implements aiis {
    public static final arpm a;
    public int b;
    public arpg c;
    private arpj d;
    private byte e = 2;

    static {
        arpm arpmVar = new arpm();
        a = arpmVar;
        aihn.registerDefaultInstance(arpm.class, arpmVar);
    }

    private arpm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001連ᬜ\uf8f0ᶅ\u0002\u0000\u0000\u0002連ᬜᐉ\u0000\uf8f0ᶅᐉ\u0001", new Object[]{"b", "d", "c"});
            case 3:
                return new arpm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpm.class);
            default:
                return null;
        }
    }
}
