package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqbx extends aihn implements aiis {
    public static final aqbx a;
    private int b;
    private alay c;
    private alay d;
    private apji e;
    private apji f;
    private byte g = 2;

    static {
        aqbx aqbxVar = new aqbx();
        a = aqbxVar;
        aihn.registerDefaultInstance(aqbx.class, aqbxVar);
    }

    private aqbx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aqbx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqbx.class);
            default:
                return null;
        }
    }
}
