package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aipg extends aihn implements aiis {
    public static final aipg a;
    private byte e = 2;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();

    static {
        aipg aipgVar = new aipg();
        a = aipgVar;
        aihn.registerDefaultInstance(aipg.class, aipgVar);
    }

    private aipg() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001Л\u0002\u001b\u0003\u001b", new Object[]{"b", aipi.class, "c", aipf.class, "d", aiph.class});
            case 3:
                return new aipg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aipg.class);
            default:
                return null;
        }
    }
}
