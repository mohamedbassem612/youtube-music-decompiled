package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upz extends aihn implements aiis {
    public static final upz a;
    public int b;
    public int d;
    public ajwo e;
    public anmy f;
    public alay g;
    public apgr h;
    public boolean i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public uqc q;
    private byte r = 2;
    public aiie c = emptyProtobufList();

    static {
        upz upzVar = new upz();
        a = upzVar;
        aihn.registerDefaultInstance(upz.class, upzVar);
    }

    private upz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u0018\u000f\u0000\u0001\u0004\u0001\u001b\u0002\u0004\u0003ᐉ\u0000\u0004ဇ\u0006\u0005ခ\u0007\u0006ဇ\b\u0007ဇ\t\bဇ\n\u000bᐉ\u0001\fဇ\f\rᐉ\u0003\u000fᐉ\u0004\u0011ဌ\r\u0013ဇ\u000e\u0018ဉ\u000f", new Object[]{"b", "c", uqa.class, "d", "e", "i", "j", "k", "l", "m", "f", "n", "g", "h", "o", "p", "q"});
            case 3:
                return new upz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(upz.class);
            default:
                return null;
        }
    }
}
