package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anfv extends aihn implements aiis {
    public static final anfv a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        anfv anfvVar = new anfv();
        a = anfvVar;
        aihn.registerDefaultInstance(anfv.class, anfvVar);
    }

    private anfv() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000ݿ\ue8a2\ue9a3\u0007\u0013\u0000\u0000\u0012ݿм\u0000逜м\u0000\uef94ᾮм\u0000\uefc3ᾮм\u0000ﶃⓖм\u0000\ueea7ⓗм\u0000\uf42d▚м\u0000\uf492䤳м\u0000\ue8e7䴓м\u0000\ue02d䴚м\u0000\uf389櫀м\u0000﹉淹м\u0000ﺥ瓧м\u0000\uea03磭м\u0000\ue957茥м\u0000\uf7d1ꂤм\u0000\ue381샑<\u0000\ue8a1\ue9a3\u0007м\u0000\ue8a2\ue9a3\u0007м\u0000", new Object[]{"c", "b", aqnw.class, aqhy.class, anfw.class, anga.class, anft.class, anfs.class, angh.class, akrn.class, angg.class, anfp.class, aqxv.class, aqxw.class, angc.class, aqwp.class, anfn.class, anfz.class, anfx.class, amln.class, amlm.class});
            case 3:
                return new anfv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfv.class);
            default:
                return null;
        }
    }
}
