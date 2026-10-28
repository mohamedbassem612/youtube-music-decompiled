package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqys extends aihn implements aiis {
    public static final aqys a;
    private int b;
    private ajng c;
    private alay d;
    private apji e;
    private apji f;
    private alay g;
    private alay h;
    private alay i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        aqys aqysVar = new aqys();
        a = aqysVar;
        aihn.registerDefaultInstance(aqys.class, aqysVar);
    }

    private aqys() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0004\u0011\t\u0000\u0000\t\u0004ᐉ\u0004\u0005ᐉ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\n\u000eᐉ\u000b\u000fᐉ\f\u0011ᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "h"});
            case 3:
                return new aqys();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqys.class);
            default:
                return null;
        }
    }
}
