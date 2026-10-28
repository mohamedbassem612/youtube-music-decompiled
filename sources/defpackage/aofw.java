package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aofw implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aofw(20);
    static final aiht t = new aofw(19);
    static final aiht s = new aofw(18);
    static final aiht r = new aofw(17);
    static final aiht q = new aofw(16);
    static final aiht p = new aofw(15);
    static final aiht o = new aofw(14);
    static final aiht n = new aofw(13);
    static final aiht m = new aofw(12);
    static final aiht l = new aofw(11);
    static final aiht k = new aofw(10);
    static final aiht j = new aofw(9);
    static final aiht i = new aofw(8);
    static final aiht h = new aofw(7);
    static final aiht g = new aofw(6);
    static final aiht f = new aofw(5);
    static final aiht e = new aofw(4);
    static final aiht d = new aofw(3);
    static final aiht c = new aofw(2);
    static final aiht b = new aofw(1);
    static final aiht a = new aofw(0);

    private aofw(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        aogv aogvVar;
        switch (this.$cid) {
            case 0:
                if (CommonApis.b(i2) != 0) {
                    return true;
                }
                break;
            case 1:
                if (aofs.a(i2) != null) {
                    return true;
                }
                break;
            case 2:
                if (aogc.a(i2) != null) {
                    return true;
                }
                break;
            case 3:
                if (aogf.a(i2) != null) {
                    return true;
                }
                break;
            case 4:
                if (aogp.a(i2) != null) {
                    return true;
                }
                break;
            case 5:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 6:
                if (a.bt(i2) != 0) {
                    return true;
                }
                break;
            case 7:
                if (a.bg(i2) != 0) {
                    return true;
                }
                break;
            case 8:
                switch (i2) {
                    case 0:
                        aogvVar = aogv.UNKNOWN_FAILURE_REASON;
                        break;
                    case 1:
                        aogvVar = aogv.CONNECTION_LOST;
                        break;
                    case 2:
                        aogvVar = aogv.LOW_STORAGE;
                        break;
                    case 3:
                        aogvVar = aogv.NO_FETCHED_DATA;
                        break;
                    case 4:
                        aogvVar = aogv.NO_RESPONSE;
                        break;
                    case 5:
                        aogvVar = aogv.NO_VIDEO_STREAM;
                        break;
                    case 6:
                        aogvVar = aogv.NOT_OFFLINABLE;
                        break;
                    case 7:
                        aogvVar = aogv.TOO_MANY_RETRIES;
                        break;
                    case 8:
                        aogvVar = aogv.OFFLINE_CONTENT_VALIDATION_ERROR;
                        break;
                    case 9:
                        aogvVar = aogv.OFFLINE_CONTENT_EXPIRED;
                        break;
                    case 10:
                        aogvVar = aogv.NOT_PLAYABLE;
                        break;
                    case 11:
                        aogvVar = aogv.NO_OFFLINE_STORAGE;
                        break;
                    case 12:
                        aogvVar = aogv.TRANSFER_PAUSED;
                        break;
                    case 13:
                        aogvVar = aogv.AD_FAILED_TO_GET_FORMAT_STREAM;
                        break;
                    case 14:
                        aogvVar = aogv.AD_NO_FORMAT_STREAMS_AVAILABLE;
                        break;
                    case 15:
                        aogvVar = aogv.AD_FAILED_UNKNOWN_REASON;
                        break;
                    case 16:
                        aogvVar = aogv.PLAYER_REQUEST_FAILURE;
                        break;
                    case 17:
                        aogvVar = aogv.OFFLINE_REQUEST_FAILURE;
                        break;
                    case 18:
                        aogvVar = aogv.OFFLINE_DATABASE_ERROR;
                        break;
                    case 19:
                        aogvVar = aogv.OFFLINE_DOWNLOAD_CONTROLLER_ERROR;
                        break;
                    case 20:
                        aogvVar = aogv.OFFLINE_VIDEO_NOT_FOUND_IN_DATABASE;
                        break;
                    case 21:
                        aogvVar = aogv.OFFLINE_DISK_ERROR;
                        break;
                    case 22:
                        aogvVar = aogv.OFFLINE_TRANSFER_INTERRUPTED;
                        break;
                    case 23:
                        aogvVar = aogv.OFFLINE_WIDEVINE_EXCEPTION;
                        break;
                    case 24:
                        aogvVar = aogv.OFFLINE_NETWORK_ERROR;
                        break;
                    case 25:
                        aogvVar = aogv.OFFLINE_TIME_WINDOW_EXCEEDED;
                        break;
                    case 26:
                        aogvVar = aogv.NO_AUDIO_STREAM;
                        break;
                    case 27:
                        aogvVar = aogv.TOO_MANY_FAILED_STREAM_VERIFICATIONS;
                        break;
                    case 28:
                        aogvVar = aogv.STREAM_VERIFICATION_FAILED;
                        break;
                    case 29:
                        aogvVar = aogv.RETRY_NOT_ALLOWED;
                        break;
                    case 30:
                        aogvVar = aogv.CANNOT_DOWNLOAD_STREAMS_FOR_OFFLINE_REFRESH;
                        break;
                    case 31:
                        aogvVar = aogv.YTB_ERROR;
                        break;
                    case 32:
                        aogvVar = aogv.OFFLINE_STREAM_URL_EXPIRED;
                        break;
                    default:
                        aogvVar = null;
                        break;
                }
                if (aogvVar != null) {
                    return true;
                }
                break;
            case 9:
                if (agvp.E(i2) != 0) {
                    return true;
                }
                break;
            case 10:
                if (CommonApis.h(i2) != 0) {
                    return true;
                }
                break;
            case 11:
                if (a.be(i2) != 0) {
                    return true;
                }
                break;
            case 12:
                if (aohh.a(i2) != null) {
                    return true;
                }
                break;
            case 13:
                if (aohx.a(i2) != null) {
                    return true;
                }
                break;
            case 14:
                if (a.aS(i2) != 0) {
                    return true;
                }
                break;
            case 15:
                if (a.aV(i2) != 0) {
                    return true;
                }
                break;
            case 16:
                if (i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4) {
                    return true;
                }
                break;
            case 17:
                if (a.bc(i2) != 0) {
                    return true;
                }
                break;
            case 18:
                if (a.bh(i2) != 0) {
                    return true;
                }
                break;
            case 19:
                if (aolh.a(i2) != null) {
                    return true;
                }
                break;
            default:
                if (aoly.a(i2) != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
