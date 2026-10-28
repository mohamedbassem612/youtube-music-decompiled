package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzv extends aihn implements aiis {
    public static final atzv a;
    public int b;
    public atzw c;
    public boolean d;
    public akgx e;
    public akgs f;
    private byte g = 2;

    static {
        atzv atzvVar = new atzv();
        a = atzvVar;
        aihn.registerDefaultInstance(atzv.class, atzvVar);
    }

    private atzv() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0003ဇ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new atzv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atzv.class);
            default:
                return null;
        }
    }
}
