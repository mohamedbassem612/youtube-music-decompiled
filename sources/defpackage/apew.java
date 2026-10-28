package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apew extends aihn implements aiis {
    public static final apew a;
    public int b;
    public ajwo c;
    private alay d;
    private ajwo e;
    private alay f;
    private alay g;
    private alay h;
    private apji i;
    private byte j = 2;

    static {
        apew apewVar = new apew();
        a = apewVar;
        aihn.registerDefaultInstance(apew.class, apewVar);
    }

    private apew() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0010\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\nᐉ\u0001\u000fᐉ\u0003\u0010ᐉ\u0007", new Object[]{"b", "d", "f", "c", "h", "e", "g", "i"});
            case 3:
                return new apew();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apew.class);
            default:
                return null;
        }
    }
}
