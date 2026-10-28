package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arjo extends aihn implements aiis {
    public static final arjo a;
    private int b;
    private arjm c;
    private anjd d;
    private byte e = 2;

    static {
        arjo arjoVar = new arjo();
        a = arjoVar;
        aihn.registerDefaultInstance(arjo.class, arjoVar);
    }

    private arjo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\t\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\tᐉ\b", new Object[]{"b", "c", "d"});
            case 3:
                return new arjo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arjo.class);
            default:
                return null;
        }
    }
}
