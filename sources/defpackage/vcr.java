package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcr extends aihn implements aiis {
    public static final vcr a;
    public aiip b = aiip.a;
    private byte c = 2;

    static {
        vcr vcrVar = new vcr();
        a = vcrVar;
        aihn.registerDefaultInstance(vcr.class, vcrVar);
    }

    private vcr() {
    }

    public final aiip a() {
        aiip aiipVar = this.b;
        if (!aiipVar.b) {
            this.b = aiipVar.a();
        }
        return this.b;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new ahud(aika.INT32, (Object) 0, aika.MESSAGE, (Object) vcq.a)});
            case 3:
                return new vcr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(vcr.class);
            default:
                return null;
        }
    }
}
