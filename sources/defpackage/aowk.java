package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aowk extends aihn implements aiis {
    public static final aowk a;
    public int b;
    public Object d;
    public apji e;
    public boolean h;
    public String i;
    private alay j;
    private alay k;
    private alay l;
    private apji m;
    public int c = 0;
    private byte n = 2;
    public aiie f = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        aowk aowkVar = new aowk();
        a = aowkVar;
        aihn.registerDefaultInstance(aowk.class, aowkVar);
    }

    private aowk() {
        emptyProtobufList();
        this.i = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u0012\n\u0000\u0001\u0006\u0001ᐉ\u0002\u0002Л\u0005ည\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\r;\u0000\u000eᐉ\u0001\u000fဇ\u000b\u0010ᐉ\f\u0012ဈ\u000e", new Object[]{"d", "c", "b", "j", "f", aowi.class, "g", "k", "l", "e", "h", "m", "i"});
            case 3:
                return new aowk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aowk.class);
            default:
                return null;
        }
    }
}
