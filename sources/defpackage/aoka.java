package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoka extends aihn implements aiis {
    public static final aoka a;
    public int b;
    public aokc c;
    private aokb d;
    private aokd e;
    private aokf f;
    private amhr g;
    private byte h = 2;

    static {
        aoka aokaVar = new aoka();
        a = aokaVar;
        aihn.registerDefaultInstance(aoka.class, aokaVar);
    }

    private aoka() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\uf067│\ue290\ue83c\u0007\u0005\u0000\u0000\u0005\uf067│ᐉ\u0001\ue621┌ᐉ\u0000\ueaae┢ᐉ\u0003\ueec5㓷ᐉ\u0002\ue290\ue83c\u0007ᐉ\u0004", new Object[]{"b", "e", "d", "f", "c", "g"});
            case 3:
                return new aoka();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoka.class);
            default:
                return null;
        }
    }
}
