package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upv extends aihn implements aiis {
    public static final upv a;
    public int b;
    public alay c;
    public int d;
    public alay i;
    public upu j;
    public apgr k;
    private byte l = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        upv upvVar = new upv();
        a = upvVar;
        aihn.registerDefaultInstance(upv.class, upvVar);
    }

    private upv() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0004\u0001ለ\u0002\u0002ለ\u0004\u0003ᐉ\b\u0004ለ\u0005\u0005ለ\u0003\u0006ᐉ\u0007\u0007ᐉ\u0000\bᐉ\u0006\tင\u0001", new Object[]{"b", "e", "g", "k", "h", "f", "j", "c", "i", "d"});
            case 3:
                return new upv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(upv.class);
            default:
                return null;
        }
    }
}
