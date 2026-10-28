package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajyv extends aihn implements aiis {
    public static final ajyv a;
    private int b;
    private ajyu c;
    private byte d = 2;

    static {
        ajyv ajyvVar = new ajyv();
        a = ajyvVar;
        aihn.registerDefaultInstance(ajyv.class, ajyvVar);
    }

    private ajyv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue706⧁\ue706⧁\u0001\u0000\u0000\u0001\ue706⧁ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajyv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyv.class);
            default:
                return null;
        }
    }
}
