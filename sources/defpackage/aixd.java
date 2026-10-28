package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aixd implements aiht {
    static final aiht a = new aixd();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        aixe aixeVar;
        switch (i) {
            case 0:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_UNSPECIFIED;
                break;
            case 1:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ADPLACEMENTRENDERER_RECEIVED;
                break;
            case 2:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ADPLACEMENT_SCHEDULED;
                break;
            case 3:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ENTER_LAYOUT_REQUESTED;
                break;
            case 4:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_ENTERED;
                break;
            case 5:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SKIP_LAYOUT_REQUESTED;
                break;
            case 6:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_SKIPPED;
                break;
            case 7:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_ABANDONED;
                break;
            case 8:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_NORMALLY;
                break;
            case 9:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SCHEDULE_SLOT_REQUESTED;
                break;
            case 10:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_SCHEDULED;
                break;
            case 11:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_FULFILL_SLOT_REQUESTED;
                break;
            case 12:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_NON_EMPTY;
                break;
            case 13:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLED_EMPTY;
                break;
            case 14:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SCHEDULE_LAYOUT_REQUESTED;
                break;
            case 15:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_SCHEDULED;
                break;
            case 16:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED;
                break;
            case 17:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED;
                break;
            case 18:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ENTER_SLOT_REQUESTED;
                break;
            case 19:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_ENTERED;
                break;
            case 20:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_EXIT_SLOT_REQUESTED;
                break;
            case 21:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_EXITED;
                break;
            case 22:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_SLOT_REQUESTED;
                break;
            case 23:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_UNSCHEDULED;
                break;
            case 24:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_TRIGGER_ACTIVATED;
                break;
            case 25:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_EXIT_LAYOUT_REQUESTED;
                break;
            case 26:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_CANCEL_SLOT_FULFILLMENT_REQUESTED;
                break;
            case 27:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_FULFILLMENT_CANCELLED;
                break;
            case 28:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_NON_TERMINAL_ABANDON;
                break;
            case 29:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_NORMAL_EXIT_LAYOUT_REQUESTED;
                break;
            case 30:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SKIP_EXIT_LAYOUT_REQUESTED;
                break;
            case 31:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_MUTE_EXIT_LAYOUT_REQUESTED;
                break;
            case 32:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ABANDON_EXIT_LAYOUT_REQUESTED;
                break;
            case 33:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_SKIP;
                break;
            case 34:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_MUTE;
                break;
            case 35:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABANDON;
                break;
            case 36:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_USER_INPUT_SUBMITTED_EXIT_LAYOUT_REQUESTED;
                break;
            case 37:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_INPUT_SUBMITTED;
                break;
            case 38:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_SEND_REQUESTED;
                break;
            case 39:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_SENT;
                break;
            case 40:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_USER_CANCELLED_EXIT_LAYOUT_REQUESTED;
                break;
            case 41:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_CANCELLED;
                break;
            case 42:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED;
                break;
            case 43:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_RECEIVED;
                break;
            case 44:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ABORTED_EXIT_LAYOUT_REQUESTED;
                break;
            case 45:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABORTED;
                break;
            case 46:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_UNSCHEDULED;
                break;
            case 47:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_UNSCHEDULE_LAYOUT_REQUESTED;
                break;
            case 48:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_ERROR;
                break;
            case 49:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_PING_DISPATCHED;
                break;
            case 50:
                aixeVar = aixe.ADS_CLIENT_EVENT_TYPE_RENDERING_EVENT;
                break;
            default:
                aixeVar = null;
                break;
        }
        return aixeVar != null;
    }
}
