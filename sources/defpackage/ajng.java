package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajng extends aihn implements aiis {
    public static final ajng a;
    public int b;
    public ajnf c;
    private ajnq d;
    private ajno e;
    private aqnl f;
    private amks g;
    private ajnh h;
    private ajnl i;
    private ajnk j;
    private appc k;
    private aqwb l;
    private appd m;
    private aqyy n;
    private aitt o;
    private byte p = 2;

    static {
        ajng ajngVar = new ajng();
        a = ajngVar;
        aihn.registerDefaultInstance(ajng.class, ajngVar);
    }

    private ajng() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u05fc\uf4d5\ue711\u0007\r\u0000\u0000\r\u05fcᐉ\fऋᐉ\u0007\uea9eᲧᐉ\u0004\ueb11ἑᐉ\u0000\ue5d8☢ᐉ\u0002\ue486䚃ᐉ\n\ue9ad嘫ᐉ\r\ue110ꈕᐉ\u0006\uf2c2꒨ᐉ\b\ue3e9힘ᐉ\t\ue17fﯙ\u0006ᐉ\u0001\uea77\ue4b6\u0007ᐉ\u0003\uf4d5\ue711\u0007ᐉ\u000b", new Object[]{"b", "n", "i", "g", "c", "e", "l", "o", "h", "j", "k", "d", "f", "m"});
            case 3:
                return new ajng();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajng.class);
            default:
                return null;
        }
    }
}
