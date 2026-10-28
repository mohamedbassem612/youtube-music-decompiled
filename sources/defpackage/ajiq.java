package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajiq extends aihn implements aiis {
    public static final ajiq a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ajiq ajiqVar = new ajiq();
        a = ajiqVar;
        aihn.registerDefaultInstance(ajiq.class, ajiqVar);
    }

    private ajiq() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0000\uf143ᠤ\ue659븒\b\u0000\u0000\b\uf143ᠤм\u0000啕\u1cc9м\u0000\uf0d1⢇м\u0000ﵫ⫪м\u0000\ue0aeヾм\u0000\ufe1f㔺м\u0000\uf687㙱м\u0000\ue659븒м\u0000", new Object[]{"c", "b", akci.class, alfz.class, ajip.class, aonr.class, amxz.class, ajio.class, ajiu.class, ajit.class});
            case 3:
                return new ajiq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajiq.class);
            default:
                return null;
        }
    }
}
