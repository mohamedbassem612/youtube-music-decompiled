package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajyo extends aihn implements aiis {
    public static final ajyo a;
    public int b;
    public ajyn c;
    private byte d = 2;

    static {
        ajyo ajyoVar = new ajyo();
        a = ajyoVar;
        aihn.registerDefaultInstance(ajyo.class, ajyoVar);
    }

    private ajyo() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf1a6㵧\uf1a6㵧\u0001\u0000\u0000\u0001\uf1a6㵧ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajyo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyo.class);
            default:
                return null;
        }
    }
}
