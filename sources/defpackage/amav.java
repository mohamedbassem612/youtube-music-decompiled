package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amav extends aihn implements aiis {
    public static final amav a;
    public int b;
    public alop c;
    public amat d;
    private albe f;
    private byte g = 2;
    public aiie e = emptyProtobufList();

    static {
        amav amavVar = new amav();
        a = amavVar;
        aihn.registerDefaultInstance(amav.class, amavVar);
    }

    private amav() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л̉ᐉ\u0002", new Object[]{"b", "c", "d", "e", ajwo.class, "f"});
            case 3:
                return new amav();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amav.class);
            default:
                return null;
        }
    }
}
