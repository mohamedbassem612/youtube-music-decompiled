package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajab extends aihn implements aiis {
    public static final ajab a;
    public boolean b;
    private int c;
    private ajwo d;
    private ajwo e;
    private byte f = 2;

    static {
        ajab ajabVar = new ajab();
        a = ajabVar;
        aihn.registerDefaultInstance(ajab.class, ajabVar);
    }

    private ajab() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0000\u0002\u0006ᐉ\u0006\u0007ဇ\u0003\bᐉ\u0007", new Object[]{"c", "d", "b", "e"});
            case 3:
                return new ajab();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajab.class);
            default:
                return null;
        }
    }
}
