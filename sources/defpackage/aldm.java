package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aldm extends aihn implements aiis {
    public static final aldm a;
    public int b;
    public alop c;
    public ajwo d;
    private albe e;
    private byte f = 2;

    static {
        aldm aldmVar = new aldm();
        a = aldmVar;
        aihn.registerDefaultInstance(aldm.class, aldmVar);
    }

    private aldm() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001̉ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aldm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aldm.class);
            default:
                return null;
        }
    }
}
