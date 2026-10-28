package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajyl extends aihn implements aiis {
    public static final ajyl a;
    private int b;
    private ajyk c;
    private byte d = 2;

    static {
        ajyl ajylVar = new ajyl();
        a = ajylVar;
        aihn.registerDefaultInstance(ajyl.class, ajylVar);
    }

    private ajyl() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue5a5㍎\ue5a5㍎\u0001\u0000\u0000\u0001\ue5a5㍎ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new ajyl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajyl.class);
            default:
                return null;
        }
    }
}
