package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aors extends aihn implements aiis {
    public static final aors a;
    private int b;
    private aorr c;
    private aorz d;
    private byte e = 2;

    static {
        aors aorsVar = new aors();
        a = aorsVar;
        aihn.registerDefaultInstance(aors.class, aorsVar);
    }

    private aors() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uedd3⯱立㵯\u0002\u0000\u0000\u0002\uedd3⯱ᐉ\u0000立㵯ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aors();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aors.class);
            default:
                return null;
        }
    }
}
