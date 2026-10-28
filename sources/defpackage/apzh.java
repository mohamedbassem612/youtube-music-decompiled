package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apzh extends aihn implements aiis {
    public static final apzh a;
    public int b;
    public ajwo c;
    public ajwo e;
    public ajwo f;
    public ajue g;
    public arbj h;
    public aiqi i;
    public boolean j;
    public int k;
    private byte l = 2;
    public String d = "";

    static {
        apzh apzhVar = new apzh();
        a = apzhVar;
        aihn.registerDefaultInstance(apzh.class, apzhVar);
    }

    private apzh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u0010\t\u0000\u0000\u0004\u0002ᐉ\u0001\u0006ဈ\u0005\u0007ဉ\b\tᐉ\t\u000bᐉ\u0006\fᐉ\u0007\u000eဉ\n\u000fဇ\r\u0010ဌ\u000e", new Object[]{"b", "c", "d", "g", "h", "e", "f", "i", "j", "k"});
            case 3:
                return new apzh();
            case 4:
                return new aihf((short[][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzh.class);
            default:
                return null;
        }
    }
}
