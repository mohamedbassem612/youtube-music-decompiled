package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aldv extends aihn implements aiis {
    public static final aldv a;
    public static final aihl b;
    public int c;
    public int d;
    public ajng e;
    public aldu f;
    public alay g;
    public boolean i;
    private byte j = 2;
    public String h = "";

    static {
        aldv aldvVar = new aldv();
        a = aldvVar;
        aihn.registerDefaultInstance(aldv.class, aldvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aldvVar, aldvVar, null, 99404607, aika.MESSAGE, aldv.class);
    }

    private aldv() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"c", "d", albk.n, "e", "f", "g", "h", "i"});
            case 3:
                return new aldv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldv.class);
            default:
                return null;
        }
    }
}
