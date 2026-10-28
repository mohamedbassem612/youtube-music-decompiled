package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alxl extends aihn implements aiis {
    public static final alxl a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alxl alxlVar = new alxl();
        a = alxlVar;
        aihn.registerDefaultInstance(alxl.class, alxlVar);
    }

    private alxl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue7f5ណ\ue02a⦨\u0003\u0000\u0000\u0003\ue7f5ណм\u0000\uf7cbᢸм\u0000\ue02a⦨м\u0000", new Object[]{"c", "b", apoq.class, apun.class, apny.class});
            case 3:
                return new alxl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxl.class);
            default:
                return null;
        }
    }
}
