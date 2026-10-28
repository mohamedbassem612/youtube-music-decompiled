package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alxj extends aihn implements aiis {
    public static final alxj a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alxj alxjVar = new alxj();
        a = alxjVar;
        aihn.registerDefaultInstance(alxj.class, alxjVar);
    }

    private alxj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\ue7f5ណ\ueaaa䯴\u0006\u0000\u0000\u0006\ue7f5ណм\u0000\ue1faᠿм\u0000\ue592᯦м\u0000\ue3bf᳙м\u0000\uebfa╈м\u0000\ueaaa䯴м\u0000", new Object[]{"c", "b", apoq.class, alxp.class, angn.class, alxo.class, alxe.class, aqyr.class});
            case 3:
                return new alxj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxj.class);
            default:
                return null;
        }
    }
}
