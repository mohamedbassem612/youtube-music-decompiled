package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akgs extends aihn implements aiis {
    public static final akgs a;
    public float b;
    private int c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        akgs akgsVar = new akgs();
        a = akgsVar;
        aihn.registerDefaultInstance(akgs.class, akgsVar);
    }

    private akgs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ခ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "b"});
            case 3:
                return new akgs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgs.class);
            default:
                return null;
        }
    }
}
