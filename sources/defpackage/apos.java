package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apos extends aihn implements aiis {
    public static final apos a;
    public int b;
    public aobx c;
    public aoyh d;
    public apho e;
    public amfj f;
    public aqmx g;
    public apoi h;
    public aqpx i;
    public ajla j;
    private byte k = 2;

    static {
        apos aposVar = new apos();
        a = aposVar;
        aihn.registerDefaultInstance(apos.class, aposVar);
    }

    private apos() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\ueee9ᣑ﵇節\u0007\b\u0000\u0000\u0003\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001\uf697᳗ᐉ\u0002\uec98↊ᐉ\u0004\uf488┤ဉ\u0003﵅節\u0007ဉ\u0007﵆節\u0007ဉ\b﵇節\u0007ဉ\t", new Object[]{"b", "c", "d", "e", "g", "f", "h", "i", "j"});
            case 3:
                return new apos();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apos.class);
            default:
                return null;
        }
    }
}
