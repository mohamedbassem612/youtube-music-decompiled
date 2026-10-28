package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhv extends aihn implements aiis {
    public static final auhv a;
    public int b;
    public Object d;
    public int c = 0;
    private byte f = 2;
    public String e = "";

    static {
        auhv auhvVar = new auhv();
        a = auhvVar;
        aihn.registerDefaultInstance(auhv.class, auhvVar);
    }

    private auhv() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002м\u0000", new Object[]{"d", "c", "b", "e", auih.class});
            case 3:
                return new auhv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auhv.class);
            default:
                return null;
        }
    }
}
