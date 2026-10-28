package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajkf extends aihn implements aiis {
    public static final ajkf a;
    public int b;
    public alay c;
    private ajwo d;
    private byte e = 2;

    static {
        ajkf ajkfVar = new ajkf();
        a = ajkfVar;
        aihn.registerDefaultInstance(ajkf.class, ajkfVar);
    }

    private ajkf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new ajkf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkf.class);
            default:
                return null;
        }
    }
}
