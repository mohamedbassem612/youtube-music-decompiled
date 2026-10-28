package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anzs extends aihn implements aiis {
    public static final anzs a;
    public int b;
    public aqmh e;
    public ajwo f;
    public int g;
    private byte h = 2;
    public String c = "";
    public String d = "";

    static {
        anzs anzsVar = new anzs();
        a = anzsVar;
        aihn.registerDefaultInstance(anzs.class, anzsVar);
    }

    private anzs() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", "f", "g", amyr.r});
            case 3:
                return new anzs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anzs.class);
            default:
                return null;
        }
    }
}
