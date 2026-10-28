package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apor extends aihn implements aiis {
    public static final apor a;
    private int b;
    private ajrw c;
    private apnv d;
    private aqaw e;
    private amll f;
    private ajqz g;
    private apnb h;
    private akrn i;
    private byte j = 2;

    static {
        apor aporVar = new apor();
        a = aporVar;
        aihn.registerDefaultInstance(apor.class, aporVar);
    }

    private apor() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001ﶝ\u171d\uf492䤳\u0007\u0000\u0000\u0007ﶝ\u171dᐉ\u0004\ue7a7ᦌᐉ\u0000龜ℶᐉ\u0001\ue952⒡ᐉ\u0002\ueda0⣽ᐉ\u0003\ue8b0㻿ᐉ\u0005\uf492䤳ᐉ\u0006", new Object[]{"b", "g", "c", "d", "e", "f", "h", "i"});
            case 3:
                return new apor();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apor.class);
            default:
                return null;
        }
    }
}
