package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apvl extends aihn implements aiis {
    public static final apvl a;
    public int b;
    public apxa c;
    public apvm d;
    public ajai f;
    private byte g = 2;
    public String e = "";

    static {
        apvl apvlVar = new apvl();
        a = apvlVar;
        aihn.registerDefaultInstance(apvl.class, apvlVar);
    }

    private apvl() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apvl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvl.class);
            default:
                return null;
        }
    }
}
