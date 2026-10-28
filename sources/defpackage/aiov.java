package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class aiov extends aihi implements aihj {
    public static final aiov a;
    private byte b = 2;

    static {
        aiov aiovVar = new aiov();
        a = aiovVar;
        aihn.registerDefaultInstance(aiov.class, aiovVar);
    }

    private aiov() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0003\u0000", null);
            case 3:
                return new aiov();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiov.class);
            default:
                return null;
        }
    }
}
