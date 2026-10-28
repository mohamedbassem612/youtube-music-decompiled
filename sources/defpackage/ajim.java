package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajim extends aihn implements aiis {
    public static final ajim a;
    public int b;
    public ajil c;
    private byte d = 2;

    static {
        ajim ajimVar = new ajim();
        a = ajimVar;
        aihn.registerDefaultInstance(ajim.class, ajimVar);
    }

    private ajim() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001嶺⸝嶺⸝\u0001\u0000\u0000\u0001嶺⸝ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajim();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajim.class);
            default:
                return null;
        }
    }
}
