package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atov extends aihn implements aiis {
    public static final atov a;
    public int b;
    public aoqd c;
    public ajha d;
    public aiip e = aiip.a;
    private byte f = 2;

    static {
        atov atovVar = new atov();
        a = atovVar;
        aihn.registerDefaultInstance(atov.class, atovVar);
    }

    private atov() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", new ahud(aika.STRING, (Object) "", aika.INT32, (Object) 0)});
            case 3:
                return new atov();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atov.class);
            default:
                return null;
        }
    }
}
