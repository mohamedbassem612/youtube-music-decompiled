package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajyd extends aihn implements aiis {
    public static final ajyd a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private byte f = 2;

    static {
        ajyd ajydVar = new ajyd();
        a = ajydVar;
        aihn.registerDefaultInstance(ajyd.class, ajydVar);
    }

    private ajyd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ajyd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyd.class);
            default:
                return null;
        }
    }
}
