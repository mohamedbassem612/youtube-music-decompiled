package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asce extends aihn implements aiis {
    public static final asce a;
    public int b;
    public ankd c;
    public ascf e;
    public boolean f;
    public boolean g;
    public int h;
    public anqt i;
    public float j;
    private byte k = 2;
    public aiie d = emptyProtobufList();

    static {
        asce asceVar = new asce();
        a = asceVar;
        aihn.registerDefaultInstance(asce.class, asceVar);
    }

    private asce() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bခ\u0006", new Object[]{"b", "c", "d", anzd.class, "e", "f", "g", "h", "i", "j"});
            case 3:
                return new asce();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asce.class);
            default:
                return null;
        }
    }
}
