package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apvk extends aihn implements aiis {
    public static final apvk a;
    public apji b;
    private int c;
    private apji d;
    private byte e = 2;

    static {
        apvk apvkVar = new apvk();
        a = apvkVar;
        aihn.registerDefaultInstance(apvk.class, apvkVar);
    }

    private apvk() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0007ᐉ\u0001", new Object[]{"c", "d", "b"});
            case 3:
                return new apvk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvk.class);
            default:
                return null;
        }
    }
}
