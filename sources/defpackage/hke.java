package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hke {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final Set b;
    public String c;
    public dd d;
    public vxe e;
    public Set f;
    private final jki g;
    private final vxz h;

    public hke(vxz vxzVar, jki jkiVar) {
        this.h = vxzVar;
        this.g = jkiVar;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add("FEmusic_library_landing");
    }

    public final void a(hkt hktVar) {
        this.a.add(hktVar);
    }

    public final void b(String str) {
        this.b.add(str);
    }

    public final void c(String str, ajwo ajwoVar) {
        boolean z = false;
        if (str.equals(this.c) && this.d.b() == 0) {
            z = true;
        }
        cc ccVarG = this.d.g(this.c);
        if (ccVarG instanceof gnf) {
            String strI = ((gnf) ccVarG).hB().i();
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihhVar.e(aoaq.b, (aoar) aihfVarCreateBuilder.build());
            ajwoVar = (ajwo) aihhVar.build();
        }
        this.c = str;
        if (jku.e(this.d)) {
            e(ajwoVar);
            bpp bppVarG = this.d.g(this.c);
            if (!z) {
                if (bppVarG == null) {
                    this.e.c(ajwoVar, str.equals("FEmusic_search") ? agkj.j("hide_search_back_action", Boolean.TRUE) : null);
                }
            } else {
                if (bppVarG instanceof hkx) {
                    ((hkx) bppVarG).Y();
                }
                if (bppVarG instanceof hkw) {
                    ((hkw) bppVarG).C();
                }
            }
        }
    }

    public final boolean d(String str) {
        return this.b.contains(str);
    }

    public final void e(ajwo ajwoVar) {
        View view;
        if (!jku.e(this.d) || this.c == null) {
            return;
        }
        this.d.N(null, 1);
        av avVar = new av(this.d);
        vxz vxzVar = this.h;
        if (vxzVar.l(31, 45757116L, false)) {
            hkm hkmVarAd = kro.ad(ajwoVar, d(this.c));
            avVar.s(hkmVarAd.a, hkmVarAd.b, 0);
        }
        for (String str : this.b) {
            String str2 = this.c;
            if (str2 == null || !str2.equals(str)) {
                cc ccVarG = this.d.g(str);
                if (ccVarG != null) {
                    if (str.equals("FEmusic_immersive") && (ccVarG instanceof acnl)) {
                        avVar.l(ccVarG);
                    } else {
                        avVar.k(ccVarG);
                    }
                }
            }
        }
        cc ccVarG2 = this.d.g(this.c);
        if (ccVarG2 != null) {
            if (vxzVar.l(31, 45757116L, false) && (view = ccVarG2.getView()) != null) {
                view.getParent().bringChildToFront(view);
            }
            avVar.m(ccVarG2);
        }
        avVar.a(false, true);
        if (ccVarG2 == null && this.c != null) {
            agqr it = ((agqj) this.f).iterator();
            while (it.hasNext()) {
                aerj aerjVar = (aerj) it.next();
                if (this.c.equals("FEmusic_immersive")) {
                    ahfi ahfiVar = (ahfi) aerjVar.f;
                    Object obj = ahfiVar.b;
                    ahfiVar.b = null;
                    Object obj2 = ahfiVar.a;
                    ahfiVar.a = null;
                    Object obj3 = ahfiVar.c;
                    ahfiVar.c = null;
                    if (obj != null && obj2 != null && obj3 != null) {
                        agrx agrxVar = agso.a;
                        imb imbVarB = imb.b((Bundle) obj3);
                        imbVarB.setInitialSavedState((cb) obj);
                        imbVarB.bp = (acol) obj2;
                        av avVar2 = new av((dd) aerjVar.a);
                        avVar2.g(R.id.fragment_container, imbVarB, "FEmusic_immersive", 1);
                        avVar2.e();
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (this.c != null) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((hkt) it2.next()).d(this.c);
            }
        }
    }
}
