package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apqx extends aihn implements aiis {
    public static final apqx a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        apqx apqxVar = new apqx();
        a = apqxVar;
        aihn.registerDefaultInstance(apqx.class, apqxVar);
    }

    private apqx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf321Ẑ\ue9f2䩆\u0005\u0000\u0000\u0005\uf321Ẑм\u0000ￌ䉥м\u0000\ue39b䐄м\u0000\uee20䐄м\u0000\ue9f2䩆м\u0000", new Object[]{"c", "b", akdd.class, aprt.class, aqvm.class, aqvo.class, albq.class});
            case 3:
                return new apqx();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apqx.class);
            default:
                return null;
        }
    }
}
