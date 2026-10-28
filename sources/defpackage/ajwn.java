package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajwn extends aihn implements aiis {
    public static final ajwn a;
    public int b;
    public ajwo c;
    public ajwo d;
    public ajwo e;
    public ajwo f;
    private byte g = 2;

    static {
        ajwn ajwnVar = new ajwn();
        a = ajwnVar;
        aihn.registerDefaultInstance(ajwn.class, ajwnVar);
    }

    private ajwn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajwn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajwn.class);
            default:
                return null;
        }
    }
}
