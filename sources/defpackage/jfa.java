package defpackage;

import android.view.View;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jfa implements avlw {
    public final View a;
    public final TextView b;
    private final List c;

    public jfa(View view, TextView textView, List list) {
        this.a = view;
        this.b = textView;
        this.c = list;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        ((agrc) ((agrc) ((agrc) jfb.a.b().i(agso.a, "MusicSortFilterBtnPrese")).j(th)).k("com/google/android/apps/youtube/music/ui/presenter/MusicSortFilterButtonPresenter$MultiSelectMenuItemSelectionObserver", "onError", (char) 360, "MusicSortFilterButtonPresenter.java")).t("Error updating entity");
    }

    @Override // defpackage.avlw
    public final /* synthetic */ void kk(Object obj) {
        weo weoVar = (weo) obj;
        weh wehVar = weoVar.c;
        if (wehVar != null && wehVar.getClass() == anop.class && ((anop) wehVar).getSelected().booleanValue()) {
            Optional optionalFindFirst = Collection.EL.stream(this.c).filter(new ibz(weoVar, 15)).findFirst();
            jfn jfnVar = new jfn(this, 1);
            if (true == optionalFindFirst.isPresent()) {
                Object obj2 = optionalFindFirst.get();
                Object obj3 = jfnVar.a;
                anrv anrvVar = (anrv) obj2;
                alay alayVar = anrvVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                jfa jfaVar = (jfa) obj3;
                TextView textView = jfaVar.b;
                tuk.u(textView, ackj.k(null, alayVar, null, false));
                View view = jfaVar.a;
                aiqe aiqeVar = anrvVar.i;
                if (aiqeVar == null) {
                    aiqeVar = aiqe.a;
                }
                jfb.g(view, aiqeVar, textView.getText().toString());
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
    }
}
