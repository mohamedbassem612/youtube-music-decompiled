package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atyd extends aihn implements aiis {
    public static final atyd a;
    public static final aihl b;
    public int c;
    public int g;
    public int h;
    private atyf i;
    private aiip j = aiip.a;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        atyd atydVar = new atyd();
        a = atydVar;
        aihn.registerDefaultInstance(atyd.class, atydVar);
        b = aihn.newSingularGeneratedExtension(atxu.a, atydVar, atydVar, null, 27801516, aika.MESSAGE, atyd.class);
    }

    private atyd() {
        emptyIntList();
        this.h = 8;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001$\u0007\u0001\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0004\u0004ဈ\u0005\u0005င\u0010\n᠌\u0011!ᐉ\u0002$2", new Object[]{"c", "d", "e", "f", "g", "h", atxs.d, "i", "j", new ahud(aika.STRING, (Object) "", aika.INT32, (Object) 0)});
            case 3:
                return new atyd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atyd.class);
            default:
                return null;
        }
    }
}
