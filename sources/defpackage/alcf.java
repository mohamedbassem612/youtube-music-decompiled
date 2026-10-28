package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alcf extends aihn implements aiis {
    public static final alcf a;
    private int b;
    private akbd c;
    private akay d;
    private akbg e;
    private akbj f;
    private byte g = 2;

    static {
        alcf alcfVar = new alcf();
        a = alcfVar;
        aihn.registerDefaultInstance(alcf.class, alcfVar);
    }

    private alcf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uef41ᠸ\ue974⢵\u0004\u0000\u0000\u0004\uef41ᠸᐉ\u0001ﾾ‶ᐉ\u0003\ued6a▻ᐉ\u0002\ue974⢵ᐉ\u0000", new Object[]{"b", "d", "f", "e", "c"});
            case 3:
                return new alcf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alcf.class);
            default:
                return null;
        }
    }
}
