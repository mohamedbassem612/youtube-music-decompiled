package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class vwu implements vxe {
    public final fx a;
    public final vwx b;
    public final List c = new ArrayList();
    private final Executor e;

    public vwu(Activity activity, vwx vwxVar, Executor executor) {
        this.a = (fx) activity;
        this.b = vwxVar;
        this.e = executor;
    }

    public static vwr f(fx fxVar) {
        vwv vwvVar = (vwv) fxVar.getSupportFragmentManager().g("com.google.android.apps.youtube.app.endpoint.routers.AccountScopeCommandRouterFragment");
        if (vwvVar == null) {
            return null;
        }
        Object obj = vwvVar.peer().a;
        if (obj instanceof vwr) {
            return (vwr) obj;
        }
        String strValueOf = String.valueOf(obj.getClass().toString());
        zvn zvnVar = zvn.b;
        zvm zvmVar = zvm.e;
        String strConcat = "Expected delegate to be AccountScopedCommandRouterImpl, but was ".concat(strValueOf);
        zvp.a(zvnVar, zvmVar, strConcat);
        throw new IllegalStateException(strConcat);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void a(ajwo ajwoVar) {
        yno.eB(this, ajwoVar);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void b(List list) {
        yno.eC(this, list);
    }

    @Override // defpackage.vxe
    public void c(ajwo ajwoVar, Map map) {
        if (ajwoVar != null) {
            vwx vwxVar = this.b;
            if (yno.eG(vwxVar, ajwoVar)) {
                vwxVar.c(ajwoVar, map);
            } else {
                g(ajwoVar, map);
            }
        }
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void d(List list, Map map) {
        yno.eD(this, list, map);
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void e(List list, Object obj) {
        yno.eE(this, list, obj);
    }

    public final void g(ajwo ajwoVar, Map map) {
        if (!a.x()) {
            this.e.execute(afwl.i(new vwh(this, ajwoVar, map, 2, (char[]) null)));
            return;
        }
        vwr vwrVarF = f(this.a);
        if (vwrVarF == null) {
            this.c.add(new vws(ajwoVar, map));
        } else {
            vwrVarF.c(ajwoVar, map);
        }
    }
}
