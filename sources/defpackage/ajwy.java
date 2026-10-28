package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajwy extends aihn implements aiis {
    public static final ajwy a;
    private int b;
    private ajwz c;
    private ajwx d;
    private ajxa e;
    private byte f = 2;

    static {
        ajwy ajwyVar = new ajwy();
        a = ajwyVar;
        aihn.registerDefaultInstance(ajwy.class, ajwyVar);
    }

    private ajwy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue552㰻\uedd0䲹\u0003\u0000\u0000\u0003\ue552㰻ᐉ\u0000\ue2e7㲩ᐉ\u0001\uedd0䲹ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajwy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwy.class);
            default:
                return null;
        }
    }
}
