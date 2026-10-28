package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoab extends aihn implements aiis {
    public static final aoab a;
    private int b;
    private aoia c;
    private byte d = 2;

    static {
        aoab aoabVar = new aoab();
        a = aoabVar;
        aihn.registerDefaultInstance(aoab.class, aoabVar);
    }

    private aoab() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue528᳢\ue528᳢\u0001\u0000\u0000\u0001\ue528᳢ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoab();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoab.class);
            default:
                return null;
        }
    }
}
