package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aklk extends aihn implements aiis {
    public static final aklk a;
    public int b;
    public airu c;
    public apiu e;
    private byte f = 2;
    public String d = "";

    static {
        aklk aklkVar = new aklk();
        a = aklkVar;
        aihn.registerDefaultInstance(aklk.class, aklkVar);
    }

    private aklk() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0002\u0003ဈ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new aklk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aklk.class);
            default:
                return null;
        }
    }
}
