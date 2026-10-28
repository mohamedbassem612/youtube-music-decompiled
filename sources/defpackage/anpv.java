package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anpv extends aihn implements aiis {
    public static final aihw a = new aiat(14);
    public static final anpv b;
    public int c;
    public alja d;
    public aiqe e;
    public aihv f;
    public alay g;
    public ajwo h;
    public int i;
    private byte j = 2;

    static {
        anpv anpvVar = new anpv();
        b = anpvVar;
        aihn.registerDefaultInstance(anpv.class, anpvVar);
    }

    private anpv() {
        aigj aigjVar = aigj.d;
        this.f = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0001\u0003\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ࠬ\u0006ᐉ\u0004\u0007ᐉ\u0005\b᠌\u0006", new Object[]{"c", "d", "e", "f", anms.h, "g", "h", "i", anms.i});
            case 3:
                return new anpv();
            case 4:
                return new aihf(b);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(anpv.class);
            default:
                return null;
        }
    }
}
