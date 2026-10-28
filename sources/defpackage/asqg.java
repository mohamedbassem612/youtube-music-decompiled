package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqg extends aihn implements aiis {
    public static final asqg a;
    private int b;
    private askp c;
    private ajwo d;
    private byte e = 2;

    static {
        asqg asqgVar = new asqg();
        a = asqgVar;
        aihn.registerDefaultInstance(asqg.class, asqgVar);
    }

    private asqg() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new asqg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqg.class);
            default:
                return null;
        }
    }
}
