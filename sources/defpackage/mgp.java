package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgp implements nwg {
    private final /* synthetic */ int $cid;
    public final Object a;

    public mgp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        int i = this.$cid;
        if (i == 0) {
            return asqz.b;
        }
        if (i == 1) {
            return asqy.b;
        }
        if (i == 2) {
            return aqde.b;
        }
        if (i != 3) {
            return i != 4 ? apxk.b : aklx.b;
        }
        return aklv.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [aunn, java.lang.Object] */
    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        avlb avlbVarN;
        int i = this.$cid;
        if (i == 0) {
            return avlb.n(new hmg(this, (asqz) obj, 8));
        }
        if (i == 1) {
            asqy asqyVar = (asqy) obj;
            return (asqyVar == null || (asqyVar.c & 1) == 0) ? avlb.m(new nud("Invalid StopDisplaySyncCommand.")) : avlb.n(new hmg(this, asqyVar, 7)).v(avmh.a());
        }
        if (i == 2) {
            return ((acyw) this.a.io()).a().c(avlb.h(new iug(this, 14)));
        }
        if (i == 3) {
            return avlb.n(new hoi(this, 12));
        }
        if (i == 4) {
            avlb avlbVarG = avlb.g(new avld() { // from class: ssh
                @Override // defpackage.avld
                public final void a(avpr avprVar) {
                    cc ccVarG;
                    final rxn rxnVar = new rxn(avprVar, 12);
                    final sru sruVar = (sru) this.a.a;
                    vxz vxzVar = sruVar.i;
                    if (vxzVar.l(11, 45720992L, false) && sruVar.b == null && (ccVarG = ((cf) sruVar.a).getSupportFragmentManager().g("composer_fragment")) != null && (ccVarG instanceof aevy)) {
                        sruVar.b = (aevy) ccVarG;
                    }
                    if (sruVar.b == null) {
                        rxnVar.run();
                        return;
                    }
                    if (!vxzVar.l(10, 45693223L, false)) {
                        sruVar.a();
                        rxnVar.run();
                        return;
                    }
                    aevy aevyVar = sruVar.b;
                    aevyVar.getClass();
                    if (!sru.c(aevyVar)) {
                        rxnVar.run();
                        return;
                    }
                    sruVar.b.iR(false);
                    Dialog dialog = sruVar.b.f;
                    dialog.getClass();
                    Window window = dialog.getWindow();
                    window.getClass();
                    View decorView = window.getDecorView();
                    if (Build.VERSION.SDK_INT >= 30) {
                        decorView.setWindowInsetsAnimationCallback(new srt(sruVar, rxnVar));
                    } else {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: srs
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                sruVar.a();
                                rxnVar.run();
                                return view.onApplyWindowInsets(windowInsets);
                            }
                        });
                    }
                    if (!tuk.t(decorView)) {
                        sruVar.a();
                        rxnVar.run();
                    } else {
                        InputMethodManager inputMethodManager = (InputMethodManager) sruVar.a.getSystemService("input_method");
                        inputMethodManager.getClass();
                        inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
                    }
                }
            });
            return Looper.myLooper() != Looper.getMainLooper() ? avlbVarG.v(avmh.a()) : avlbVarG;
        }
        apxk apxkVar = (apxk) obj;
        if ((apxkVar.c & 1) != 0) {
            avlbVarN = avlb.n(new mgd(this, apxkVar, nwfVar, 10, (short[]) null));
        } else {
            if (!apxkVar.i) {
                return avlb.e();
            }
            Object obj2 = this.a;
            obj2.getClass();
            avlbVarN = avlb.n(new hoi(obj2, 14));
        }
        return Looper.myLooper() != Looper.getMainLooper() ? avlbVarN.v(avmh.a()) : avlbVarN;
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        int i = this.$cid;
        if (i == 0) {
            return nrb.a(this, mewVar, nwfVar);
        }
        if (i == 1) {
            return nrb.a(this, mewVar, nwfVar);
        }
        if (i == 2) {
            return nrb.a(this, mewVar, nwfVar);
        }
        if (i != 3) {
            return i != 4 ? nrb.a(this, mewVar, nwfVar) : nrb.a(this, mewVar, nwfVar);
        }
        return nrb.a(this, mewVar, nwfVar);
    }
}
