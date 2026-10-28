package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahac extends aihn implements aiis {
    public static final ahac a;
    public int b;
    public int f;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ahac ahacVar = new ahac();
        a = ahacVar;
        aihn.registerDefaultInstance(ahac.class, ahacVar);
    }

    private ahac() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ahac();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ahac.class);
            default:
                return null;
        }
    }
}
