package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ajzs extends aihn implements aiis {
    public static final ajzs a;
    private int b;
    private ajwo c;
    private ajzu d;
    private byte e = 2;

    static {
        ajzs ajzsVar = new ajzs();
        a = ajzsVar;
        aihn.registerDefaultInstance(ajzs.class, ajzsVar);
    }

    private ajzs() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\n\f\u0002\u0000\u0000\u0002\nᐉ\n\fᐉ\u000b", new Object[]{"b", "c", "d"});
            case 3:
                return new ajzs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajzs.class);
            default:
                return null;
        }
    }
}
