package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aouo extends aihn implements aiis {
    public static final aouo a;
    public int b;
    public aobx c;
    public aobz d;
    public aoyh e;
    private byte f = 2;

    static {
        aouo aouoVar = new aouo();
        a = aouoVar;
        aihn.registerDefaultInstance(aouo.class, aouoVar);
    }

    private aouo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueee9ᣑﰖ㯒\u0003\u0000\u0000\u0002\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0002ﰖ㯒ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new aouo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aouo.class);
            default:
                return null;
        }
    }
}
