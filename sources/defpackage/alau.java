package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alau extends aihn implements aiis {
    public static final alau a;
    private int b;
    private alay c;
    private ajwo d;
    private alay e;
    private byte f = 2;

    static {
        alau alauVar = new alau();
        a = alauVar;
        aihn.registerDefaultInstance(alau.class, alauVar);
    }

    private alau() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0007ᐉ\u0006\tᐉ\b", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alau();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alau.class);
            default:
                return null;
        }
    }
}
