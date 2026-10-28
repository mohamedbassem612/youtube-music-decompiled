package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class auez extends aihn implements aiis {
    public static final auez a;
    private int b;
    private ajwo c;
    private ajwo d;
    private byte e = 2;

    static {
        auez auezVar = new auez();
        a = auezVar;
        aihn.registerDefaultInstance(auez.class, auezVar);
    }

    private auez() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0006\t\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\tᐉ\b", new Object[]{"b", "c", "d"});
            case 3:
                return new auez();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auez.class);
            default:
                return null;
        }
    }
}
