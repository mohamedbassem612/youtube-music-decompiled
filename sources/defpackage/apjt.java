package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apjt extends aihn implements aiis {
    public static final apjt a;
    public int b;
    public amgj d;
    private byte g = 2;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        apjt apjtVar = new apjt();
        a = apjtVar;
        aihn.registerDefaultInstance(apjt.class, apjtVar);
    }

    private apjt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apjt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apjt.class);
            default:
                return null;
        }
    }
}
