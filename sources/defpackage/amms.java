package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amms extends aihn implements aiis {
    public static final amms a;
    public static final aihl b;
    public int c;
    public alay d;
    public alay e;
    public alay f;
    private byte h = 2;
    public String g = "";

    static {
        amms ammsVar = new amms();
        a = ammsVar;
        aihn.registerDefaultInstance(amms.class, ammsVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, ammsVar, ammsVar, null, 133968669, aika.MESSAGE, amms.class);
    }

    private amms() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0003\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"c", "d", "g", "e", "f"});
            case 3:
                return new amms();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amms.class);
            default:
                return null;
        }
    }
}
