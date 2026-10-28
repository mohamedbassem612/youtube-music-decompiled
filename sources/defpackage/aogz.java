package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aogz extends aihn implements aiis {
    public static final aogz a;
    private int b;
    private aoia c;
    private byte d = 2;

    static {
        aogz aogzVar = new aogz();
        a = aogzVar;
        aihn.registerDefaultInstance(aogz.class, aogzVar);
    }

    private aogz() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\ue528᳢\ue528᳢\u0001\u0000\u0000\u0001\ue528᳢ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aogz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aogz.class);
            default:
                return null;
        }
    }
}
