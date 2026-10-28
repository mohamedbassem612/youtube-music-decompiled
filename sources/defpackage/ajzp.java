package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajzp implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new ajzp(20);
    static final aiht t = new ajzp(19);
    static final aiht s = new ajzp(18);
    static final aiht r = new ajzp(17);
    static final aiht q = new ajzp(16);
    static final aiht p = new ajzp(15);
    static final aiht o = new ajzp(14);
    static final aiht n = new ajzp(13);
    static final aiht m = new ajzp(12);
    static final aiht l = new ajzp(11);
    static final aiht k = new ajzp(10);
    static final aiht j = new ajzp(9);
    static final aiht i = new ajzp(8);
    static final aiht h = new ajzp(7);
    public static final aiht g = new ajzp(6);
    static final aiht f = new ajzp(5);
    static final aiht e = new ajzp(4);
    static final aiht d = new ajzp(3);
    static final aiht c = new ajzp(2);
    static final aiht b = new ajzp(1);
    static final aiht a = new ajzp(0);

    private ajzp(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        akgp akgpVar;
        switch (this.$cid) {
            case 0:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 4:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 6:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 11:
                if (aext.p(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (i2 == 0) {
                    akgpVar = akgp.ACTIVE_CREATION_PAGE_UNKNOWN;
                } else if (i2 == 1) {
                    akgpVar = akgp.ACTIVE_CREATION_PAGE_AUDIO_PICKER_BROWSE;
                } else if (i2 == 2) {
                    akgpVar = akgp.ACTIVE_CREATION_PAGE_AUDIO_PICKER_SEARCH;
                } else if (i2 != 3) {
                    akgpVar = i2 != 4 ? null : akgp.ACTIVE_CREATION_PAGE_EDITOR;
                } else {
                    akgpVar = akgp.ACTIVE_CREATION_PAGE_CAMERA;
                }
                if (akgpVar == null) {
                    return false;
                }
                break;
            case 14:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (akha.a(i2) == null) {
                    return false;
                }
                break;
            case 16:
                if (akhy.a(i2) == null) {
                    return false;
                }
                break;
            case 17:
                if (a.aX(i2) == 0) {
                    return false;
                }
                break;
            case 18:
                if (a.bh(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                if (a.bg(i2) == 0) {
                    return false;
                }
                break;
            default:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
