package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anss extends aihn implements aiis {
    public static final anss a;
    public int b;
    public alay c;
    public int d;
    public boolean h;
    public ajwo i;
    public anld j;
    public ansq k;
    private byte l = 2;
    public aiie e = emptyProtobufList();
    public aigj f = aigj.d;
    public aiie g = emptyProtobufList();

    static {
        anss anssVar = new anss();
        a = anssVar;
        aihn.registerDefaultInstance(anss.class, anssVar);
    }

    private anss() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001ﴥ㘥\t\u0000\u0002\u0004\u0001ᐉ\u0000\u0002ည\u0002\u0004Л\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\b᠌\u0001\tဉ\u0007ﴥ㘥Л", new Object[]{"b", "c", "f", "g", ajwo.class, "h", "i", "j", "d", anms.q, "k", "e", ansr.class});
            case 3:
                return new anss();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anss.class);
            default:
                return null;
        }
    }
}
