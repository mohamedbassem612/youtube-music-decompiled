package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqgj extends aihn implements aiis {
    public static final aqgj a;
    public int b;
    public alay c;
    public ajwo d;
    public boolean e;
    private byte f = 2;

    static {
        aqgj aqgjVar = new aqgj();
        a = aqgjVar;
        aihn.registerDefaultInstance(aqgj.class, aqgjVar);
    }

    private aqgj() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqgj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqgj.class);
            default:
                return null;
        }
    }
}
