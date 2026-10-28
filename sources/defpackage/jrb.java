package defpackage;

import com.google.android.apps.youtube.proto.ClientAbrStateOuterClass$ClientAbrState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class jrb extends aihn implements aiis {
    public static final jrb a;
    public int b;
    public ClientAbrStateOuterClass$ClientAbrState c;
    public long e;
    public jrt f;
    private byte g = 2;
    public aigj d = aigj.d;

    static {
        jrb jrbVar = new jrb();
        a = jrbVar;
        aihn.registerDefaultInstance(jrb.class, jrbVar);
    }

    private jrb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0003ည\u0001\u0004ဂ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new jrb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(jrb.class);
            default:
                return null;
        }
    }
}
