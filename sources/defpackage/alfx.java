package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfx extends aihn implements aiis {
    public static final alfx a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private alay f;
    private alay g;
    private ajkl h;
    private ajkl i;
    private apji j;
    private apji k;
    private angb l;
    private byte m = 2;

    static {
        alfx alfxVar = new alfx();
        a = alfxVar;
        aihn.registerDefaultInstance(alfx.class, alfxVar);
    }

    private alfx() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\n\u0001ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\n\rᐉ\u0003\u000eᐉ\t\u000fᐉ\u0006\u0011ᐉ\b", new Object[]{"b", "c", "d", "f", "g", "i", "l", "e", "k", "h", "j"});
            case 3:
                return new alfx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfx.class);
            default:
                return null;
        }
    }
}
