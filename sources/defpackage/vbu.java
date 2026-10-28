package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbu extends aihn implements aiis {
    public static final vbu a;
    public int b;
    public int d;
    public int e;
    private byte f = 2;
    public String c = "";

    static {
        vbu vbuVar = new vbu();
        a = vbuVar;
        aihn.registerDefaultInstance(vbu.class, vbuVar);
    }

    private vbu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new vbu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(vbu.class);
            default:
                return null;
        }
    }
}
