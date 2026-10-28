package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajac extends aihn implements aiis {
    public static final ajac a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public ajwo f;
    private byte g = 2;

    static {
        ajac ajacVar = new ajac();
        a = ajacVar;
        aihn.registerDefaultInstance(ajac.class, ajacVar);
    }

    private ajac() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0001\u0002᠌\u0001\u0003ဇ\u0002\u0005ဇ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", aqkp.f, "d", "e", "f"});
            case 3:
                return new ajac();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajac.class);
            default:
                return null;
        }
    }
}
