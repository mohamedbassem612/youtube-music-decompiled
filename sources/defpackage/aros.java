package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aros extends aihn implements aiis {
    public static final aros a;
    public static final aihl b;
    public int c;
    public long g;
    public amqw i;
    public arot j;
    public long m;
    public aqoy n;
    public ajwn p;
    private byte q = 2;
    public String d = "";
    public aigj e = aigj.d;
    public String f = "";
    public String h = "";
    public aiie k = emptyProtobufList();
    public String l = "";
    public String o = "";

    static {
        aros arosVar = new aros();
        a = arosVar;
        aihn.registerDefaultInstance(aros.class, arosVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arosVar, arosVar, null, 95253721, aika.MESSAGE, aros.class);
    }

    private aros() {
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u0003\u0001ဈ\u0000\u0003ᐉ\u0006\u0004ည\u0001\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\tЛ\nဈ\t\u000bဃ\n\fဈ\u0002\u000eဉ\u000b\u000fဈ\f\u0010ᐉ\r", new Object[]{"c", "d", "j", "e", "g", "h", "i", "k", ajwo.class, "l", "m", "f", "n", "o", "p"});
            case 3:
                return new aros();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aros.class);
            default:
                return null;
        }
    }
}
