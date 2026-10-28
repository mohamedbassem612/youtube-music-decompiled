package defpackage;

import android.app.Dialog;
import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mqd {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public mqd(Context context) {
        this.b = context;
        this.a = "image_manager_disk_cache";
    }

    public final void a() {
        ((kob) ((koa) this.b).a).c();
        Dialog dialog = (Dialog) this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public final void b() {
        dge dgeVar = (dge) this.b;
        dgeVar.s.remove(this.a);
        dgeVar.o.notifyDataSetChanged();
    }

    public mqd(dge dgeVar, dii diiVar) {
        this.b = dgeVar;
        this.a = diiVar;
    }

    public mqd(Object obj, Object obj2) {
        this.a = obj2;
        this.b = obj;
    }

    public /* synthetic */ mqd(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ mqd(Map map, String str) {
        this.a = map;
        this.b = str;
    }
}
