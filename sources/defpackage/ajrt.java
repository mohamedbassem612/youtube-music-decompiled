package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajrt extends aihn implements aiis {
    public static final ajrt a;
    private int b;
    private ajsj c;
    private byte d = 2;

    static {
        ajrt ajrtVar = new ajrt();
        a = ajrtVar;
        aihn.registerDefaultInstance(ajrt.class, ajrtVar);
    }

    private ajrt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001揄⏈揄⏈\u0001\u0000\u0000\u0001揄⏈ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajrt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajrt.class);
            default:
                return null;
        }
    }
}
