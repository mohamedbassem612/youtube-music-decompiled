package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anlj extends aihn implements aiis {
    public static final anlj a;
    public int b;
    public apji d;
    public alay e;
    public alay f;
    public apji i;
    public ajwo j;
    public apji k;
    public alja l;
    public apji n;
    public alay o;
    private byte p = 2;
    public aigj c = aigj.d;
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aiie m = emptyProtobufList();

    static {
        anlj anljVar = new anlj();
        a = anljVar;
        aihn.registerDefaultInstance(anlj.class, anljVar);
    }

    private anlj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0005\u0017\r\u0000\u0003\f\u0005ည\u0000\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004\u000eЛ\u000fЛ\u0010ᐉ\u0005\u0011ᐉ\u0006\u0012ᐉ\u0007\u0013ᐉ\b\u0014Л\u0016ᐉ\n\u0017ᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", apji.class, "h", apji.class, "i", "j", "k", "l", "m", apji.class, "n", "o"});
            case 3:
                return new anlj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anlj.class);
            default:
                return null;
        }
    }
}
