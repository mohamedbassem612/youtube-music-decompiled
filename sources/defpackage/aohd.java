package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohd extends aihn implements aiis {
    public static final aohd a;
    public static final aihl b;
    public int c;
    public Object e;
    public int f;
    public apji g;
    public aodn h;
    private ajwo i;
    public int d = 0;
    private byte j = 2;

    static {
        aohd aohdVar = new aohd();
        a = aohdVar;
        aihn.registerDefaultInstance(aohd.class, aohdVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aohdVar, aohdVar, null, 73080600, aika.MESSAGE, aohd.class);
    }

    private aohd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0002\u0001;\u0000\u0002᠌\u0001\u0004ᐉ\u0003\u0006ဉ\u0004\u0007;\u0000\bᐉ\u0005", new Object[]{"e", "d", "c", "f", aofw.l, "g", "h", "i"});
            case 3:
                return new aohd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohd.class);
            default:
                return null;
        }
    }
}
