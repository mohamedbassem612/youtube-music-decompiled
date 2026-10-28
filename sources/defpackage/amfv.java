package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amfv extends aihn implements aiis {
    public static final amfv a;
    private int b;
    private ajwo c;
    private ajwo d;
    private ajwo e;
    private ajwo f;
    private amfu g;
    private byte h = 2;

    static {
        amfv amfvVar = new amfv();
        a = amfvVar;
        aihn.registerDefaultInstance(amfv.class, amfvVar);
    }

    private amfv() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0005\u0007ᐉ\u0004\tᐉ\u0002", new Object[]{"b", "c", "d", "g", "f", "e"});
            case 3:
                return new amfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amfv.class);
            default:
                return null;
        }
    }
}
