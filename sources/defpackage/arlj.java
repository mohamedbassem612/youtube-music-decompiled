package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arlj extends aihn implements aiis {
    public static final arlj a;
    public int b;
    public arma c;
    public armm d;
    public arlz e;
    public int f;
    public int g;
    public arlh h;
    private ajwo i;
    private ajwo j;
    private ajwo k;
    private aiip l;
    private aiip m;
    private byte n;

    static {
        arlj arljVar = new arlj();
        a = arljVar;
        aihn.registerDefaultInstance(arlj.class, arljVar);
    }

    private arlj() {
        aiip aiipVar = aiip.a;
        this.l = aiipVar;
        this.m = aiipVar;
        this.n = (byte) 2;
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                aika aikaVar = aika.STRING;
                aika aikaVar2 = aika.MESSAGE;
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u0012\u000b\u0002\u0000\u0004\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u0006᠌\u0004\rᐉ\u0007\u000eᐉ\b\u000fᐉ\t\u0010ဉ\n\u0011в\u00122", new Object[]{"b", "c", "d", "e", "f", albk.l, "g", albk.k, "i", "j", "k", "h", "l", new ahud(aikaVar, "", aikaVar2, ajwo.a), "m", new ahud(aikaVar, "", aikaVar2, apbk.a)});
            case 3:
                return new arlj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arlj.class);
            default:
                return null;
        }
    }
}
