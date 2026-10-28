package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvc extends aihn implements aiis {
    public static final alvc a;
    public int b;
    public ajhi c;
    private byte d = 2;

    static {
        alvc alvcVar = new alvc();
        a = alvcVar;
        aihn.registerDefaultInstance(alvc.class, alvcVar);
    }

    private alvc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue0c0ⷙ\ue0c0ⷙ\u0001\u0000\u0000\u0001\ue0c0ⷙᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alvc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvc.class);
            default:
                return null;
        }
    }
}
