package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alld extends aihn implements aiis {
    public static final alld a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alld alldVar = new alld();
        a = alldVar;
        aihn.registerDefaultInstance(alld.class, alldVar);
    }

    private alld() {
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
                return newMessageInfo(a, "\u0004\t\u0001\u0000\uf61f༩\uec93怉\t\u0000\u0000\u0007\uf61f༩<\u0000\ue18fᝊм\u0000ﵡᵙм\u0000\ue67dḘм\u0000\ue5be⡱м\u0000諾⡱<\u0000\uf09c⢠м\u0000\ueb1d䃦м\u0000\uec93怉м\u0000", new Object[]{"c", "b", arbp.class, argr.class, arcg.class, alvp.class, aisu.class, alam.class, aqfv.class, aiuj.class, aiud.class});
            case 3:
                return new alld();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alld.class);
            default:
                return null;
        }
    }
}
