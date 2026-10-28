package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajnu extends aihn implements aiis {
    public static final ajnu a;
    public int b;
    public akwz e;
    public aiui f;
    private ajwo g;
    private byte h = 2;
    public String c = "";
    public aiie d = emptyProtobufList();

    static {
        ajnu ajnuVar = new ajnu();
        a = ajnuVar;
        aihn.registerDefaultInstance(ajnu.class, ajnuVar);
    }

    private ajnu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0001", new Object[]{"b", "c", "d", aivk.class, "e", "f", "g"});
            case 3:
                return new ajnu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajnu.class);
            default:
                return null;
        }
    }
}
