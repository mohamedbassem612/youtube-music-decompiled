package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vsv extends aihn implements aiis {
    public static final vsv a;
    public int b;
    public vss d;
    public vsu e;
    private byte f = 2;
    public String c = "";

    static {
        vsv vsvVar = new vsv();
        a = vsvVar;
        aihn.registerDefaultInstance(vsv.class, vsvVar);
    }

    private vsv() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ለ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new vsv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(vsv.class);
            default:
                return null;
        }
    }
}
