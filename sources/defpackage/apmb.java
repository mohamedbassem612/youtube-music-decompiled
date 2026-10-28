package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apmb extends aihn implements aiis {
    public static final apmb a;
    public int b;
    public Object d;
    public int e;
    public int i;
    public int j;
    public ajwo k;
    public ajwo l;
    public int c = 0;
    private byte m = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        apmb apmbVar = new apmb();
        a = apmbVar;
        aihn.registerDefaultInstance(apmb.class, apmbVar);
    }

    private apmb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0000\u0002\u0001;\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0004\u0005င\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\b=\u0000\t;\u0000\n᠌\u0000\u000bဈ\u0003", new Object[]{"d", "c", "b", "f", "g", "i", apjs.k, "j", "k", "l", "e", apjs.j, "h"});
            case 3:
                return new apmb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apmb.class);
            default:
                return null;
        }
    }
}
