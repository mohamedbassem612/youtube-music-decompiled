package defpackage;

import android.content.Context;
import j$.util.Comparator$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pwe implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ pwe(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v94, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v97, types: [aunn, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        int i = 4;
        switch (this.$cid) {
            case 0:
                qtf qtfVarF = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/auth/token_retrieval_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("path", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                qtfVarF.c();
                return qtfVarF;
            case 1:
                qtf qtfVarF2 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("requested_tray_limit", Integer.class), new qte("above_tray_limit_count", Integer.class), new qte("requested_slot_limit", Integer.class), new qte("above_slot_limit_count", Integer.class));
                qtfVarF2.c();
                return qtfVarF2;
            case 2:
                qtc qtcVarC = ((qti) ((pwf) this.a).a).c("/client_streamz/gnp_android/auth/token_retrieval_latency", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("path", String.class), new qte("result", String.class), new qte("failure_type", String.class));
                qtcVarC.c();
                return qtcVarC;
            case 3:
                qtf qtfVarF3 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("experiment_source", String.class), new qte("status", String.class), new qte("exception_class_name", String.class));
                qtfVarF3.c();
                return qtfVarF3;
            case 4:
                qtf qtfVarF4 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/gnp_job_start_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("job_key", String.class), new qte("has_internet_connection", String.class), new qte("network_requirement", String.class));
                qtfVarF4.c();
                return qtfVarF4;
            case 5:
                qtf qtfVarF5 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("path", String.class), new qte("status_code", Integer.class));
                qtfVarF5.c();
                return qtfVarF5;
            case 6:
                qtf qtfVarF6 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/http/gnp_http_client/request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("client_impl", String.class), new qte("path", String.class), new qte("status_code", Integer.class), new qte("purpose", String.class));
                qtfVarF6.c();
                return qtfVarF6;
            case 7:
                qtf qtfVarF7 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/push/event_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("event_type", String.class));
                qtfVarF7.c();
                return qtfVarF7;
            case 8:
                qtf qtfVarF8 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/push/decryption/request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("failure", Boolean.class), new qte("has_placeholder", Boolean.class), new qte("fetched_threads", Boolean.class));
                qtfVarF8.c();
                return qtfVarF8;
            case 9:
                qtf qtfVarF9 = ((qti) ((pwf) this.a).a).f("/client_streamz/chime_android/sdk/registration/request_builder_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("encryption_requested", Boolean.class), new qte("key_generation_result", Boolean.class));
                qtfVarF9.c();
                return qtfVarF9;
            case 10:
                qtf qtfVarF10 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("status", String.class));
                qtfVarF10.c();
                return qtfVarF10;
            case 11:
                qtf qtfVarF11 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/media/icon_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("num_of_icons", Integer.class), new qte("shape", String.class));
                qtfVarF11.c();
                return qtfVarF11;
            case 12:
                qtf qtfVarF12 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/registration/registration_request_builder_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("encryption_requested", Boolean.class), new qte("key_generation_result", Boolean.class), new qte("target_type", String.class));
                qtfVarF12.c();
                return qtfVarF12;
            case 13:
                qtf qtfVarF13 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/job/chime_job_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("is_gnp_job", Boolean.class), new qte("job_key", String.class), new qte("executed_in_place", Boolean.class), new qte("result", String.class), new qte("failure_type", String.class), new qte("is_automotive", Boolean.class));
                qtfVarF13.c();
                return qtfVarF13;
            case 14:
                qtf qtfVarF14 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/job/chime_job_start_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("android_sdk_version", Integer.class), new qte("is_gnp_job", Boolean.class), new qte("job_key", String.class), new qte("has_internet_connection", String.class));
                qtfVarF14.c();
                return qtfVarF14;
            case 15:
                qtf qtfVarF15 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/registration/registration_request_count", new qte("app_package_name", String.class), new qte("client_id", String.class), new qte("registration_reason", String.class), new qte("status", String.class), new qte("target_type", String.class));
                qtfVarF15.c();
                return qtfVarF15;
            case 16:
                qtf qtfVarF16 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/growthkit_started_count", new qte("package_name", String.class), new qte("status", String.class));
                qtfVarF16.c();
                return qtfVarF16;
            case 17:
                qtf qtfVarF17 = ((qti) ((pwf) this.a).a).f("/client_streamz/gnp_android/promotion_event", new qte("package_name", String.class), new qte("event_type", String.class));
                qtfVarF17.c();
                return qtfVarF17;
            case 18:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 19:
                return (Boolean) this.a.io();
            default:
                return agke.B(Comparator$CC.comparing(new qdi(i), Comparator$CC.reverseOrder()), (Iterable) this.a.io());
        }
    }
}
