package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amso extends aihn implements aiis {
    public static final amso a;
    public int b;
    public amsm c;
    private byte d = 2;

    static {
        amso amsoVar = new amso();
        a = amsoVar;
        aihn.registerDefaultInstance(amso.class, amsoVar);
    }

    private amso() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uee84㳖\uee84㳖\u0001\u0000\u0000\u0001\uee84㳖ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new amso();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amso.class);
            default:
                return null;
        }
    }
}
