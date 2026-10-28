package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajjz extends aihn implements aiis {
    public static final ajjz a;
    private int b;
    private alnw c;
    private aowx d;
    private byte e = 2;

    static {
        ajjz ajjzVar = new ajjz();
        a = ajjzVar;
        aihn.registerDefaultInstance(ajjz.class, ajjzVar);
    }

    private ajjz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ajjz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjz.class);
            default:
                return null;
        }
    }
}
