package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajiy extends aihn implements aiis {
    public static final ajiy a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private ajwo g;
    private alay h;
    private amkt i;
    private ajnn j;
    private angb k;
    private byte l = 2;

    static {
        ajiy ajiyVar = new ajiy();
        a = ajiyVar;
        aihn.registerDefaultInstance(ajiy.class, ajiyVar);
    }

    private ajiy() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0010\t\u0000\u0000\t\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\bᐉ\t\fᐉ\f\u000eᐉ\u000e\u000fᐉ\u0007\u0010ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "h", "i", "k", "g", "j"});
            case 3:
                return new ajiy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajiy.class);
            default:
                return null;
        }
    }
}
