package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amnz extends aihn implements aiis {
    public static final amnz a;
    private int b;
    private amoa c;
    private byte d = 2;

    static {
        amnz amnzVar = new amnz();
        a = amnzVar;
        aihn.registerDefaultInstance(amnz.class, amnzVar);
    }

    private amnz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001Ｖ䊽Ｖ䊽\u0001\u0000\u0000\u0001Ｖ䊽ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new amnz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amnz.class);
            default:
                return null;
        }
    }
}
