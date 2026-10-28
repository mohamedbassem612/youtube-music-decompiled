package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arca extends aihn implements aiis {
    public static final arca a;
    public int b;
    public int d;
    public alay e;
    public alay f;
    public boolean g;
    public ajwo h;
    public int i;
    public int j;
    public int k;
    public int l;
    private byte m = 2;
    public aiie c = emptyProtobufList();

    static {
        arca arcaVar = new arca();
        a = arcaVar;
        aihn.registerDefaultInstance(arca.class, arcaVar);
    }

    private arca() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0001\u0004\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\bᐉ\u0004\n᠌\u0005\u000bဇ\u0003\u000e᠌\t\u000fဋ\u0007\u0010ဋ\b", new Object[]{"b", "c", arcb.class, "d", "e", "f", "h", "i", aram.l, "g", "l", aram.k, "j", "k"});
            case 3:
                return new arca();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arca.class);
            default:
                return null;
        }
    }
}
