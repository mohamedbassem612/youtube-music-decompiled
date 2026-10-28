package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arar extends aihn implements aiis {
    public static final arar a;
    public static final aihl b;
    public int c;
    public Object e;
    public alay h;
    public alay i;
    public int d = 0;
    private byte l = 2;
    public String f = "";
    public String g = "";
    public String j = "";
    private String k = "";

    static {
        arar ararVar = new arar();
        a = ararVar;
        aihn.registerDefaultInstance(arar.class, ararVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ararVar, ararVar, null, 99402190, aika.MESSAGE, arar.class);
    }

    private arar() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0002\u000b\b\u0000\u0000\u0004\u0002м\u0000\u0003м\u0000\u0005ᐉ\u0005\u0006ᐉ\u0006\bဈ\u0003\tဈ\u0002\nဈ\u0007\u000bဈ\b", new Object[]{"e", "d", "c", ajwo.class, ajwo.class, "h", "i", "g", "f", "j", "k"});
            case 3:
                return new arar();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arar.class);
            default:
                return null;
        }
    }
}
