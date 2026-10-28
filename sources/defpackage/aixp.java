package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aixp implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new aixp(20);
    static final aiht t = new aixp(19);
    static final aiht s = new aixp(18);
    static final aiht r = new aixp(17);
    static final aiht q = new aixp(16);
    static final aiht p = new aixp(15);
    static final aiht o = new aixp(14);
    static final aiht n = new aixp(13);
    static final aiht m = new aixp(12);
    static final aiht l = new aixp(11);
    static final aiht k = new aixp(10);
    static final aiht j = new aixp(9);
    static final aiht i = new aixp(8);
    static final aiht h = new aixp(7);
    static final aiht g = new aixp(6);
    static final aiht f = new aixp(5);
    static final aiht e = new aixp(4);
    static final aiht d = new aixp(3);
    static final aiht c = new aixp(2);
    static final aiht b = new aixp(1);
    static final aiht a = new aixp(0);

    private aixp(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        aixq aixqVar;
        switch (this.$cid) {
            case 0:
                return a.bh(i2) != 0;
            case 1:
                return aixo.a(i2) != null;
            case 2:
                switch (i2) {
                    case 0:
                        aixqVar = aixq.TRIGGER_CATEGORY_UNSPECIFIED;
                        break;
                    case 1:
                        aixqVar = aixq.TRIGGER_CATEGORY_SLOT_ENTRY;
                        break;
                    case 2:
                        aixqVar = aixq.TRIGGER_CATEGORY_SLOT_FULFILLMENT;
                        break;
                    case 3:
                        aixqVar = aixq.TRIGGER_CATEGORY_SLOT_EXPIRATION;
                        break;
                    case 4:
                        aixqVar = aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL;
                        break;
                    case 5:
                        aixqVar = aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED;
                        break;
                    case 6:
                        aixqVar = aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED;
                        break;
                    case 7:
                        aixqVar = aixq.TRIGGER_CATEGORY_PING_DISPATCH;
                        break;
                    case 8:
                        aixqVar = aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED;
                        break;
                    case 9:
                        aixqVar = aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED;
                        break;
                    default:
                        aixqVar = null;
                        break;
                }
                return aixqVar != null;
            case 3:
                return aixr.a(i2) != null;
            case 4:
                return a.aS(i2) != 0;
            case 5:
                return a.aS(i2) != 0;
            case 6:
                return a.aV(i2) != 0;
            case 7:
                return a.bc(i2) != 0;
            case 8:
                return a.aU(i2) != 0;
            case 9:
                return a.bc(i2) != 0;
            case 10:
                return a.aS(i2) != 0;
            case 11:
                return ajcx.a(i2) != null;
            case 12:
                return aext.p(i2) != 0;
            case 13:
                return a.aU(i2) != 0;
            case 14:
                return a.aV(i2) != 0;
            case 15:
                return aext.s(i2) != 0;
            case 16:
                return ajga.a(i2) != null;
            case 17:
                return ajgf.a(i2) != null;
            case 18:
                return ajgp.a(i2) != null;
            case 19:
                return ajgq.a(i2) != null;
            default:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                    case 11:
                    default:
                        return false;
                }
        }
    }
}
