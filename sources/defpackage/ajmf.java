package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajmf extends aihn implements aiis {
    public static final ajmf a;
    public int b;
    public boolean f;
    public ajmh g;
    public ajmi h;
    public int i;
    public aokt j;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ajmf ajmfVar = new ajmf();
        a = ajmfVar;
        aihn.registerDefaultInstance(ajmf.class, ajmfVar);
    }

    private ajmf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u0012\b\u0000\u0000\u0002\u0002ဈ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ᐉ\u0005\u0007ဇ\u0004\bဉ\u0006\u000e᠌\n\u0012ᐉ\u000e", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", ajhk.e, "j"});
            case 3:
                return new ajmf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajmf.class);
            default:
                return null;
        }
    }
}
