package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aplj extends aihn implements aiis {
    public static final aplj a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private byte h = 2;

    static {
        aplj apljVar = new aplj();
        a = apljVar;
        aihn.registerDefaultInstance(aplj.class, apljVar);
    }

    private aplj() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0005\u000b\u0005\u0000\u0000\u0005\u0005ᐉ\u0003\u0006ᐉ\u0004\bᐉ\u0006\tᐉ\u0007\u000bᐉ\u0005", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aplj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aplj.class);
            default:
                return null;
        }
    }
}
