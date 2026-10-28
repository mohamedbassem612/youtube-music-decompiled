package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoxu extends aihn implements aiis {
    public static final aoxu a;
    public int b;
    public alcy d;
    private byte e = 2;
    public aiie c = emptyProtobufList();

    static {
        aoxu aoxuVar = new aoxu();
        a = aoxuVar;
        aihn.registerDefaultInstance(aoxu.class, aoxuVar);
    }

    private aoxu() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"b", "c", akgn.class, "d"});
            case 3:
                return new aoxu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxu.class);
            default:
                return null;
        }
    }
}
