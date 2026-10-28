package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asep extends aihn implements aiis {
    public static final asep a;
    public int b;
    public anzd c;
    private byte g = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        asep asepVar = new asep();
        a = asepVar;
        aihn.registerDefaultInstance(asep.class, asepVar);
    }

    private asep() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asep();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asep.class);
            default:
                return null;
        }
    }
}
