package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apff extends aihn implements aiis {
    public static final apff a;
    public apji c;
    private int d;
    private apji e;
    private apji f;
    private apji g;
    private alzx h;
    private ajwo i;
    private apji j;
    private byte k = 2;
    public aiie b = emptyProtobufList();

    static {
        apff apffVar = new apff();
        a = apffVar;
        aihn.registerDefaultInstance(apff.class, apffVar);
    }

    private apff() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0001\b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0001\u0005Л\bᐉ\u0004\tᐉ\u0005\nᐉ\u0006", new Object[]{"d", "c", "f", "g", "e", "b", apji.class, "h", "i", "j"});
            case 3:
                return new apff();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apff.class);
            default:
                return null;
        }
    }
}
