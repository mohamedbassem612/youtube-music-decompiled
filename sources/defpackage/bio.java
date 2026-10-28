package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum bio {
    DOUBLE(0, 1, bjb.DOUBLE),
    FLOAT(1, 1, bjb.FLOAT),
    INT64(2, 1, bjb.LONG),
    UINT64(3, 1, bjb.LONG),
    INT32(4, 1, bjb.INT),
    FIXED64(5, 1, bjb.LONG),
    FIXED32(6, 1, bjb.INT),
    BOOL(7, 1, bjb.BOOLEAN),
    STRING(8, 1, bjb.STRING),
    MESSAGE(9, 1, bjb.MESSAGE),
    BYTES(10, 1, bjb.BYTE_STRING),
    UINT32(11, 1, bjb.INT),
    ENUM(12, 1, bjb.ENUM),
    SFIXED32(13, 1, bjb.INT),
    SFIXED64(14, 1, bjb.LONG),
    SINT32(15, 1, bjb.INT),
    SINT64(16, 1, bjb.LONG),
    GROUP(17, 1, bjb.MESSAGE),
    DOUBLE_LIST(18, 2, bjb.DOUBLE),
    FLOAT_LIST(19, 2, bjb.FLOAT),
    INT64_LIST(20, 2, bjb.LONG),
    UINT64_LIST(21, 2, bjb.LONG),
    INT32_LIST(22, 2, bjb.INT),
    FIXED64_LIST(23, 2, bjb.LONG),
    FIXED32_LIST(24, 2, bjb.INT),
    BOOL_LIST(25, 2, bjb.BOOLEAN),
    STRING_LIST(26, 2, bjb.STRING),
    MESSAGE_LIST(27, 2, bjb.MESSAGE),
    BYTES_LIST(28, 2, bjb.BYTE_STRING),
    UINT32_LIST(29, 2, bjb.INT),
    ENUM_LIST(30, 2, bjb.ENUM),
    SFIXED32_LIST(31, 2, bjb.INT),
    SFIXED64_LIST(32, 2, bjb.LONG),
    SINT32_LIST(33, 2, bjb.INT),
    SINT64_LIST(34, 2, bjb.LONG),
    DOUBLE_LIST_PACKED(35, 3, bjb.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, bjb.FLOAT),
    INT64_LIST_PACKED(37, 3, bjb.LONG),
    UINT64_LIST_PACKED(38, 3, bjb.LONG),
    INT32_LIST_PACKED(39, 3, bjb.INT),
    FIXED64_LIST_PACKED(40, 3, bjb.LONG),
    FIXED32_LIST_PACKED(41, 3, bjb.INT),
    BOOL_LIST_PACKED(42, 3, bjb.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, bjb.INT),
    ENUM_LIST_PACKED(44, 3, bjb.ENUM),
    SFIXED32_LIST_PACKED(45, 3, bjb.INT),
    SFIXED64_LIST_PACKED(46, 3, bjb.LONG),
    SINT32_LIST_PACKED(47, 3, bjb.INT),
    SINT64_LIST_PACKED(48, 3, bjb.LONG),
    GROUP_LIST(49, 2, bjb.MESSAGE),
    MAP(50, 4, bjb.VOID);

    private static final bio[] aa;
    public final int Z;

    static {
        bio[] bioVarArrValues = values();
        aa = new bio[bioVarArrValues.length];
        for (bio bioVar : bioVarArrValues) {
            aa[bioVar.Z] = bioVar;
        }
    }

    bio(int i, int i2, bjb bjbVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = bjbVar.k;
        }
        if (i2 == 1) {
            bjb bjbVar2 = bjb.VOID;
            bjbVar.ordinal();
        }
    }
}
