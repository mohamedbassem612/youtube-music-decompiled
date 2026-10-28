package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajhi extends aihn implements aiis {
    public static final ajhi a;
    public int b;
    public boolean c;
    public ajhh d;
    public int e;
    public apji f;
    public ajwo g;
    private byte h = 2;

    static {
        ajhi ajhiVar = new ajhi();
        a = ajhiVar;
        aihn.registerDefaultInstance(ajhi.class, ajhiVar);
    }

    private ajhi() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0003\u0001ဇ\u0000\u0002ᐉ\u0001\u0005᠌\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", akux.j, "f", "g"});
            case 3:
                return new ajhi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajhi.class);
            default:
                return null;
        }
    }
}
