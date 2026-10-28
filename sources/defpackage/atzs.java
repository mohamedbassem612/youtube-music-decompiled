package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atzs extends aihn implements aiis {
    public static final atzs a;
    public int b;
    private byte e = 2;
    public String c = "";
    public String d = "";

    static {
        atzs atzsVar = new atzs();
        a = atzsVar;
        aihn.registerDefaultInstance(atzs.class, atzsVar);
    }

    private atzs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new atzs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atzs.class);
            default:
                return null;
        }
    }
}
