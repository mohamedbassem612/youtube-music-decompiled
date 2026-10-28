package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aopy extends aihn implements aiis {
    public static final aopy a;
    public int b;
    public alay d;
    private byte h = 2;
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aopy aopyVar = new aopy();
        a = aopyVar;
        aihn.registerDefaultInstance(aopy.class, aopyVar);
    }

    private aopy() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0003\u0002ᐉ\u0004\u0003ဈ\u0006\u0004ဈ\u0007\u0005ဈ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new aopy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aopy.class);
            default:
                return null;
        }
    }
}
