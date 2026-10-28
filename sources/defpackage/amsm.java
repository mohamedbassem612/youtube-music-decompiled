package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amsm extends aihn implements aiis {
    public static final amsm a;
    public int b;
    public alay c;
    public alay d;
    public aqmh e;
    private amsn f;
    private amsl g;
    private byte h = 2;

    static {
        amsm amsmVar = new amsm();
        a = amsmVar;
        aihn.registerDefaultInstance(amsm.class, amsmVar);
    }

    private amsm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\n\u0005\u0000\u0000\u0005\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new amsm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amsm.class);
            default:
                return null;
        }
    }
}
