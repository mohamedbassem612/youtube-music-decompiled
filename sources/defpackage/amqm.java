package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amqm extends aihn implements aiis {
    public static final amqm a;
    public static final aihl b;
    public int c;
    public apji e;
    public amqk f;
    public amql h;
    public amqj i;
    public boolean m;
    public apji n;
    public boolean o;
    public int s;
    public apji t;
    public amqp u;
    private amqn v;
    private apji w;
    private apji x;
    private byte y = 2;
    public aiie d = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie j = emptyProtobufList();
    public aigj k = aigj.d;
    public String l = "";
    public String p = "";
    public String q = "";
    public String r = "";

    static {
        amqm amqmVar = new amqm();
        a = amqmVar;
        aihn.registerDefaultInstance(amqm.class, amqmVar);
        b = aihn.newSingularGeneratedExtension(apjh.a, amqmVar, amqmVar, null, 117294427, aika.MESSAGE, amqm.class);
    }

    private amqm() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u001e\u0015\u0000\u0003\f\u0001Л\u0002Л\u0003ᐉ\u0004\u0005ᐉ\u0003\u0006ᐉ\u0001\tည\u0007\fЛ\u000eᐉ\t\u000fဈ\n\u0010ဇ\u000b\u0012ᐉ\u0000\u0013ᐉ\r\u0014ᐉ\u000f\u0015ဈ\u0012\u0016ᐉ\u000e\u0017ဈ\u0013\u0018᠌\u0016\u001aဈ\u0014\u001bᐉ\u0017\u001dဉ\u0018\u001eဇ\u0010", new Object[]{"c", "d", amqo.class, "g", ajwo.class, "i", "h", "f", "k", "j", aktj.class, "v", "l", "m", "e", "w", "n", "p", "x", "q", "s", amoe.d, "r", "t", "u", "o"});
            case 3:
                return new amqm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amqm.class);
            default:
                return null;
        }
    }
}
