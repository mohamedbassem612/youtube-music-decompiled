package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhn extends aihn implements aiis {
    public static final ajhn a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private byte g = 2;

    static {
        ajhn ajhnVar = new ajhn();
        a = ajhnVar;
        aihn.registerDefaultInstance(ajhn.class, ajhnVar);
    }

    private ajhn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new ajhn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajhn.class);
            default:
                return null;
        }
    }
}
