package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akoy extends aihn implements aiis {
    public static final akoy a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akoy akoyVar = new akoy();
        a = akoyVar;
        aihn.registerDefaultInstance(akoy.class, akoyVar);
    }

    private akoy() {
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
                return newMessageInfo(a, "\u0001\u0011\u0001\u0000\u0001\u0014\u0011\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\t<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011м\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000", new Object[]{"c", "b", aljk.class, aqky.class, aqkt.class, aqku.class, aqkv.class, aljn.class, anyk.class, aqkx.class, arnu.class, aljm.class, arnt.class, aowp.class, apgv.class, apha.class, alcz.class, aljl.class, ajdu.class});
            case 3:
                return new akoy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akoy.class);
            default:
                return null;
        }
    }
}
