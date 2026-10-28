package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yfx extends aihn implements aiis {
    public static final yfx a;
    public int b;
    public long d;
    private byte f = 2;
    public String c = "";
    public aiie e = emptyProtobufList();

    static {
        yfx yfxVar = new yfx();
        a = yfxVar;
        aihn.registerDefaultInstance(yfx.class, yfxVar);
    }

    private yfx() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဂ\u0001\u0003Л", new Object[]{"b", "c", "d", "e", yfv.class});
            case 3:
                return new yfx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(yfx.class);
            default:
                return null;
        }
    }
}
