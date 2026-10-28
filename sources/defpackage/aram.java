package defpackage;

import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aram implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aram(20);
    static final aiht t = new aram(19);
    static final aiht s = new aram(18);
    static final aiht r = new aram(17);
    public static final aiht q = new aram(16);
    static final aiht p = new aram(15);
    static final aiht o = new aram(14);
    static final aiht n = new aram(13);
    static final aiht m = new aram(12);
    static final aiht l = new aram(11);
    static final aiht k = new aram(10);
    static final aiht j = new aram(9);
    static final aiht i = new aram(8);
    static final aiht h = new aram(7);
    static final aiht g = new aram(6);
    static final aiht f = new aram(5);
    static final aiht e = new aram(4);
    static final aiht d = new aram(3);
    static final aiht c = new aram(2);
    static final aiht b = new aram(1);
    static final aiht a = new aram(0);

    private aram(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r2 = null;
        switch (this.$cid) {
            case 0:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                switch (i2) {
                    case 0:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_UNKNOWN;
                        break;
                    case 1:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN;
                        break;
                    case 2:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLUETOOTH;
                        break;
                    case 3:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_WIRED_HEADSET;
                        break;
                    case 4:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLE;
                        break;
                    case 5:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_A2DP;
                        break;
                    case 6:
                        r2 = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_HFP;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 3:
                if (arbd.a(i2) == null) {
                    return false;
                }
                break;
            case 4:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 6:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (CommonApis.b(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (acfz.ax(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (ardj.a(i2) == null) {
                    return false;
                }
                break;
            case 14:
                if (ardk.a(i2) == null) {
                    return false;
                }
                break;
            case 15:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (CommonApis.d(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (ardr.a(i2) == null) {
                    return false;
                }
                break;
            case 18:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                if (i2 == 0) {
                    r2 = arfo.ALIGN_HORIZONTAL_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = arfo.ALIGN_HORIZONTAL_ALIGN_LEFT;
                } else if (i2 == 2) {
                    r2 = arfo.ALIGN_HORIZONTAL_ALIGN_CENTER;
                } else if (i2 == 3) {
                    r2 = arfo.ALIGN_HORIZONTAL_ALIGN_RIGHT;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            default:
                if (i2 == 0) {
                    r2 = arfp.COMMENT_SOURCE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = arfp.COMMENT_SOURCE_VOD_COMMENTS;
                } else if (i2 == 2) {
                    r2 = arfp.COMMENT_SOURCE_SHORT_COMMENTS;
                } else if (i2 == 3) {
                    r2 = arfp.COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SUGGESTED;
                } else if (i2 == 4) {
                    r2 = arfp.COMMENT_SOURCE_COMMENTS_PICKER_CAMERA_SAVED;
                }
                if (r2 == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
