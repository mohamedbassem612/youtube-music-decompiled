package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum akxg implements aihr {
    EXTRA_TYPE_UNSPECIFIED(0),
    EXTRA_TYPE_BOOLEAN(1),
    EXTRA_TYPE_STRING(2),
    EXTRA_TYPE_PARCELABLE(3),
    EXTRA_TYPE_SERIALIZABLE(4),
    EXTRA_TYPE_ARRAY_LIST(5),
    EXTRA_TYPE_URI(6),
    EXTRA_TYPE_BYTE_ARRAY(7),
    EXTRA_TYPE_LONG(8),
    EXTRA_TYPE_INTEGER(9),
    EXTRA_TYPE_STRING_ARRAY(10),
    EXTRA_TYPE_BUNDLE(11),
    EXTRA_TYPE_BYTE(12),
    EXTRA_TYPE_CHAR(13),
    EXTRA_TYPE_CHAR_ARRAY(14),
    EXTRA_TYPE_CHAR_SEQUENCE(15),
    EXTRA_TYPE_CHAR_SEQUENCE_ARRAY(16),
    EXTRA_TYPE_FLOAT(17),
    EXTRA_TYPE_FLOAT_ARRAY(18),
    EXTRA_TYPE_PARCELABLE_ARRAY(19),
    EXTRA_TYPE_SHORT(20),
    EXTRA_TYPE_SHORT_ARRAY(21),
    EXTRA_TYPE_SIZE(22),
    EXTRA_TYPE_SIZE_F(23);

    private final int z;

    akxg(int i) {
        this.z = i;
    }

    public static akxg a(int i) {
        switch (i) {
            case 0:
                return EXTRA_TYPE_UNSPECIFIED;
            case 1:
                return EXTRA_TYPE_BOOLEAN;
            case 2:
                return EXTRA_TYPE_STRING;
            case 3:
                return EXTRA_TYPE_PARCELABLE;
            case 4:
                return EXTRA_TYPE_SERIALIZABLE;
            case 5:
                return EXTRA_TYPE_ARRAY_LIST;
            case 6:
                return EXTRA_TYPE_URI;
            case 7:
                return EXTRA_TYPE_BYTE_ARRAY;
            case 8:
                return EXTRA_TYPE_LONG;
            case 9:
                return EXTRA_TYPE_INTEGER;
            case 10:
                return EXTRA_TYPE_STRING_ARRAY;
            case 11:
                return EXTRA_TYPE_BUNDLE;
            case 12:
                return EXTRA_TYPE_BYTE;
            case 13:
                return EXTRA_TYPE_CHAR;
            case 14:
                return EXTRA_TYPE_CHAR_ARRAY;
            case 15:
                return EXTRA_TYPE_CHAR_SEQUENCE;
            case 16:
                return EXTRA_TYPE_CHAR_SEQUENCE_ARRAY;
            case 17:
                return EXTRA_TYPE_FLOAT;
            case 18:
                return EXTRA_TYPE_FLOAT_ARRAY;
            case 19:
                return EXTRA_TYPE_PARCELABLE_ARRAY;
            case 20:
                return EXTRA_TYPE_SHORT;
            case 21:
                return EXTRA_TYPE_SHORT_ARRAY;
            case 22:
                return EXTRA_TYPE_SIZE;
            case 23:
                return EXTRA_TYPE_SIZE_F;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
