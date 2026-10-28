package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajaj extends aihn implements aiis {
    public static final ajaj a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private byte f = 2;

    static {
        ajaj ajajVar = new ajaj();
        a = ajajVar;
        aihn.registerDefaultInstance(ajaj.class, ajajVar);
    }

    private ajaj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0003\u0007ᐉ\u0002", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new ajaj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajaj.class);
            default:
                return null;
        }
    }
}
