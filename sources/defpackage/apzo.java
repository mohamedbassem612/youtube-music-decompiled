package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzo extends aihn implements aiis {
    public static final apzo a;
    public int b;
    public ajwo c;
    private apzn d;
    private byte e = 2;

    static {
        apzo apzoVar = new apzo();
        a = apzoVar;
        aihn.registerDefaultInstance(apzo.class, apzoVar);
    }

    private apzo() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0001\u0002ᐉ\u0002", new Object[]{"b", "d", "c"});
            case 3:
                return new apzo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzo.class);
            default:
                return null;
        }
    }
}
