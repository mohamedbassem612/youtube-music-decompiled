package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajew extends aihn implements aiis {
    public static final ajew a;
    public boolean f;
    private int h;
    private ajwo i;
    private ajwo j;
    private byte k = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie g = emptyProtobufList();

    static {
        ajew ajewVar = new ajew();
        a = ajewVar;
        aihn.registerDefaultInstance(ajew.class, ajewVar);
    }

    private ajew() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\r\b\u0000\u0001\u0003\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\b\u0006Л\u000bᐉ\t\rᐉ\n", new Object[]{"h", "b", "c", "d", "e", "f", "g", ajwo.class, "i", "j"});
            case 3:
                return new ajew();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajew.class);
            default:
                return null;
        }
    }
}
