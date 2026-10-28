package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoke extends aihn implements aiis {
    public static final aoke a;
    public int b;
    public akdd c;
    private byte d = 2;

    static {
        aoke aokeVar = new aoke();
        a = aokeVar;
        aihn.registerDefaultInstance(aoke.class, aokeVar);
    }

    private aoke() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf321Ẑ\uf321Ẑ\u0001\u0000\u0000\u0001\uf321Ẑᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoke();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoke.class);
            default:
                return null;
        }
    }
}
