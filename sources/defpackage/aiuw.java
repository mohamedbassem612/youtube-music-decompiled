package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aiuw extends aihn implements aiis {
    public static final aiuw a;
    private int b;
    private aios c;
    private fxq d;
    private fxq e;
    private fxq f;
    private fxq g;
    private fxq h;
    private fxq i;
    private fxq j;
    private fxq k;
    private fxq l;
    private fxq m;
    private fxq n;
    private fxq o;
    private fxq p;
    private byte q = 2;

    static {
        aiuw aiuwVar = new aiuw();
        a = aiuwVar;
        aihn.registerDefaultInstance(aiuw.class, aiuwVar);
    }

    private aiuw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\fᐉ\u0007\rᐉ\b\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u0003\u0011ᐉ\u000b\u0012ᐉ\u0004\u0015ᐉ\r\u0016ᐉ\u000e\u0017ᐉ\u000f\u0018ᐉ\u0010", new Object[]{"b", "c", "d", "e", "h", "i", "j", "k", "f", "l", "g", "m", "n", "o", "p"});
            case 3:
                return new aiuw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiuw.class);
            default:
                return null;
        }
    }
}
