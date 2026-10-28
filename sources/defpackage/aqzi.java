package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzi extends aihn implements aiis {
    public static final aqzi a;
    public static final aihl b;
    public int c;
    public alay e;
    public boolean f;
    private byte j = 2;
    public String d = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        aqzi aqziVar = new aqzi();
        a = aqziVar;
        aihn.registerDefaultInstance(aqzi.class, aqziVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqziVar, aqziVar, null, 100723586, aika.MESSAGE, aqzi.class);
    }

    private aqzi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqzi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqzi.class);
            default:
                return null;
        }
    }
}
