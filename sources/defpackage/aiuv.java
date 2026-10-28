package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiuv extends aihn implements aiis {
    public static final aiuv a;
    public int b;
    public alay c;
    public alay d;
    public alay e;
    public ajwo f;
    public aqmh g;
    public ajwo h;
    private alay i;
    private ajwo j;
    private ajwo k;
    private apji l;
    private byte m = 2;

    static {
        aiuv aiuvVar = new aiuv();
        a = aiuvVar;
        aihn.registerDefaultInstance(aiuv.class, aiuvVar);
    }

    private aiuv() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u000b\nᐉ\u000e\u000bᐉ\u000f\fᐉ\u0001\u0010ᐉ\b\u0013ᐉ\u0010", new Object[]{"b", "c", "e", "f", "g", "j", "h", "k", "d", "i", "l"});
            case 3:
                return new aiuv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiuv.class);
            default:
                return null;
        }
    }
}
