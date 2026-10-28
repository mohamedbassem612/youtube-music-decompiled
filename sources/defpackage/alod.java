package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alod extends aihn implements aiis {
    public static final alod a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alod alodVar = new alod();
        a = alodVar;
        aihn.registerDefaultInstance(alod.class, alodVar);
    }

    private alod() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ue809ᶳ\ue87bᶳ\u0002\u0000\u0000\u0002\ue809ᶳм\u0000\ue87bᶳм\u0000", new Object[]{"c", "b", ajza.class, ajye.class});
            case 3:
                return new alod();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alod.class);
            default:
                return null;
        }
    }
}
