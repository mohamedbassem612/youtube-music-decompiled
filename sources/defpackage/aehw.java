package defpackage;

import android.util.Base64;
import android.webkit.PermissionRequest;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aehw implements aehi {
    private final cf a;
    private final vxe b;
    private final arkm c;
    private final afcy d;

    public aehw(cf cfVar, vxe vxeVar, arkm arkmVar) {
        this.a = cfVar;
        this.b = vxeVar;
        this.c = arkmVar;
        this.d = new afcy(cfVar);
    }

    @Override // defpackage.aehi
    public final /* synthetic */ agkz b() {
        return agpr.a;
    }

    @Override // defpackage.aehi
    public final void e() {
        afcy afcyVar = this.d;
        Object obj = afcyVar.d;
        if (obj != null) {
            ((rc) obj).a();
        }
        afcyVar.d = null;
        Object obj2 = afcyVar.c;
        if (obj2 != null) {
            ((PermissionRequest) obj2).deny();
        }
        afcyVar.c = null;
    }

    @Override // defpackage.aehi
    public final void g(String str) {
        ajwo ajwoVar;
        try {
            arjt arjtVar = (arjt) aihn.parseFrom(arjt.a, Base64.decode(str, 2), ExtensionRegistryLite.getGeneratedRegistry());
            arjtVar.getClass();
            if ((arjtVar.b & 2) == 0 || (ajwoVar = (ajwo) DesugarCollections.unmodifiableMap(this.c.J).get(arjtVar.d)) == null) {
                return;
            }
            this.b.a(ajwoVar);
        } catch (aiik | IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.aehi
    public final void i(PermissionRequest permissionRequest, final agke agkeVar, final agke agkeVar2) {
        agkeVar.getClass();
        agkeVar2.getClass();
        if (agkeVar.isEmpty()) {
            permissionRequest.deny();
            return;
        }
        if (agkeVar2.isEmpty()) {
            permissionRequest.grant((String[]) agkeVar.toArray(new String[0]));
            return;
        }
        final afcy afcyVar = this.d;
        Object obj = afcyVar.b;
        cf cfVar = (cf) obj;
        if (cfVar.isFinishing() || cfVar.isDestroyed() || afcyVar.c != null) {
            permissionRequest.deny();
            return;
        }
        afcyVar.c = permissionRequest;
        rc rcVarA = ((qe) obj).getActivityResultRegistry().a((String) afcyVar.a, new rq(), new rb() { // from class: aehy
            @Override // defpackage.rb
            public final void a(Object obj2) {
                Map map = (Map) obj2;
                map.getClass();
                afcy afcyVar2 = afcyVar;
                Object obj3 = afcyVar2.d;
                if (obj3 != null) {
                    ((rc) obj3).a();
                }
                afcyVar2.d = null;
                Object obj4 = afcyVar2.c;
                afcyVar2.c = null;
                if (obj4 != null) {
                    List list = agkeVar2;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!awrc.c(map.get((String) it.next()), Boolean.TRUE)) {
                                ((PermissionRequest) obj4).deny();
                                return;
                            }
                        }
                    }
                    ((PermissionRequest) obj4).grant((String[]) agkeVar.toArray(new String[0]));
                }
            }
        });
        afcyVar.d = rcVarA;
        rcVarA.b(agkeVar2.toArray(new String[0]), null);
    }

    @Override // defpackage.aehi
    public final /* synthetic */ boolean n(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // defpackage.aehi
    public final boolean o() {
        return false;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ long a(long j) {
        return j;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ ajwo c(ajwo ajwoVar) {
        return ajwoVar;
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void h(String str) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void t(aihf aihfVar) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void k(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // defpackage.aehi
    public final /* synthetic */ void u(ahub ahubVar, WebSettings webSettings) {
    }
}
