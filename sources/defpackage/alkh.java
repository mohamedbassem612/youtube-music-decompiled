package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkh extends aihn implements aiis {
    public static final alkh a;
    private int b;
    private alay c;
    private angb d;
    private apji e;
    private ajwo f;
    private byte g = 2;

    static {
        alkh alkhVar = new alkh();
        a = alkhVar;
        aihn.registerDefaultInstance(alkh.class, alkhVar);
    }

    private alkh() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\n\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\nᐉ\u000b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alkh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkh.class);
            default:
                return null;
        }
    }
}
