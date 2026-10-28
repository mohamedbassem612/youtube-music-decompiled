package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aohz extends aihn implements aiis {
    public static final aohz a;
    private int b;
    private aoib c;
    private byte d = 2;

    static {
        aohz aohzVar = new aohz();
        a = aohzVar;
        aihn.registerDefaultInstance(aohz.class, aohzVar);
    }

    private aohz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf89b쏐\uf89b쏐\u0001\u0000\u0000\u0001\uf89b쏐ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new aohz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohz.class);
            default:
                return null;
        }
    }
}
