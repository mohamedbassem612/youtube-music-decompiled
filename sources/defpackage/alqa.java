package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alqa extends aihn implements aiis {
    public static final alqa a;
    public alop b;
    private int d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        alqa alqaVar = new alqa();
        a = alqaVar;
        aihn.registerDefaultInstance(alqa.class, alqaVar);
    }

    private alqa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"d", "b", "c", aotr.class});
            case 3:
                return new alqa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqa.class);
            default:
                return null;
        }
    }
}
