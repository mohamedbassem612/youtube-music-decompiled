package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrd extends aihn implements aiis {
    public static final alrd a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alrd alrdVar = new alrd();
        a = alrdVar;
        aihn.registerDefaultInstance(alrd.class, alrdVar);
    }

    private alrd() {
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
                return newMessageInfo(a, "\u0004\u0007\u0001\u0000\uf264ᙛ\ue84d㫇\u0007\u0000\u0000\u0007\uf264ᙛм\u0000金ᚆм\u0000\uf8c1ᛍм\u0000\uf67aᤚм\u0000\uffc9ᦿм\u0000\ue0a5㠴м\u0000\ue84d㫇м\u0000", new Object[]{"c", "b", algc.class, alge.class, alga.class, algd.class, algb.class, aonm.class, anit.class});
            case 3:
                return new alrd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrd.class);
            default:
                return null;
        }
    }
}
