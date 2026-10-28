package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alku extends aihn implements aiis {
    public static final alku a;
    private int b;
    private anfy c;
    private byte d = 2;

    static {
        alku alkuVar = new alku();
        a = alkuVar;
        aihn.registerDefaultInstance(alku.class, alkuVar);
    }

    private alku() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueaaaᾮ\ueaaaᾮ\u0001\u0000\u0000\u0001\ueaaaᾮᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alku();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alku.class);
            default:
                return null;
        }
    }
}
