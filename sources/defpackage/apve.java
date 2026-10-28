package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apve extends aihn implements aiis {
    public static final apve a;
    private int b;
    private apvf c;
    private byte d = 2;

    static {
        apve apveVar = new apve();
        a = apveVar;
        aihn.registerDefaultInstance(apve.class, apveVar);
    }

    private apve() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001  \u0001\u0000\u0000\u0001 ᐉ\u0015", new Object[]{"b", "c"});
            case 3:
                return new apve();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apve.class);
            default:
                return null;
        }
    }
}
