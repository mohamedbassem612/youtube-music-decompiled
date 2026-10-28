package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wbs implements avld {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wbs(addo addoVar, Map map, nrv nrvVar, aihh aihhVar, int i) {
        this.$cid = i;
        this.d = addoVar;
        this.c = map;
        this.a = nrvVar;
        this.b = aihhVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.avld
    public final void a(final avpr avprVar) {
        final String str;
        final Bitmap bitmap;
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.d;
            ?? r4 = this.c;
            wbx wbxVar = (wbx) this.a;
            wbxVar.a.transact((TransactionContextOuterClass$TransactionContext) this.b, new wbt(wbxVar, r4, (aijp) obj, avprVar), null, new wbu(avprVar));
            return;
        }
        if (i != 1) {
            addn addnVar = new addn(avprVar);
            HashMap map = new HashMap((Map) this.c);
            map.put("command_status_callback", addnVar);
            map.putAll(((nrv) this.a).e);
            ajwo ajwoVar = (ajwo) ((aihf) this.b).build();
            addo addoVar = (addo) this.d;
            addoVar.a.c(ajwoVar, map);
            vxz vxzVar = addoVar.c;
            if (vxzVar.l(335, 45780147L, false) || vxzVar.l(410, 45834423L, false)) {
                ((mfu) addoVar.b.io()).a(null);
            }
            if (addnVar.a()) {
                return;
            }
            addnVar.b().a();
            return;
        }
        Object obj2 = this.d;
        mgv mgvVar = (mgv) obj2;
        boolean z = mgvVar.c;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.a;
        if (!z) {
            mgvVar.f((View) obj5, ((asrb) obj4).e, (nrv) obj3, avprVar);
            return;
        }
        String str2 = ((asrb) obj4).e;
        View view = (View) obj5;
        Window windowG = mgv.g(view);
        if (windowG == null || !view.isAttachedToWindow() || view.getWidth() <= 0 || view.getHeight() <= 0) {
            str = str2;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i2 = iArr[0];
            Rect rect = new Rect(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
            try {
                str = str2;
                bitmap = bitmapCreateBitmap;
                try {
                    final View view2 = (View) obj5;
                    final nrv nrvVar = (nrv) obj3;
                    final mgv mgvVar2 = (mgv) obj2;
                    PixelCopy.request(windowG, rect, bitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: mgu
                        public final void onPixelCopyFinished(int i3) {
                            Bitmap bitmap2 = bitmap;
                            avpr avprVar2 = avprVar;
                            if (avprVar2.f()) {
                                bitmap2.recycle();
                                return;
                            }
                            nrv nrvVar2 = nrvVar;
                            String str3 = str;
                            mgv mgvVar3 = mgvVar2;
                            if (i3 == 0) {
                                avnr.i(avprVar2, avlb.n(new mgt(mgvVar3, str3, bitmap2, nrvVar2, 2)).v(mgvVar3.b).F(new hoi(avprVar2, 9), new jgq(avprVar2, 14)));
                                return;
                            }
                            View view3 = view2;
                            bitmap2.recycle();
                            mgvVar3.f(view3, str3, nrvVar2, avprVar2);
                        }
                    }, view.getHandler() != null ? view.getHandler() : new Handler(Looper.getMainLooper()));
                    return;
                } catch (IllegalArgumentException e) {
                    e = e;
                    bitmap.recycle();
                    ((agrc) ((agrc) ((agrc) mgv.a.c()).j(e)).k("com/google/android/libraries/elements/contrib/commands/ViewToImageBytesCommandHandler", "saveViewViaPixelCopy", (char) 170, "ViewToImageBytesCommandHandler.java")).t("Hardware PixelCopy failed");
                    mgvVar.f(view, str, (nrv) obj3, avprVar);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                str = str2;
                bitmap = bitmapCreateBitmap;
            }
        }
        mgvVar.f(view, str, (nrv) obj3, avprVar);
    }

    public /* synthetic */ wbs(mgv mgvVar, View view, asrb asrbVar, nrv nrvVar, int i) {
        this.$cid = i;
        this.d = mgvVar;
        this.a = view;
        this.c = asrbVar;
        this.b = nrvVar;
    }

    public /* synthetic */ wbs(wbx wbxVar, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext, List list, aijp aijpVar, int i) {
        this.$cid = i;
        this.a = wbxVar;
        this.b = transactionContextOuterClass$TransactionContext;
        this.c = list;
        this.d = aijpVar;
    }
}
