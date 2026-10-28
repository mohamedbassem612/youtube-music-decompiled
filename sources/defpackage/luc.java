package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class luc extends lxt implements lyq {
    public static final luc DEFAULT_INSTANCE;
    public static final int IDS_FIELD_NUMBER = 3;
    public static final int NAMESPACE_REQUESTED_FIELD_NUMBER = 2;
    public static final int NUM_TOTAL_DOCUMENT_BYTES_TO_RETURN_FIELD_NUMBER = 4;
    private static volatile lyu PARSER = null;
    public static final int TYPE_PROPERTY_MASKS_FIELD_NUMBER = 1;
    public int bitField0_;
    private lye ids_;
    public String namespaceRequested_ = "";
    private int numTotalDocumentBytesToReturn_;
    public lye typePropertyMasks_;

    static {
        luc lucVar = new luc();
        DEFAULT_INSTANCE = lucVar;
        lxt.E(luc.class, lucVar);
    }

    private luc() {
        lyx lyxVar = lyx.a;
        this.ids_ = lyxVar;
        this.typePropertyMasks_ = lyxVar;
        this.numTotalDocumentBytesToReturn_ = Alert.DURATION_SHOW_INDEFINITELY;
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
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဈ\u0000\u0003\u001a\u0004င\u0001", new Object[]{"bitField0_", "typePropertyMasks_", lwk.class, "namespaceRequested_", "ids_", "numTotalDocumentBytesToReturn_"});
        }
        if (i2 == 3) {
            return new luc();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final void b() {
        lye lyeVar = this.typePropertyMasks_;
        if (lyeVar.c()) {
            return;
        }
        this.typePropertyMasks_ = lxt.A(lyeVar);
    }
}
