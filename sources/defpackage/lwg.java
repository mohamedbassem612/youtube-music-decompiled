package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lwg extends lxt implements lyq {
    public static final lwg DEFAULT_INSTANCE;
    public static final int DOCUMENT_STORAGE_INFO_FIELD_NUMBER = 2;
    public static final int INDEX_STORAGE_INFO_FIELD_NUMBER = 4;
    public static final int NAMESPACE_BLOB_STORAGE_INFO_FIELD_NUMBER = 5;
    private static volatile lyu PARSER = null;
    public static final int SCHEMA_STORE_STORAGE_INFO_FIELD_NUMBER = 3;
    public static final int TOTAL_STORAGE_SIZE_FIELD_NUMBER = 1;
    public int bitField0_;
    private ltv documentStorageInfo_;
    private lug indexStorageInfo_;
    public lye namespaceBlobStorageInfo_ = lyx.a;
    private lvn schemaStoreStorageInfo_;
    public long totalStorageSize_;

    static {
        lwg lwgVar = new lwg();
        DEFAULT_INSTANCE = lwgVar;
        lxt.E(lwg.class, lwgVar);
    }

    private lwg() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"bitField0_", "totalStorageSize_", "documentStorageInfo_", "schemaStoreStorageInfo_", "indexStorageInfo_", "namespaceBlobStorageInfo_", luo.class});
        }
        if (i2 == 3) {
            return new lwg();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final ltv b() {
        ltv ltvVar = this.documentStorageInfo_;
        return ltvVar == null ? ltv.DEFAULT_INSTANCE : ltvVar;
    }
}
