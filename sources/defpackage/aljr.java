package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aljr extends aihn implements aiis {
    public static final aljr a;
    private int b;
    private ajwo c;
    private amke d;
    private byte e = 2;

    static {
        aljr aljrVar = new aljr();
        a = aljrVar;
        aihn.registerDefaultInstance(aljr.class, aljrVar);
    }

    private aljr() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0007\n\u0002\u0000\u0000\u0002\u0007ᐉ\u0006\nᐉ\t", new Object[]{"b", "c", "d"});
            case 3:
                return new aljr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljr.class);
            default:
                return null;
        }
    }
}
