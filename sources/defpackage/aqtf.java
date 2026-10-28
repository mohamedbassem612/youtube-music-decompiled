package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqtf extends aihn implements aiis {
    public static final aqtf a;
    public int b;
    public alay c;
    public ajng e;
    public apji g;
    public aqte i;
    public ajwo j;
    private ajng k;
    private apji l;
    private byte m = 2;
    public aiie d = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aigj h = aigj.d;

    static {
        aqtf aqtfVar = new aqtf();
        a = aqtfVar;
        aihn.registerDefaultInstance(aqtf.class, aqtfVar);
    }

    private aqtf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\t\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004Л\u0006ည\u0004\u0007ᐉ\u0005\bᐉ\u0007\tᐉ\u0002\nᐉ\b\u000bᐉ\u0006", new Object[]{"b", "c", "d", aqth.class, "e", "f", alay.class, "h", "i", "k", "g", "l", "j"});
            case 3:
                return new aqtf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtf.class);
            default:
                return null;
        }
    }
}
