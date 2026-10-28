package defpackage;

import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gny implements gpv {
    public final hpy a;
    public final hur b;
    public final tbt c;
    public final hpk d;
    public ListenableFuture i;
    public gpl j;
    private final hnq k;
    private final avmb l;
    private final avmm m = new avmm();
    public avmn e = null;
    public annv f = null;
    public final Map g = new HashMap();
    public final Map h = new HashMap();

    public gny(hnq hnqVar, hpy hpyVar, hur hurVar, tbt tbtVar, hpk hpkVar, avmb avmbVar) {
        this.k = hnqVar;
        this.a = hpyVar;
        this.b = hurVar;
        this.c = tbtVar;
        this.d = hpkVar;
        this.l = avmbVar;
        hurVar.n = this;
    }

    public static final Set e(annv annvVar) {
        HashSet hashSet = new HashSet();
        if (annvVar != null) {
            hashSet.addAll(annvVar.h());
            hashSet.addAll(annvVar.k());
            hashSet.addAll(annvVar.f());
            hashSet.addAll(annvVar.e());
            hashSet.addAll(annvVar.i());
            hashSet.addAll(annvVar.g());
            hashSet.addAll(annvVar.j());
        }
        return hashSet;
    }

    private final void g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("PPSE") || str.equals("PPSV")) {
                this.h.put(str, obj);
                return;
            }
            Map map = this.g;
            map.put(kro.ay(str), obj);
            map.put(kro.am(str), obj);
            return;
        }
        if (obj instanceof anzi) {
            anzi anziVar = (anzi) obj;
            anst anstVar = anziVar.v;
            if (anstVar == null) {
                anstVar = anst.a;
            }
            if (anstVar.b == 2) {
                anst anstVar2 = anziVar.v;
                if (anstVar2 == null) {
                    anstVar2 = anst.a;
                }
                this.g.put(kro.aH(anstVar2.b == 2 ? (String) anstVar2.c : ""), obj);
                return;
            }
            return;
        }
        if (obj instanceof anzn) {
            anzn anznVar = (anzn) obj;
            anst anstVar3 = anznVar.q;
            if (anstVar3 == null) {
                anstVar3 = anst.a;
            }
            if (anstVar3.b == 2) {
                anst anstVar4 = anznVar.q;
                if (anstVar4 == null) {
                    anstVar4 = anst.a;
                }
                this.g.put(kro.aH(anstVar4.b == 2 ? (String) anstVar4.c : ""), obj);
            }
        }
    }

    public final void a() {
        ListenableFuture listenableFuture = this.i;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.i = null;
        }
    }

    @Override // defpackage.gpv
    public final void b(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.offline_settings_server_menu_item);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.offline_settings_menu_item);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.history_menu_item);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(true);
        } else if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(true);
        }
        if (menuItemFindItem3 != null) {
            menuItemFindItem3.setVisible(true);
        }
    }

    @Override // defpackage.gpv
    public final void c(gpl gplVar) {
        this.j = gplVar;
        gnw gnwVar = new gnw(2);
        hnq hnqVar = this.k;
        avmn avmnVarAf = avlr.M(hnqVar.b.K(gnwVar), hnqVar.d).af(new gks(gplVar, 8));
        avmm avmmVar = this.m;
        avmmVar.c(avmnVarAf);
        avmmVar.c(this.a.e(kro.aq()).B(new gkq(3)).K(new gnw(1)).K(new gnw(0)).r().O(this.l).af(new gks(this, 9)));
    }

    @Override // defpackage.gpv
    public final void d() {
        this.m.b();
        a();
        Object obj = this.e;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.b.m();
    }

    @Override // defpackage.gpv
    public final void f(Object obj) {
        if (obj instanceof anzi) {
            g(hna.k(obj), (anzi) obj);
        } else if (obj instanceof adla) {
            List listB = ((adla) obj).b();
            for (int i = 0; i < listB.size(); i++) {
                Object obj2 = listB.get(i);
                if (obj2 instanceof anzn) {
                    anzn anznVar = (anzn) obj2;
                    g(hna.k(anznVar), anznVar);
                }
            }
        }
    }
}
