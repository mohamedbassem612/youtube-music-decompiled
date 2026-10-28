package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axid extends aihn implements aiis {
    public static final axid a;
    public int b;
    public aigu c;
    public aigu d;
    private byte e = 2;

    static {
        axid axidVar = new axid();
        a = axidVar;
        aihn.registerDefaultInstance(axid.class, axidVar);
    }

    private axid() {
        emptyLongList();
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
            case 3:
                return new axid();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(axid.class);
            default:
                return null;
        }
    }
}
