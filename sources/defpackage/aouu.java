package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aouu extends aihn implements aiis {
    public static final aouu a;
    public apji b;
    private int d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        aouu aouuVar = new aouu();
        a = aouuVar;
        aihn.registerDefaultInstance(aouu.class, aouuVar);
    }

    private aouu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"d", "b", "c", aour.class});
            case 3:
                return new aouu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aouu.class);
            default:
                return null;
        }
    }
}
