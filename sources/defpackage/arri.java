package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class arri extends aihn implements aiis {
    public static final arri a;
    public int b;
    public arrh c;
    private byte d = 2;

    static {
        arri arriVar = new arri();
        a = arriVar;
        aihn.registerDefaultInstance(arri.class, arriVar);
    }

    private arri() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uefd9㴵\uefd9㴵\u0001\u0000\u0000\u0001\uefd9㴵ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new arri();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arri.class);
            default:
                return null;
        }
    }
}
