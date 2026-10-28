package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajjf extends aihn implements aiis {
    public static final ajjf a;
    private int c;
    private aisd d;
    private byte e = 2;
    public aiie b = emptyProtobufList();

    static {
        ajjf ajjfVar = new ajjf();
        a = ajjfVar;
        aihn.registerDefaultInstance(ajjf.class, ajjfVar);
    }

    private ajjf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"c", "b", ajwo.class, "d"});
            case 3:
                return new ajjf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajjf.class);
            default:
                return null;
        }
    }
}
