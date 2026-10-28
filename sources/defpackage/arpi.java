package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arpi extends aihn implements aiis {
    public static final arpi a;
    public int b;
    public alay c;
    public arpo e;
    public ajng g;
    private arpf h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aigj f = aigj.d;

    static {
        arpi arpiVar = new arpi();
        a = arpiVar;
        aihn.registerDefaultInstance(arpi.class, arpiVar);
    }

    private arpi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0003\u0006ည\u0005\u0007ᐉ\u0006\bᐉ\u0001", new Object[]{"b", "c", "d", alay.class, "h", "f", "g", "e"});
            case 3:
                return new arpi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpi.class);
            default:
                return null;
        }
    }
}
