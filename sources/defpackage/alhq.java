package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alhq extends aihn implements aiis {
    public static final alhq a;
    public int b;
    public alhn d;
    public alho e;
    public long f;
    public alhp g;
    public alhr h;
    public alhm i;
    private byte k = 2;
    public String c = "";
    public aiie j = emptyProtobufList();

    static {
        alhq alhqVar = new alhq();
        a = alhqVar;
        aihn.registerDefaultInstance(alhq.class, alhqVar);
    }

    private alhq() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007Л\bဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", ajwo.class, "i"});
            case 3:
                return new alhq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alhq.class);
            default:
                return null;
        }
    }
}
