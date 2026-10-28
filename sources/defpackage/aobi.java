package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aobi implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aobi(20);
    static final aiht t = new aobi(19);
    static final aiht s = new aobi(18);
    static final aiht r = new aobi(17);
    static final aiht q = new aobi(16);
    static final aiht p = new aobi(15);
    static final aiht o = new aobi(14);
    static final aiht n = new aobi(13);
    static final aiht m = new aobi(12);
    static final aiht l = new aobi(11);
    static final aiht k = new aobi(10);
    static final aiht j = new aobi(9);
    static final aiht i = new aobi(8);
    static final aiht h = new aobi(7);
    public static final aiht g = new aobi(6);
    static final aiht f = new aobi(5);
    static final aiht e = new aobi(4);
    static final aiht d = new aobi(3);
    static final aiht c = new aobi(2);
    static final aiht b = new aobi(1);
    public static final aiht a = new aobi(0);

    private aobi(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                if (i2 == 0) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_OFFLINE;
                } else if (i2 == 2) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
                } else if (i2 == 3) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_2G;
                } else if (i2 == 4) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_3G;
                } else if (i2 == 5) {
                    r0 = aobj.EFFECTIVE_CONNECTION_TYPE_4G;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 1:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                switch (i2) {
                    case 0:
                        r0 = aoel.DB_EXCEPTION_TYPE_UNKNOWN;
                        break;
                    case 1:
                        r0 = aoel.DB_EXCEPTION_TYPE_NO_EXCEPTION;
                        break;
                    case 2:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_ABORT_EXCEPTION;
                        break;
                    case 3:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_ACCESS_PERM_EXCEPTION;
                        break;
                    case 4:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_BIND_OR_COLUMN_INDEX_OUT_OF_RANGE_EXCEPTION;
                        break;
                    case 5:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_BLOB_TOO_BIG_EXCEPTION;
                        break;
                    case 6:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_CANT_OPEN_DATABASE_EXCEPTION;
                        break;
                    case 7:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_CONSTRAINT_EXCEPTION;
                        break;
                    case 8:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_DATABASE_CORRUPT_EXCEPTION;
                        break;
                    case 9:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_DATABASE_LOCKED_EXCEPTION;
                        break;
                    case 10:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_DATATYPE_MISMATCH_EXCEPTION;
                        break;
                    case 11:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_DISK_IO_EXCEPTION;
                        break;
                    case 12:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_DONE_EXCEPTION;
                        break;
                    case 13:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_FULL_EXCEPTION;
                        break;
                    case 14:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_MISUSE_EXCEPTION;
                        break;
                    case 15:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_OUT_OF_MEMORY_EXCEPTION;
                        break;
                    case 16:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_READ_ONLY_DATABASE_EXCEPTION;
                        break;
                    case 17:
                        r0 = aoel.DB_EXCEPTION_TYPE_SQLITE_TABLE_LOCKED_EXCEPTION;
                        break;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 4:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (aofb.a(i2) == null) {
                    return false;
                }
                break;
            case 6:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (aofy.a(i2) == null) {
                    return false;
                }
                break;
            case 8:
                if (CommonApis.g(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (aotd.a(i2) == null) {
                    return false;
                }
                break;
            case 10:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (aoxz.a(i2) == null) {
                    return false;
                }
                break;
            case 14:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (apbw.a(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (apcc.a(i2) == null) {
                    return false;
                }
                break;
            case 19:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            default:
                if (atqp.I(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
