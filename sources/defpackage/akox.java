package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akox extends aihn implements aiis {
    public static final akox a;
    private int b;
    private ajwo c;
    private alay d;
    private alay e;
    private angb f;
    private alay g;
    private alay h;
    private ajwo i;
    private alhs j;
    private byte k = 2;

    static {
        akox akoxVar = new akox();
        a = akoxVar;
        aihn.registerDefaultInstance(akox.class, akoxVar);
    }

    private akox() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\b\u0012\b\u0000\u0000\b\bᐉ\u000e\tᐉ\u000f\nᐉ\u0010\u000bᐉ\u0012\u000fᐉ\u0007\u0010ᐉ\u0011\u0011ᐉ\t\u0012ᐉ\u0002", new Object[]{"b", "f", "g", "h", "j", "d", "i", "e", "c"});
            case 3:
                return new akox();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akox.class);
            default:
                return null;
        }
    }
}
