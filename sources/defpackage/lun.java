package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lun extends lxt implements lyq {
    public static final lun DEFAULT_INSTANCE;
    public static final int DELETE_PROPAGATION_TYPE_FIELD_NUMBER = 3;
    private static volatile lyu PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public int deletePropagationType_;
    public int valueType_;

    static {
        lun lunVar = new lun();
        DEFAULT_INSTANCE = lunVar;
        lxt.E(lun.class, lunVar);
    }

    private lun() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003᠌\u0001", new Object[]{"bitField0_", "valueType_", ltw.k, "deletePropagationType_", ltw.j});
        }
        if (i2 == 3) {
            return new lun();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
