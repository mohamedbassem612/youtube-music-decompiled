package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwf extends lxt implements lyq {
    public static final int CODE_FIELD_NUMBER = 1;
    public static final lwf DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile lyu PARSER;
    public int bitField0_;
    public int code_;
    public String message_ = "";

    static {
        lwf lwfVar = new lwf();
        DEFAULT_INSTANCE = lwfVar;
        lxt.E(lwf.class, lwfVar);
    }

    private lwf() {
    }

    public static lxq c() {
        return DEFAULT_INSTANCE.s();
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "code_", lwe.a, "message_"});
        }
        if (i2 == 3) {
            return new lwf();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        int iB = CommonApis.b(this.code_);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
