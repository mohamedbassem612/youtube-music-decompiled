package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anry extends aihn implements aiis {
    public static final anry a;
    public int b;
    public alay c;
    public boolean d;
    private byte h = 2;
    public String e = "";
    public String f = "";
    public aigj g = aigj.d;

    static {
        anry anryVar = new anry();
        a = anryVar;
        aihn.registerDefaultInstance(anry.class, anryVar);
    }

    private anry() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ည\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new anry();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anry.class);
            default:
                return null;
        }
    }
}
