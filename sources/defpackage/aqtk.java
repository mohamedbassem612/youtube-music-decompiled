package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqtk extends aihn implements aiis {
    public static final aqtk a;
    public int b;
    public aqtj c;
    private byte d = 2;

    static {
        aqtk aqtkVar = new aqtk();
        a = aqtkVar;
        aihn.registerDefaultInstance(aqtk.class, aqtkVar);
    }

    private aqtk() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf422䞇\uf422䞇\u0001\u0000\u0000\u0001\uf422䞇ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aqtk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqtk.class);
            default:
                return null;
        }
    }
}
