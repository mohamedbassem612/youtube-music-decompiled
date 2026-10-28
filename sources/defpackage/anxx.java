package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anxx extends aihn implements aiis {
    public static final anxx a;
    public int b;
    public anxy c;
    public anxy d;
    public int e;
    private byte f = 2;

    static {
        anxx anxxVar = new anxx();
        a = anxxVar;
        aihn.registerDefaultInstance(anxx.class, anxxVar);
    }

    private anxx() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", "d", "e", anvw.n});
            case 3:
                return new anxx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anxx.class);
            default:
                return null;
        }
    }
}
