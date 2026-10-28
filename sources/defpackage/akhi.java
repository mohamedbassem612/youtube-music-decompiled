package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akhi extends aihn implements aiis {
    public static final akhi a;
    public int b;
    public boolean d;
    public ajwo e;
    public ajtt f;
    private byte g = 2;
    public String c = "";

    static {
        akhi akhiVar = new akhi();
        a = akhiVar;
        aihn.registerDefaultInstance(akhi.class, akhiVar);
    }

    private akhi() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဇ\u0002\u0004ဉ\u0004\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new akhi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akhi.class);
            default:
                return null;
        }
    }
}
