package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anfc extends aihn implements aiis {
    public static final anfc a;
    public int b;
    public boolean c;
    public boolean d;
    private alay e;
    private byte f = 2;

    static {
        anfc anfcVar = new anfc();
        a = anfcVar;
        aihn.registerDefaultInstance(anfc.class, anfcVar);
    }

    private anfc() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new anfc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfc.class);
            default:
                return null;
        }
    }
}
