package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amag extends aihn implements aiis {
    public static final amag a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amag amagVar = new amag();
        a = amagVar;
        aihn.registerDefaultInstance(amag.class, amagVar);
    }

    private amag() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue53c⡇\ue53c⡇\u0001\u0000\u0000\u0001\ue53c⡇м\u0000", new Object[]{"c", "b", aqgy.class});
            case 3:
                return new amag();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amag.class);
            default:
                return null;
        }
    }
}
