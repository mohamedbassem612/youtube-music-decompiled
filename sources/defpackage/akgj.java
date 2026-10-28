package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akgj extends aihn implements aiis {
    public static final akgj a;
    public static final aihl b;
    public int c;
    public alay e;
    public boolean f;
    public boolean i;
    public alay j;
    private alay l;
    private byte m = 2;
    public String d = "";
    public String g = "";
    public String h = "";
    public String k = "";

    static {
        akgj akgjVar = new akgj();
        a = akgjVar;
        aihn.registerDefaultInstance(akgj.class, akgjVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, akgjVar, akgjVar, null, 66712070, aika.MESSAGE, akgj.class);
    }

    private akgj() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0003\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tᐉ\b\nဈ\t", new Object[]{"c", "d", "l", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new akgj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akgj.class);
            default:
                return null;
        }
    }
}
