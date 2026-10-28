package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alzx extends aihn implements aiis {
    public static final alzx a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alzx alzxVar = new alzx();
        a = alzxVar;
        aihn.registerDefaultInstance(alzx.class, alzxVar);
    }

    private alzx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf321Ẑ\ue16f㳩\u0006\u0000\u0000\u0006\uf321Ẑм\u0000\ueaaaᾮм\u0000\uf42fⓣм\u0000\ueaae┢м\u0000\ue282㘿м\u0000\ue16f㳩м\u0000", new Object[]{"c", "b", akdd.class, anfy.class, apzw.class, aokf.class, apkc.class, amhw.class});
            case 3:
                return new alzx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzx.class);
            default:
                return null;
        }
    }
}
