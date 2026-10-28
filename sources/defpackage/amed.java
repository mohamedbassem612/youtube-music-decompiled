package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class amed implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new amed(20);
    static final aiht t = new amed(19);
    static final aiht s = new amed(18);
    static final aiht r = new amed(17);
    static final aiht q = new amed(16);
    static final aiht p = new amed(15);
    static final aiht o = new amed(14);
    static final aiht n = new amed(13);
    static final aiht m = new amed(12);
    static final aiht l = new amed(11);
    static final aiht k = new amed(10);
    static final aiht j = new amed(9);
    static final aiht i = new amed(8);
    static final aiht h = new amed(7);
    static final aiht g = new amed(6);
    static final aiht f = new amed(5);
    static final aiht e = new amed(4);
    static final aiht d = new amed(3);
    static final aiht c = new amed(2);
    static final aiht b = new amed(1);
    static final aiht a = new amed(0);

    private amed(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r0 = null;
        switch (this.$cid) {
            case 0:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 4:
                if (a.bt(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                switch (i2) {
                    case 0:
                        r0 = amee.QUEUE_ACTION_TYPE_UNSPECIFIED;
                        break;
                    case 1:
                        r0 = amee.QUEUE_ACTION_TYPE_REMOVE;
                        break;
                    case 2:
                        r0 = amee.QUEUE_ACTION_TYPE_MOVE;
                        break;
                    case 3:
                        r0 = amee.QUEUE_ACTION_TYPE_ADD;
                        break;
                    case 4:
                        r0 = amee.QUEUE_ACTION_TYPE_SHUFFLE;
                        break;
                    case 5:
                        r0 = amee.QUEUE_ACTION_TYPE_LOOP_ALL;
                        break;
                    case 6:
                        r0 = amee.QUEUE_ACTION_TYPE_LOOP_SINGLE;
                        break;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 6:
                if (i2 == 0) {
                    r0 = amef.REEL_PERSISTENT_EDU_STATE_UNKNOWN;
                } else if (i2 == 1) {
                    r0 = amef.REEL_PERSISTENT_EDU_STATE_ENABLED;
                } else if (i2 == 2) {
                    r0 = amef.REEL_PERSISTENT_EDU_STATE_TEMPORARILY_DISABLED;
                } else if (i2 == 3) {
                    r0 = amef.REEL_PERSISTENT_EDU_STATE_PERMANENTLY_DISABLED;
                }
                if (r0 == null) {
                    return false;
                }
                break;
            case 7:
                if (a.bc(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (amen.a(i2) == null) {
                    return false;
                }
                break;
            case 11:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 12:
                if (a.bh(i2) == 0) {
                    return false;
                }
                break;
            case 13:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 14:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 15:
                if (a.aT(i2) == 0) {
                    return false;
                }
                break;
            case 16:
                if (a.be(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (a.bf(i2) == 0) {
                    return false;
                }
                break;
            case 18:
                if (a.aU(i2) == 0) {
                    return false;
                }
                break;
            case 19:
                if (a.bf(i2) == 0) {
                    return false;
                }
                break;
            default:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
