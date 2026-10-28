package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apcv extends aihn implements aiis {
    public static final apcv a;
    public static final aihl b;
    public alja c;
    public alay d;
    public alay e;
    public alay f;
    public alja g;
    public alja h;
    public apji i;
    public alja j;
    public alay k;
    public apji l;
    public apji m;
    public alay n;
    public alay o;
    private int p;
    private byte q = 2;

    static {
        apcv apcvVar = new apcv();
        a = apcvVar;
        aihn.registerDefaultInstance(apcv.class, apcvVar);
        b = aihn.newSingularGeneratedExtension(apji.a, apcvVar, apcvVar, null, 2366, aika.MESSAGE, apcv.class);
    }

    private apcv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u0005\fᐉ\u000b\rᐉ\f", new Object[]{"p", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "h", "n", "o"});
            case 3:
                return new apcv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcv.class);
            default:
                return null;
        }
    }
}
