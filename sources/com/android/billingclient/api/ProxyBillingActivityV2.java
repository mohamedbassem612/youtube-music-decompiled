package com.android.billingclient.api;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.aad;
import defpackage.czs;
import defpackage.eon;
import defpackage.eov;
import defpackage.qe;
import defpackage.rc;
import defpackage.rs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyBillingActivityV2 extends qe {
    public ResultReceiver a;
    public ResultReceiver b;
    public ResultReceiver c;
    public ResultReceiver d;
    public ResultReceiver e;
    public ResultReceiver f;
    private rc g;
    private rc h;
    private rc i;
    private rc j;
    private rc k;
    private rc l;

    private static final aad a() {
        if (Build.VERSION.SDK_INT >= 36) {
            aad aadVarF = aad.f();
            aadVarF.d(3);
            return aadVarF;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        aad aadVarF2 = aad.f();
        aadVarF2.d(1);
        return aadVarF2;
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = registerForActivityResult(new rs(), new eon(this, 1));
        this.h = registerForActivityResult(new rs(), new eon(this, 0));
        this.i = registerForActivityResult(new rs(), new eon(this, 2));
        this.j = registerForActivityResult(new rs(), new eon(this, 3));
        this.k = registerForActivityResult(new rs(), new eon(this, 4));
        this.l = registerForActivityResult(new rs(), new eon(this, 5));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.b = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.c = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.d = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.e = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.f = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        int i = eov.a;
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.g.b(new czs(pendingIntent).a(), a());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.b = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.h.b(new czs(pendingIntent2).a(), a());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.c = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.i.b(new czs(pendingIntent3).a(), a());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.d = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.j.b(new czs(pendingIntent4).a(), a());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.e = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.k.b(new czs(pendingIntent5).a(), a());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.f = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.l.b(new czs(pendingIntent6).a(), a());
        }
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.c;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.d;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.e;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
