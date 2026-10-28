package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apdm extends aihn implements aiis {
    public static final apdm a;
    public int b;
    public boolean c;
    private byte d = 2;

    static {
        apdm apdmVar = new apdm();
        a = apdmVar;
        aihn.registerDefaultInstance(apdm.class, apdmVar);
    }

    private apdm() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apdm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apdm.class);
            default:
                return null;
        }
    }
}
