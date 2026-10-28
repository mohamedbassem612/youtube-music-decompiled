package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcq extends aihn implements aiis {
    public static final vcq a;
    public int b;
    public int c;
    public aijp d;
    private byte f = 2;
    public aiie e = emptyProtobufList();

    static {
        vcq vcqVar = new vcq();
        a = vcqVar;
        aihn.registerDefaultInstance(vcq.class, vcqVar);
    }

    private vcq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0003ဉ\u0001\u0004Л", new Object[]{"b", "c", anbz.n, "d", "e", aneh.class});
            case 3:
                return new vcq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(vcq.class);
            default:
                return null;
        }
    }
}
