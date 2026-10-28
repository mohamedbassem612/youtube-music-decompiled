package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class almg extends aihn implements aiis {
    public static final almg a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        almg almgVar = new almg();
        a = almgVar;
        aihn.registerDefaultInstance(almg.class, almgVar);
    }

    private almg() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uea3aᮽ\uf091ẙ\u0003\u0000\u0000\u0003\uea3aᮽм\u0000ﻠᶘм\u0000\uf091ẙм\u0000", new Object[]{"c", "b", aqjj.class, aqje.class, aqjf.class});
            case 3:
                return new almg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almg.class);
            default:
                return null;
        }
    }
}
