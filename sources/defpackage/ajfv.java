package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajfv extends aihn implements aiis {
    public static final ajfv a;
    public int b;
    public ajwo e;
    private byte g = 2;
    public String c = "";
    public String d = "";
    public aiie f = emptyProtobufList();

    static {
        ajfv ajfvVar = new ajfv();
        a = ajfvVar;
        aihn.registerDefaultInstance(ajfv.class, ajfvVar);
    }

    private ajfv() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ᐉ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", ajgi.class});
            case 3:
                return new ajfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfv.class);
            default:
                return null;
        }
    }
}
