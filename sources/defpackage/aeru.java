package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import j$.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aeru implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ aeru(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [awmd, java.lang.Object] */
    @Override // defpackage.agfr
    public final Object io() {
        int i = this.$cid;
        if (i == 0) {
            qtf qtfVarF = ((aerv) this.a).a.f("/client_streamz/youtube/identity/age_verification", new qte("auth_type", String.class));
            qtfVarF.c();
            return qtfVarF;
        }
        if (i == 1) {
            qtf qtfVarF2 = ((aerv) this.a).a.f("/client_streamz/youtube/identity/access_token_refresh_success", new qte("is_early_delegation", Boolean.class), new qte("source", String.class));
            qtfVarF2.c();
            return qtfVarF2;
        }
        if (i == 2) {
            return (agkz) Collection.EL.stream(((vxz) this.a.io()).f(0, 45631215L, new byte[0]).b).map(new aegf(5)).collect(aghu.b);
        }
        if (i == 3) {
            afjn afjnVar = (afjn) this.a;
            Map map = afjnVar.c;
            String strA = afjnVar.a();
            ahno.R(map.containsKey(strA), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", strA);
            return new Intent(afjnVar.b, (Class<?>) ((awmd) map.get(strA)).io());
        }
        Object obj = this.a;
        if (i != 4) {
            return ((LayoutInflater) ((afpe) obj).getBaseContext().getSystemService("layout_inflater")).cloneInContext((Context) obj);
        }
        afjn afjnVar2 = (afjn) obj;
        awmd awmdVar = (awmd) afjnVar2.d.get(afjnVar2.a());
        if (awmdVar != null) {
            return (Class) awmdVar.io();
        }
        ((agrc) ((agrc) afjn.a.c()).k("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 345, "AndroidFutures.java")).t("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
        return InternalForegroundService.class;
    }
}
