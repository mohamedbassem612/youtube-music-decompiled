package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aojl extends aihn implements aiis {
    public static final aojl a;
    public static final aihl b;
    public int c;
    public int d;
    public ajwo f;
    public ajwo g;
    private byte h = 2;
    public String e = "";

    static {
        aojl aojlVar = new aojl();
        a = aojlVar;
        aihn.registerDefaultInstance(aojl.class, aojlVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aojlVar, aojlVar, null, 22630, aika.MESSAGE, aojl.class);
    }

    private aojl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", aofw.o, "e", "f", "g"});
            case 3:
                return new aojl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aojl.class);
            default:
                return null;
        }
    }
}
