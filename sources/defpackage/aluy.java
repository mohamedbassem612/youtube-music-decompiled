package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aluy extends aihn implements aiis {
    public static final aluy a;
    public int b;
    public aogq c;
    public aofa e;
    private byte f = 2;
    public aiie d = emptyProtobufList();

    static {
        aluy aluyVar = new aluy();
        a = aluyVar;
        aihn.registerDefaultInstance(aluy.class, aluyVar);
    }

    private aluy() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"b", "c", "d", aluz.class, "e"});
            case 3:
                return new aluy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aluy.class);
            default:
                return null;
        }
    }
}
