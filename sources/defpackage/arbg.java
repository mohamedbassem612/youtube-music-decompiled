package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arbg extends aihn implements aiis {
    public static final arbg a;
    public int b;
    private alay f;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        arbg arbgVar = new arbg();
        a = arbgVar;
        aihn.registerDefaultInstance(arbg.class, arbgVar);
    }

    private arbg() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0004\bဈ\u0002", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new arbg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arbg.class);
            default:
                return null;
        }
    }
}
