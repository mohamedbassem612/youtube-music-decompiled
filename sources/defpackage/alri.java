package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alri extends aihn implements aiis {
    public static final alri a;
    public alop b;
    public aiie c;
    private int d;
    private ajwo e;
    private albe f;
    private byte g = 2;

    static {
        alri alriVar = new alri();
        a = alriVar;
        aihn.registerDefaultInstance(alri.class, alriVar);
    }

    private alri() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0004Л\u0005ᐉ\u0001̉ᐉ\u0002", new Object[]{"d", "b", "c", ajwo.class, "e", "f"});
            case 3:
                return new alri();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alri.class);
            default:
                return null;
        }
    }
}
