package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alae extends aihn implements aiis {
    public static final alae a;
    public int b;
    public apji d;
    public apji e;
    public apji f;
    public float g;
    public ajwo h;
    public ajwo i;
    public ajwo j;
    public apmn k;
    public alad l;
    private byte m = 2;
    public String c = "";

    static {
        alae alaeVar = new alae();
        a = alaeVar;
        aihn.registerDefaultInstance(alae.class, alaeVar);
    }

    private alae() {
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
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\b\u0006ဉ\t\u0007ခ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "k", "l", "g", "h", "i", "j"});
            case 3:
                return new alae();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alae.class);
            default:
                return null;
        }
    }
}
