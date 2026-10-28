package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum axqb {
    DOUBLE(0, 1, axqn.DOUBLE),
    FLOAT(1, 1, axqn.FLOAT),
    INT64(2, 1, axqn.LONG),
    UINT64(3, 1, axqn.LONG),
    INT32(4, 1, axqn.INT),
    FIXED64(5, 1, axqn.LONG),
    FIXED32(6, 1, axqn.INT),
    BOOL(7, 1, axqn.BOOLEAN),
    STRING(8, 1, axqn.STRING),
    MESSAGE(9, 1, axqn.MESSAGE),
    BYTES(10, 1, axqn.BYTE_STRING),
    UINT32(11, 1, axqn.INT),
    ENUM(12, 1, axqn.ENUM),
    SFIXED32(13, 1, axqn.INT),
    SFIXED64(14, 1, axqn.LONG),
    SINT32(15, 1, axqn.INT),
    SINT64(16, 1, axqn.LONG),
    GROUP(17, 1, axqn.MESSAGE),
    DOUBLE_LIST(18, 2, axqn.DOUBLE),
    FLOAT_LIST(19, 2, axqn.FLOAT),
    INT64_LIST(20, 2, axqn.LONG),
    UINT64_LIST(21, 2, axqn.LONG),
    INT32_LIST(22, 2, axqn.INT),
    FIXED64_LIST(23, 2, axqn.LONG),
    FIXED32_LIST(24, 2, axqn.INT),
    BOOL_LIST(25, 2, axqn.BOOLEAN),
    STRING_LIST(26, 2, axqn.STRING),
    MESSAGE_LIST(27, 2, axqn.MESSAGE),
    BYTES_LIST(28, 2, axqn.BYTE_STRING),
    UINT32_LIST(29, 2, axqn.INT),
    ENUM_LIST(30, 2, axqn.ENUM),
    SFIXED32_LIST(31, 2, axqn.INT),
    SFIXED64_LIST(32, 2, axqn.LONG),
    SINT32_LIST(33, 2, axqn.INT),
    SINT64_LIST(34, 2, axqn.LONG),
    DOUBLE_LIST_PACKED(35, 3, axqn.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, axqn.FLOAT),
    INT64_LIST_PACKED(37, 3, axqn.LONG),
    UINT64_LIST_PACKED(38, 3, axqn.LONG),
    INT32_LIST_PACKED(39, 3, axqn.INT),
    FIXED64_LIST_PACKED(40, 3, axqn.LONG),
    FIXED32_LIST_PACKED(41, 3, axqn.INT),
    BOOL_LIST_PACKED(42, 3, axqn.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, axqn.INT),
    ENUM_LIST_PACKED(44, 3, axqn.ENUM),
    SFIXED32_LIST_PACKED(45, 3, axqn.INT),
    SFIXED64_LIST_PACKED(46, 3, axqn.LONG),
    SINT32_LIST_PACKED(47, 3, axqn.INT),
    SINT64_LIST_PACKED(48, 3, axqn.LONG),
    GROUP_LIST(49, 2, axqn.MESSAGE),
    MAP(50, 4, axqn.VOID);

    private static final axqb[] aa;
    public final int Z;

    static {
        axqb[] axqbVarArrValues = values();
        aa = new axqb[axqbVarArrValues.length];
        for (axqb axqbVar : axqbVarArrValues) {
            aa[axqbVar.Z] = axqbVar;
        }
    }

    axqb(int i, int i2, axqn axqnVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = axqnVar.k;
        }
        if (i2 == 1) {
            axqn axqnVar2 = axqn.VOID;
            axqnVar.ordinal();
        }
    }
}
