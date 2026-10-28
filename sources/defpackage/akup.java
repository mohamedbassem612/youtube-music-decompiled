package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class akup extends aihn implements aiis {
    public static final akup a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        akup akupVar = new akup();
        a = akupVar;
        aihn.registerDefaultInstance(akup.class, akupVar);
    }

    private akup() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\ueaaaᾮ\ue952⒡\u0002\u0000\u0000\u0002\ueaaaᾮм\u0000\ue952⒡м\u0000", new Object[]{"c", "b", anfy.class, aqaw.class});
            case 3:
                return new akup();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akup.class);
            default:
                return null;
        }
    }
}
