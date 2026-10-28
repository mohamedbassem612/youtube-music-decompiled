package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aodk extends aihn implements aiis {
    public static final aodk a;
    public alay b;
    private int d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        aodk aodkVar = new aodk();
        a = aodkVar;
        aihn.registerDefaultInstance(aodk.class, aodkVar);
    }

    private aodk() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"d", "b", "c", alay.class});
            case 3:
                return new aodk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aodk.class);
            default:
                return null;
        }
    }
}
