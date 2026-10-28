package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajek extends aihn implements aiis {
    public static final ajek a;
    public int b;
    public ajwo e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        ajek ajekVar = new ajek();
        a = ajekVar;
        aihn.registerDefaultInstance(ajek.class, ajekVar);
    }

    private ajek() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0004ᐉ\u0003\u0005Л\u0006Л", new Object[]{"b", "c", "d", "e", "f", ajwo.class, "g", ajwo.class});
            case 3:
                return new ajek();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajek.class);
            default:
                return null;
        }
    }
}
