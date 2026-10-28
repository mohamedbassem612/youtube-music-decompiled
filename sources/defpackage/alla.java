package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alla extends aihn implements aiis {
    public static final alla a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alla allaVar = new alla();
        a = allaVar;
        aihn.registerDefaultInstance(alla.class, allaVar);
    }

    private alla() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\ue7f5ណ\uf41eⓄ\u0002\u0000\u0000\u0002\ue7f5ណм\u0000\uf41eⓄм\u0000", new Object[]{"c", "b", apoq.class, airj.class});
            case 3:
                return new alla();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alla.class);
            default:
                return null;
        }
    }
}
