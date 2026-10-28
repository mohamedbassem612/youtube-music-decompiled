package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apwk extends aihn implements aiis {
    public static final apwk a;
    public int b;
    public ardq c;
    public apji e;
    public apji f;
    public apji g;
    public apji h;
    public ajwo i;
    private ajwo j;
    private apji k;
    private ajwo l;
    private apji m;
    private byte n = 2;
    public aiie d = emptyProtobufList();

    static {
        apwk apwkVar = new apwk();
        a = apwkVar;
        aihn.registerDefaultInstance(apwk.class, apwkVar);
    }

    private apwk() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u000b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\nᐉ\u0007\fᐉ\t\rᐉ\n", new Object[]{"b", "c", "d", apji.class, "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new apwk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apwk.class);
            default:
                return null;
        }
    }
}
