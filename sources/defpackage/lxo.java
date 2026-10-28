package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum lxo {
    DOUBLE(0, 1, lyi.DOUBLE),
    FLOAT(1, 1, lyi.FLOAT),
    INT64(2, 1, lyi.LONG),
    UINT64(3, 1, lyi.LONG),
    INT32(4, 1, lyi.INT),
    FIXED64(5, 1, lyi.LONG),
    FIXED32(6, 1, lyi.INT),
    BOOL(7, 1, lyi.BOOLEAN),
    STRING(8, 1, lyi.STRING),
    MESSAGE(9, 1, lyi.MESSAGE),
    BYTES(10, 1, lyi.BYTE_STRING),
    UINT32(11, 1, lyi.INT),
    ENUM(12, 1, lyi.ENUM),
    SFIXED32(13, 1, lyi.INT),
    SFIXED64(14, 1, lyi.LONG),
    SINT32(15, 1, lyi.INT),
    SINT64(16, 1, lyi.LONG),
    GROUP(17, 1, lyi.MESSAGE),
    DOUBLE_LIST(18, 2, lyi.DOUBLE),
    FLOAT_LIST(19, 2, lyi.FLOAT),
    INT64_LIST(20, 2, lyi.LONG),
    UINT64_LIST(21, 2, lyi.LONG),
    INT32_LIST(22, 2, lyi.INT),
    FIXED64_LIST(23, 2, lyi.LONG),
    FIXED32_LIST(24, 2, lyi.INT),
    BOOL_LIST(25, 2, lyi.BOOLEAN),
    STRING_LIST(26, 2, lyi.STRING),
    MESSAGE_LIST(27, 2, lyi.MESSAGE),
    BYTES_LIST(28, 2, lyi.BYTE_STRING),
    UINT32_LIST(29, 2, lyi.INT),
    ENUM_LIST(30, 2, lyi.ENUM),
    SFIXED32_LIST(31, 2, lyi.INT),
    SFIXED64_LIST(32, 2, lyi.LONG),
    SINT32_LIST(33, 2, lyi.INT),
    SINT64_LIST(34, 2, lyi.LONG),
    DOUBLE_LIST_PACKED(35, 3, lyi.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, lyi.FLOAT),
    INT64_LIST_PACKED(37, 3, lyi.LONG),
    UINT64_LIST_PACKED(38, 3, lyi.LONG),
    INT32_LIST_PACKED(39, 3, lyi.INT),
    FIXED64_LIST_PACKED(40, 3, lyi.LONG),
    FIXED32_LIST_PACKED(41, 3, lyi.INT),
    BOOL_LIST_PACKED(42, 3, lyi.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, lyi.INT),
    ENUM_LIST_PACKED(44, 3, lyi.ENUM),
    SFIXED32_LIST_PACKED(45, 3, lyi.INT),
    SFIXED64_LIST_PACKED(46, 3, lyi.LONG),
    SINT32_LIST_PACKED(47, 3, lyi.INT),
    SINT64_LIST_PACKED(48, 3, lyi.LONG),
    GROUP_LIST(49, 2, lyi.MESSAGE),
    MAP(50, 4, lyi.VOID);

    private static final lxo[] aa;
    public final int Z;

    static {
        lxo[] lxoVarArrValues = values();
        aa = new lxo[lxoVarArrValues.length];
        for (lxo lxoVar : lxoVarArrValues) {
            aa[lxoVar.Z] = lxoVar;
        }
    }

    lxo(int i, int i2, lyi lyiVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = lyiVar.k;
        }
        if (i2 == 1) {
            lyi lyiVar2 = lyi.VOID;
            lyiVar.ordinal();
        }
    }
}
