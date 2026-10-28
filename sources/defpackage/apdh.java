package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apdh extends aihn implements aiis {
    public static final apdh a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private apdg f;
    private angb g;
    private byte h = 2;

    static {
        apdh apdhVar = new apdh();
        a = apdhVar;
        aihn.registerDefaultInstance(apdh.class, apdhVar);
    }

    private apdh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\bᐉ\u0006\nᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new apdh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apdh.class);
            default:
                return null;
        }
    }
}
