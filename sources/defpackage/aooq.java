package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aooq extends aihi implements aihj {
    public static final aooq a;
    public int b;
    public aofo e;
    public long g;
    public int h;
    public long i;
    private byte q = 2;
    public String c = "";
    public aigj d = aigj.d;
    public String f = "";
    public String k = "";
    public String l = "";
    public aiie m = emptyProtobufList();
    public String n = "";
    public String o = "";
    public String p = "";

    static {
        aooq aooqVar = new aooq();
        a = aooqVar;
        aihn.registerDefaultInstance(aooq.class, aooqVar);
    }

    private aooq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0004\u0004ဈ\b\u0005\u001a\u0006ဈ\t\u0007ဈ\n\bဈ\u0003\tဂ\u0006\nဈ\u000b\u000bဈ\u0007\f᠌\u0005\rဉ\u0002", new Object[]{"b", "c", "d", "g", "l", "m", "n", "o", "f", "i", "p", "k", "h", aomi.k, "e"});
            case 3:
                return new aooq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aooq.class);
            default:
                return null;
        }
    }
}
