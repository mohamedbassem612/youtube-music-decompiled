package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aihb {
    DOUBLE(0, 1, aiim.DOUBLE),
    FLOAT(1, 1, aiim.FLOAT),
    INT64(2, 1, aiim.LONG),
    UINT64(3, 1, aiim.LONG),
    INT32(4, 1, aiim.INT),
    FIXED64(5, 1, aiim.LONG),
    FIXED32(6, 1, aiim.INT),
    BOOL(7, 1, aiim.BOOLEAN),
    STRING(8, 1, aiim.STRING),
    MESSAGE(9, 1, aiim.MESSAGE),
    BYTES(10, 1, aiim.BYTE_STRING),
    UINT32(11, 1, aiim.INT),
    ENUM(12, 1, aiim.ENUM),
    SFIXED32(13, 1, aiim.INT),
    SFIXED64(14, 1, aiim.LONG),
    SINT32(15, 1, aiim.INT),
    SINT64(16, 1, aiim.LONG),
    GROUP(17, 1, aiim.MESSAGE),
    DOUBLE_LIST(18, 2, aiim.DOUBLE),
    FLOAT_LIST(19, 2, aiim.FLOAT),
    INT64_LIST(20, 2, aiim.LONG),
    UINT64_LIST(21, 2, aiim.LONG),
    INT32_LIST(22, 2, aiim.INT),
    FIXED64_LIST(23, 2, aiim.LONG),
    FIXED32_LIST(24, 2, aiim.INT),
    BOOL_LIST(25, 2, aiim.BOOLEAN),
    STRING_LIST(26, 2, aiim.STRING),
    MESSAGE_LIST(27, 2, aiim.MESSAGE),
    BYTES_LIST(28, 2, aiim.BYTE_STRING),
    UINT32_LIST(29, 2, aiim.INT),
    ENUM_LIST(30, 2, aiim.ENUM),
    SFIXED32_LIST(31, 2, aiim.INT),
    SFIXED64_LIST(32, 2, aiim.LONG),
    SINT32_LIST(33, 2, aiim.INT),
    SINT64_LIST(34, 2, aiim.LONG),
    DOUBLE_LIST_PACKED(35, 3, aiim.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, aiim.FLOAT),
    INT64_LIST_PACKED(37, 3, aiim.LONG),
    UINT64_LIST_PACKED(38, 3, aiim.LONG),
    INT32_LIST_PACKED(39, 3, aiim.INT),
    FIXED64_LIST_PACKED(40, 3, aiim.LONG),
    FIXED32_LIST_PACKED(41, 3, aiim.INT),
    BOOL_LIST_PACKED(42, 3, aiim.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, aiim.INT),
    ENUM_LIST_PACKED(44, 3, aiim.ENUM),
    SFIXED32_LIST_PACKED(45, 3, aiim.INT),
    SFIXED64_LIST_PACKED(46, 3, aiim.LONG),
    SINT32_LIST_PACKED(47, 3, aiim.INT),
    SINT64_LIST_PACKED(48, 3, aiim.LONG),
    GROUP_LIST(49, 2, aiim.MESSAGE),
    MAP(50, 4, aiim.VOID);

    private static final aihb[] aa;
    public final int Z;

    static {
        aihb[] aihbVarArrValues = values();
        aa = new aihb[aihbVarArrValues.length];
        for (aihb aihbVar : aihbVarArrValues) {
            aa[aihbVar.Z] = aihbVar;
        }
    }

    aihb(int i, int i2, aiim aiimVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = aiimVar.k;
        }
        if (i2 == 1) {
            aiim aiimVar2 = aiim.VOID;
            aiimVar.ordinal();
        }
    }
}
