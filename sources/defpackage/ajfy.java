package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajfy extends aihn implements aiis {
    public static final ajfy a;
    public int b;
    public apvy f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public aiie g = emptyProtobufList();

    static {
        ajfy ajfyVar = new ajfy();
        a = ajfyVar;
        aihn.registerDefaultInstance(ajfy.class, ajfyVar);
    }

    private ajfy() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0006ဉ\u0005\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", "g", ajgi.class});
            case 3:
                return new ajfy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajfy.class);
            default:
                return null;
        }
    }
}
