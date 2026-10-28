package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdd {
    public static final agjt a;
    public static final agjt b;
    public static final agjt c;
    public static final agjt d;
    public static final agjt e;

    static {
        agjr agjrVar = new agjr();
        agjrVar.c(8, aixq.TRIGGER_CATEGORY_SLOT_ENTRY);
        agjrVar.c(7, aixq.TRIGGER_CATEGORY_SLOT_FULFILLMENT);
        agjrVar.c(6, aixq.TRIGGER_CATEGORY_SLOT_EXPIRATION);
        agjrVar.c(1, aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL);
        agjrVar.c(2, aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED);
        agjrVar.c(3, aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED);
        agjrVar.c(4, aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED);
        agjrVar.c(5, aixq.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED);
        agjrVar.c(0, aixq.TRIGGER_CATEGORY_PING_DISPATCH);
        a = agjrVar.b();
        agjr agjrVar2 = new agjr();
        agjrVar2.c(0, aixf.CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED);
        agjrVar2.c(1, aixf.CONTROL_FLOW_MANAGER_LAYER_CORE);
        agjrVar2.c(2, aixf.CONTROL_FLOW_MANAGER_LAYER_ADAPTER);
        agjrVar2.c(3, aixf.CONTROL_FLOW_MANAGER_LAYER_SURFACE);
        agjrVar2.c(4, aixf.CONTROL_FLOW_MANAGER_LAYER_EXTERNAL);
        b = agjrVar2.b();
        agjr agjrVar3 = new agjr();
        agjrVar3.c(0, aixe.ADS_CLIENT_EVENT_TYPE_NORMAL_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(2, aixe.ADS_CLIENT_EVENT_TYPE_SKIP_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(3, aixe.ADS_CLIENT_EVENT_TYPE_MUTE_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(4, aixe.ADS_CLIENT_EVENT_TYPE_ABANDON_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(5, aixe.ADS_CLIENT_EVENT_TYPE_USER_INPUT_SUBMITTED_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(6, aixe.ADS_CLIENT_EVENT_TYPE_USER_CANCELLED_EXIT_LAYOUT_REQUESTED);
        agjrVar3.c(1, aixe.ADS_CLIENT_EVENT_TYPE_ABORTED_EXIT_LAYOUT_REQUESTED);
        c = agjrVar3.b();
        agjr agjrVar4 = new agjr();
        agjrVar4.c(0, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_NORMALLY);
        agjrVar4.c(2, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_SKIP);
        agjrVar4.c(3, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_MUTE);
        agjrVar4.c(4, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABANDON);
        agjrVar4.c(5, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_INPUT_SUBMITTED);
        agjrVar4.c(6, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_CANCELLED);
        agjrVar4.c(1, aixe.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABORTED);
        d = agjrVar4.b();
        agjr agjrVar5 = new agjr();
        agjrVar5.c(1, "TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL");
        agjrVar5.c(2, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED");
        agjrVar5.c(3, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED");
        agjrVar5.c(4, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED");
        agjrVar5.c(5, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED");
        agjrVar5.c(6, "TRIGGER_CATEGORY_SLOT_EXPIRATION");
        agjrVar5.c(7, "TRIGGER_CATEGORY_SLOT_FULFILLMENT");
        agjrVar5.c(8, "TRIGGER_CATEGORY_SLOT_ENTRY");
        agjrVar5.c(0, "TRIGGER_CATEGORY_PING_DISPATCH");
        agjrVar5.b();
        agjr agjrVar6 = new agjr();
        agjrVar6.c("AD_CPN", aixi.AD_CLIENT_PLAYBACK_NONCE_KEY);
        agjrVar6.c("AD_MT", aixi.AD_CURRENT_TIME_MS);
        agjrVar6.c("BLOCKING_ERROR", aixi.BLOCKING_ERROR);
        agjrVar6.c("CPN", aixi.CLIENT_PLAYBACK_NONCE_KEY);
        agjrVar6.c("ERROR_MSG", aixi.ERROR_MESSAGE);
        agjrVar6.c("GOOGLE_VIEWABILITY", aixi.GOOGLE_VIEWABILITY);
        agjrVar6.c("INTERNAL_ID", aixi.INTERNAL_ID);
        agjrVar6.c("I_X", aixi.AD_INTERACTION_X);
        agjrVar6.c("I_Y", aixi.AD_INTERACTION_Y);
        agjrVar6.c("MIDROLL_POS", aixi.MIDROLL_POS_SEC);
        agjrVar6.c("MOAT_VIEWABILITY", aixi.THIRD_PARTY_VIEWABILITY);
        agjrVar6.c("MT", aixi.CONTENT_CURRENT_TIME_MS);
        agjrVar6.c("P_H", aixi.PLAYER_HEIGHT);
        agjrVar6.c("P_W", aixi.PLAYER_WIDTH);
        agjrVar6.c("RWT", aixi.REQUEST_WALL_TIME_MS);
        agjrVar6.c("VIEWABILITY", aixi.ACTIVE_VIEW);
        agjrVar6.c("VIS", aixi.PLAYER_VISIBILITY);
        agjrVar6.c("VSS_AD_CPN", aixi.VSS_AD_CLIENT_PLAYBACK_NONCE_KEY);
        agjrVar6.c("YT_ERROR_CODE", aixi.YT_ERROR_CODE);
        e = agjrVar6.b();
    }
}
