package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqk extends bra {
    final /* synthetic */ bqp a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ bre d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqk(bre breVar, Object obj, bqp bqpVar, String str, Bundle bundle) {
        super(obj);
        this.d = breVar;
        this.a = bqpVar;
        this.b = str;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.bra
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ?? F;
        bqp bqpVar = this.a;
        zf zfVar = bqpVar.h;
        if (this.d.c.get(zfVar.l()) == bqpVar) {
            if ((this.h & 1) != 0) {
                F = obj;
                F = bre.f(obj, this.c);
            }
            try {
                F = obj;
                String str = this.b;
                Bundle bundle = this.c;
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str);
                bundle2.putBundle("data_options", bundle);
                bundle2.putBundle("data_notify_children_changed_options", null);
                if (F != 0) {
                    bundle2.putParcelableArrayList("data_media_item_list", F instanceof ArrayList ? (ArrayList) F : new ArrayList<>((Collection) F));
                }
                zfVar.m(3, bundle2);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.b + " package=" + this.a.a);
            }
        }
    }
}
