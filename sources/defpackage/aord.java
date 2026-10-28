package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aord extends aihn implements aiis {
    public static final aord a;
    public aigu b;
    private int c;
    private byte d = 2;

    static {
        aord aordVar = new aord();
        a = aordVar;
        aihn.registerDefaultInstance(aord.class, aordVar);
    }

    private aord() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"c", "b"});
            case 3:
                return new aord();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aord.class);
            default:
                return null;
        }
    }
}
