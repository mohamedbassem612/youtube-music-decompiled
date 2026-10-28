package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class allk extends aihn implements aiis {
    public static final allk a;
    public int b;
    public alop c;
    public aigj d;
    public aigj e;
    public ajwo f;
    public allg g;
    public int h;
    public aiie i;
    private alxi j;
    private almd k;
    private amae l;
    private aoll m;
    private byte n = 2;

    static {
        allk allkVar = new allk();
        a = allkVar;
        aihn.registerDefaultInstance(allk.class, allkVar);
    }

    private allk() {
        aigj aigjVar = aigj.d;
        this.d = aigjVar;
        this.e = aigjVar;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001+\u000b\u0000\u0001\u0007\u0001ᐉ\u0000\u0004ည\u0002\tည\u0003\rᐉ\t\u000eᐉ\n\u000fᐉ\u000b\u0010ᐉ\b\u0012ᐉ\u0010\u0014\u001a\u0019᠌\u0011+ᐉ\f", new Object[]{"b", "c", "d", "e", "j", "k", "l", "f", "g", "i", "h", alip.s, "m"});
            case 3:
                return new allk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allk.class);
            default:
                return null;
        }
    }
}
