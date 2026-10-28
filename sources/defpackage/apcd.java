package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcd extends aihn implements aiis {
    public static final apcd a;
    public int b;
    public boolean e;
    public ajwo f;
    private byte g = 2;
    public String c = "";
    public String d = "";

    static {
        apcd apcdVar = new apcd();
        a = apcdVar;
        aihn.registerDefaultInstance(apcd.class, apcdVar);
    }

    private apcd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apcd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcd.class);
            default:
                return null;
        }
    }
}
