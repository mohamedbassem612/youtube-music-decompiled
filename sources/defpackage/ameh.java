package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ameh extends aihn implements aiis {
    public static final ameh a;
    public static final aihl b;
    public int c;
    public int d;
    public apji e;
    public alay f;
    public int g;
    public boolean h;
    public aqcy i;
    private alay j;
    private ameg k;
    private apji l;
    private byte m = 2;

    static {
        ameh amehVar = new ameh();
        a = amehVar;
        aihn.registerDefaultInstance(ameh.class, amehVar);
        b = aihn.newSingularGeneratedExtension(apji.a, amehVar, amehVar, null, 1343, aika.MESSAGE, ameh.class);
    }

    private ameh() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u000b\t\u0000\u0000\u0005\u0002င\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006᠌\u0006\u0007ဇ\u0007\tᐉ\u0004\nဉ\t\u000bᐉ\n", new Object[]{"c", "d", "e", "f", "k", "g", aqcj.g, "h", "j", "i", "l"});
            case 3:
                return new ameh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ameh.class);
            default:
                return null;
        }
    }
}
