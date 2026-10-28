package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aloa extends aihn implements aiis {
    public static final aloa a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        aloa aloaVar = new aloa();
        a = aloaVar;
        aihn.registerDefaultInstance(aloa.class, aloaVar);
    }

    private aloa() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue87bᶳ\ue87bᶳ\u0001\u0000\u0000\u0001\ue87bᶳм\u0000", new Object[]{"c", "b", ajye.class});
            case 3:
                return new aloa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloa.class);
            default:
                return null;
        }
    }
}
