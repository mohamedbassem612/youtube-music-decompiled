package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amow extends aihn implements aiis {
    public static final amow a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        amow amowVar = new amow();
        a = amowVar;
        aihn.registerDefaultInstance(amow.class, amowVar);
    }

    private amow() {
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
                return newMessageInfo(a, "\u0001\u0012\u0001\u0000أ\uf266멯\u0012\u0000\u0000\u0011أм\u0000ڝм\u0000ﴸ㟮м\u0000\ue67e㶿м\u0000ﲊ㹍м\u0000ﮓ㼭м\u0000\uee50㾍м\u0000\ue359䘒<\u0000\ue9ba䘔м\u0000\uf492䤳м\u0000\uee51仌м\u0000\uf616巷м\u0000\uf602滐м\u0000\uf863砀м\u0000簾豣м\u0000\uf2ad鮦м\u0000\ueba6딋м\u0000\uf266멯м\u0000", new Object[]{"c", "b", arng.class, aleh.class, ampd.class, amoz.class, amox.class, ampq.class, ampa.class, ampc.class, amou.class, akrn.class, ampe.class, ampr.class, amoy.class, amov.class, amqg.class, ampn.class, aqbo.class, aqbp.class});
            case 3:
                return new amow();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amow.class);
            default:
                return null;
        }
    }
}
