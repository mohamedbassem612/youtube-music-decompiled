package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajul extends aihn implements aiis {
    public static final aihw a = new aiat(7);
    public static final aihw b = new aiat(8);
    public static final ajul c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int m;
    private alay o;
    private byte p = 2;
    public aihv k = emptyIntList();
    public aihv l = emptyIntList();
    public aigj n = aigj.d;

    static {
        ajul ajulVar = new ajul();
        c = ajulVar;
        aihn.registerDefaultInstance(ajul.class, ajulVar);
    }

    private ajul() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                aiht aihtVar = aofw.n;
                return newMessageInfo(c, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0002\u0001\u0001ᐉ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0005ည\f\u0007ဇ\b\bဇ\u0004\tဇ\u0006\nဇ\u0005\u000bࠬ\f᠌\t\u000fࠬ", new Object[]{"d", "o", "e", "f", "n", "j", "g", "i", "h", "k", aihtVar, "m", aihtVar, "l", aihtVar});
            case 3:
                return new ajul();
            case 4:
                return new aihf(c);
            case 5:
                return c;
            case 6:
                return aihn.getParserForClass(ajul.class);
            default:
                return null;
        }
    }
}
