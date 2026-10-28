package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anrd extends aihn implements aiis {
    public static final anrd a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private angb f;
    private byte g = 2;

    static {
        anrd anrdVar = new anrd();
        a = anrdVar;
        aihn.registerDefaultInstance(anrd.class, anrdVar);
    }

    private anrd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0004\u0002ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new anrd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anrd.class);
            default:
                return null;
        }
    }
}
