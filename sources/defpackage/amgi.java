package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amgi extends aihn implements aiis {
    public static final amgi a;
    public int b;
    public aobx c;
    public aoyh d;
    public apho e;
    public aqmx f;
    private byte g = 2;

    static {
        amgi amgiVar = new amgi();
        a = amgiVar;
        aihn.registerDefaultInstance(amgi.class, amgiVar);
    }

    private amgi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueee9ᣑ\uec98↊\u0004\u0000\u0000\u0003\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001\uf697᳗ᐉ\u0002\uec98↊ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new amgi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amgi.class);
            default:
                return null;
        }
    }
}
