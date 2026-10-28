package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoad extends aihn implements aiis {
    public static final aoad a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajwo f;
    private angb g;
    private byte h = 2;

    static {
        aoad aoadVar = new aoad();
        a = aoadVar;
        aihn.registerDefaultInstance(aoad.class, aoadVar);
    }

    private aoad() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\tᐉ\u0003", new Object[]{"b", "c", "d", "f", "g", "e"});
            case 3:
                return new aoad();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoad.class);
            default:
                return null;
        }
    }
}
