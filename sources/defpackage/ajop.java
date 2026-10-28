package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajop extends aihn implements aiis {
    public static final ajop a;
    private int b;
    private aobx c;
    private byte d = 2;

    static {
        ajop ajopVar = new ajop();
        a = ajopVar;
        aihn.registerDefaultInstance(ajop.class, ajopVar);
    }

    private ajop() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueee9ᣑ\ueee9ᣑ\u0001\u0000\u0000\u0001\ueee9ᣑᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new ajop();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajop.class);
            default:
                return null;
        }
    }
}
