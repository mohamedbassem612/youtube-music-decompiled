package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aksn extends aihi implements aihj {
    public static final aksn a;
    private byte b = 2;

    static {
        aksn aksnVar = new aksn();
        a = aksnVar;
        aihn.registerDefaultInstance(aksn.class, aksnVar);
    }

    private aksn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new aksn();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aksn.class);
            default:
                return null;
        }
    }
}
