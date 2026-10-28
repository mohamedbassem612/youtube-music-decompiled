package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class angs extends aihn implements aiis {
    public static final angs a;
    private int b;
    private angr c;
    private byte d = 2;

    static {
        angs angsVar = new angs();
        a = angsVar;
        aihn.registerDefaultInstance(angs.class, angsVar);
    }

    private angs() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uecac㫇\uecac㫇\u0001\u0000\u0000\u0001\uecac㫇ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new angs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angs.class);
            default:
                return null;
        }
    }
}
