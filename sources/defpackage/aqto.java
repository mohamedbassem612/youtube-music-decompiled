package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqto extends aihn implements aiis {
    public static final aqto a;
    public int b;
    public aqmh c;
    public aqmh d;
    public aqtn e;
    public alay f;
    public arpo h;
    public ajng i;
    public aqtk j;
    private alay l;
    private alay m;
    private alay n;
    private alay o;
    private byte p = 2;
    public aiie g = emptyProtobufList();
    public aigj k = aigj.d;

    static {
        aqto aqtoVar = new aqto();
        a = aqtoVar;
        aihn.registerDefaultInstance(aqto.class, aqtoVar);
    }

    private aqto() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\b\u0006ည\u0011\u0007ᐉ\u0001\bᐉ\u0005\tᐉ\t\u000bЛ\fᐉ\u0007\u000eဉ\u0002\u000fᐉ\f\u0013ᐉ\u0006", new Object[]{"b", "c", "l", "f", "i", "k", "d", "m", "o", "g", alay.class, "h", "e", "j", "n"});
            case 3:
                return new aqto();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqto.class);
            default:
                return null;
        }
    }
}
