package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class angj extends aihn implements aiis {
    public static final angj a;
    private int b;
    private ajwo c;
    private byte d = 2;

    static {
        angj angjVar = new angj();
        a = angjVar;
        aihn.registerDefaultInstance(angj.class, angjVar);
    }

    private angj() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\t", new Object[]{"b", "c"});
            case 3:
                return new angj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angj.class);
            default:
                return null;
        }
    }
}
