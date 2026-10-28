package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class vvs implements vxc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/action/HideEnclosingCommand");
    private final tbt b;

    public vvs(tbt tbtVar) {
        tbtVar.getClass();
        this.b = tbtVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag");
        if (objS == null) {
            objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        }
        if (objS == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/innertube/action/HideEnclosingCommand", "resolve", 41, "HideEnclosingCommand.java")).w("%s: attempted to route with null tag", getClass().getName());
        } else {
            this.b.c(new vvt(objS));
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
