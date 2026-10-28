package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class allz extends aihn implements aiis {
    public static final allz a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        allz allzVar = new allz();
        a = allzVar;
        aihn.registerDefaultInstance(allz.class, allzVar);
    }

    private allz() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\ue635ᬷ\uf284냴\u0007\u0000\u0000\u0003\ue635ᬷм\u0000\uf206ḟ<\u0000\uee35⢝м\u0000\uec64⿻м\u0000\ue2c4抢<\u0000\uf7c9棡<\u0000\uf284냴<\u0000", new Object[]{"c", "b", ajra.class, aouc.class, alhv.class, anki.class, apjx.class, amlw.class, aozg.class});
            case 3:
                return new allz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allz.class);
            default:
                return null;
        }
    }
}
