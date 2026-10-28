package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfo extends aihn implements aiis {
    public static final alfo a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private ajwo f;
    private angb g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private byte m = 2;

    static {
        alfo alfoVar = new alfo();
        a = alfoVar;
        aihn.registerDefaultInstance(alfo.class, alfoVar);
    }

    private alfo() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0014\n\u0000\u0000\n\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\t\tᐉ\u0006\nᐉ\u000b\u000bᐉ\f\u000eᐉ\u0011\u000fᐉ\n\u0010ᐉ\u0007\u0014ᐉ\u0005", new Object[]{"b", "c", "d", "h", "f", "j", "k", "l", "i", "g", "e"});
            case 3:
                return new alfo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfo.class);
            default:
                return null;
        }
    }
}
