package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.blocks.Container;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iug implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iug(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v31, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v45, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v52, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 10;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                List list = (List) ahng.v(this.a);
                if (list.isEmpty()) {
                    return null;
                }
                return (anyx) list.get(0);
            case 1:
                return ((iuo) this.a).e.query(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, ish.j, null, null, null);
            case 2:
                return ((iuo) this.a).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ish.f, "is_music=1 AND title IS NOT NULL", null, String.format("LOWER(%s)", "title"));
            case 3:
                return (anjx) ((List) ahng.v(this.a)).get(0);
            case 4:
                return ((iuo) this.a).e.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, "is_music=1 AND title IS NOT NULL", null, String.format("LOWER(%s)", "title"));
            case 5:
                return ((iuo) this.a).e.query(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, null, null, null, "date_modified DESC");
            case 6:
                return (List) Collection.EL.stream((List) ahng.v(this.a)).filter(new iui(3)).collect(aghu.a);
            case 7:
                return hmy.S(this.a);
            case 8:
                return Boolean.valueOf(((Integer) ahng.v(this.a)).intValue() > 0);
            case 9:
                return (List) Collection.EL.stream((List) ahng.v(this.a)).filter(new iui(i2)).collect(Collectors.toList());
            case 10:
                return (agag) ((Container) this.a.io()).a(new afyq(10));
            case 11:
                Object obj = this.a;
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) obj;
                return ((avlh) ((kwq) watchWhileLayout.n.io()).c).p().L(watchWhileLayout.m).al(new jgq(obj, i), new jeh(i));
            case 12:
                Context context = ((kwi) this.a).a;
                return ksy.as(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case 13:
                return new fye(((ldo) this.a).k);
            case 14:
                ((acyw) ((mgp) this.a).a.io()).d(false);
                return avlb.e();
            case 15:
                aerj aerjVar = (aerj) this.a;
                return ((ocd) aerjVar.c).f(16384, (String) aerjVar.d);
            case 16:
                return (gcw) this.a.io();
            case 17:
                obp obpVarK = ((ahgb) ((xsc) this.a).b).K(1);
                return obpVarK == null ? obp.a : obpVarK;
            case 18:
                ahgb ahgbVar = (ahgb) ((xsc) this.a).b;
                obp obpVarK2 = ahgbVar.K(1);
                if (obpVarK2 == null) {
                    ((omj) ahgbVar.b).j(15315);
                    return null;
                }
                String str = (obpVarK2.c == 1 ? (gcz) obpVarK2.d : gcz.a).c;
                File fileV = ixt.V(str, "pcam.jar", ahgbVar.I());
                fileV.getClass();
                if (!fileV.exists()) {
                    fileV = ixt.V(str, "pcam", ahgbVar.I());
                    fileV.getClass();
                }
                File fileV2 = ixt.V(str, "pcopt", ahgbVar.I());
                fileV2.getClass();
                File fileV3 = ixt.V(str, "pcbc", ahgbVar.I());
                fileV3.getClass();
                return new aepb(obpVarK2.c == 1 ? (gcz) obpVarK2.d : gcz.a, fileV, fileV3, fileV2);
            case 19:
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    oiv oivVar = (oiv) ahng.v((ListenableFuture) it.next());
                    if (oivVar != oiv.NONE && oivVar != oiv.SUBSCRIBED) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            default:
                ((qch) this.a).g();
                return null;
        }
    }
}
