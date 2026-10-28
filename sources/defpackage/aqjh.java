package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqjh extends aihn implements aiis {
    public static final aqjh a;
    private int b;
    private airk c;
    private ajta d;
    private apzl e;
    private apzm f;
    private aqqi g;
    private akyi h;
    private aqjd i;
    private angn j;
    private byte k = 2;

    static {
        aqjh aqjhVar = new aqjh();
        a = aqjhVar;
        aihn.registerDefaultInstance(aqjh.class, aqjhVar);
    }

    private aqjh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\ue592᯦﹤냷\b\u0000\u0000\b\ue592᯦ᐉ\u0007\ue9beⓏᐉ\u0000\ue64a⤉ᐉ\u0002履⭎ᐉ\u0001\uf223㙻ᐉ\u0003\ue057䫂ᐉ\u0004\uecd7斿ᐉ\u0005﹤냷ᐉ\u0006", new Object[]{"b", "j", "c", "e", "d", "f", "g", "h", "i"});
            case 3:
                return new aqjh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqjh.class);
            default:
                return null;
        }
    }
}
