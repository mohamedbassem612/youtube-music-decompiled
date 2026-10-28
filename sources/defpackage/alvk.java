package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvk extends aihn implements aiis {
    public static final alvk a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alvk alvkVar = new alvk();
        a = alvkVar;
        aihn.registerDefaultInstance(alvk.class, alvkVar);
    }

    private alvk() {
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
                return newMessageInfo(a, "\u0001\r\u0001\u0000Ѐ\ue008\uf577\u0007\r\u0000\u0000\fЀм\u0000ܶм\u0000\uf364ᯓм\u0000\uf321Ẑм\u0000\ue80fỌм\u0000\uf767≎м\u0000\ue94e⋬м\u0000\ue22b⤖м\u0000\uf811⮎м\u0000\uf492䤳м\u0000\uf2ec槅<\u0000\ue2df\ua7cbм\u0000\ue008\uf577\u0007м\u0000", new Object[]{"c", "b", aoqt.class, aopt.class, aoqp.class, akdd.class, aoqx.class, aoqy.class, aoqv.class, arqd.class, aosl.class, akrn.class, ajpd.class, aoqo.class, akty.class});
            case 3:
                return new alvk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvk.class);
            default:
                return null;
        }
    }
}
