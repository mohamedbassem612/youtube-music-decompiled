package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kbf implements low {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kbf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [awqg, java.lang.Object] */
    @Override // defpackage.low
    public final void e(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Bundle bundle = (Bundle) obj;
            ((kjc) this.a).x(bundle != null ? Integer.valueOf(bundle.getInt("com.google.android.gms.cast.BUNDLE_KEY_CAST_ENABLED_STATUS", 1)) : 1);
            return;
        }
        if (i == 1) {
            ahub ahubVar = (ahub) obj;
            if (ahubVar != null) {
                Intent intent = new Intent();
                String str = ((ahpv) ahubVar.a).b;
                Uri uri = str != null ? Uri.parse(str) : null;
                if (uri != null) {
                    Object obj2 = this.a;
                    intent.setData(uri);
                    ((hax) obj2).a(uri, intent);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = kbu.f;
            ((BasePendingResult) this.a).l(new Status(0, null, null, null));
            return;
        }
        if (i == 3) {
            yy yyVar = (yy) obj;
            int i3 = kec.a;
            ((kjc) this.a).x(Boolean.valueOf(yyVar != null && yyVar.a()));
        } else {
            if (i != 4) {
                if (i == 5) {
                    ((kgo) this.a).k = ((Bundle) obj).getBoolean("com.google.android.gms.cast.FLAG_ENABLE_CONNECT_WITH_OPTIONS", false);
                    return;
                } else {
                    ConcurrentHashMap concurrentHashMap = maj.a;
                    this.a.invoke(obj);
                    return;
                }
            }
            Status status = (Status) obj;
            Object obj3 = ((kgj) this.a).d.b;
            int i4 = status.f;
            status.c();
            khn.e();
        }
    }
}
