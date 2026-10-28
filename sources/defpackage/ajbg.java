package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajbg extends aihn implements aiis {
    public static final ajbg a;
    public int b;
    public ajwo f;
    public int i;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public aiie e = emptyProtobufList();
    public String g = "";
    public String h = "";

    static {
        ajbg ajbgVar = new ajbg();
        a = ajbgVar;
        aihn.registerDefaultInstance(ajbg.class, ajbgVar);
    }

    private ajbg() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ᐉ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007᠌\u0005", new Object[]{"b", "c", "d", "e", amgu.class, "f", "g", "h", "i", alip.i});
            case 3:
                return new ajbg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajbg.class);
            default:
                return null;
        }
    }
}
