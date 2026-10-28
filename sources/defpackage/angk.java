package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class angk extends aihn implements aiis {
    public static final angk a;
    private int b;
    private apji c;
    private ajwo d;
    private apji e;
    private ajwo f;
    private byte g = 2;

    static {
        angk angkVar = new angk();
        a = angkVar;
        aihn.registerDefaultInstance(angk.class, angkVar);
    }

    private angk() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0016\u0004\u0000\u0000\u0004\u0004ᐉ\b\bᐉ\u0005\u0013ᐉ\u0002\u0016ᐉ\u0006", new Object[]{"b", "f", "d", "c", "e"});
            case 3:
                return new angk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angk.class);
            default:
                return null;
        }
    }
}
