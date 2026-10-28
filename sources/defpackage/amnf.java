package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amnf extends aihn implements aiis {
    public static final amnf a;
    public Object c;
    public aiqe d;
    private int e;
    public int b = 0;
    private byte f = 2;

    static {
        amnf amnfVar = new amnf();
        a = amnfVar;
        aihn.registerDefaultInstance(amnf.class, amnfVar);
    }

    private amnf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000\u0004ဉ\u0001", new Object[]{"c", "b", "e", alja.class, aqmh.class, "d"});
            case 3:
                return new amnf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amnf.class);
            default:
                return null;
        }
    }
}
