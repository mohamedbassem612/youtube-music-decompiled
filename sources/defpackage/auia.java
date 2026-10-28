package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auia extends aihn implements aiis {
    public static final auia a;
    public auie b;
    private int c;
    private akij d;
    private byte e = 2;

    static {
        auia auiaVar = new auia();
        a = auiaVar;
        aihn.registerDefaultInstance(auia.class, auiaVar);
    }

    private auia() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"c", "b", "d"});
            case 3:
                return new auia();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auia.class);
            default:
                return null;
        }
    }
}
