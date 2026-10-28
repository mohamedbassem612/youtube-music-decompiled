package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.videoeffects.fragment.StickerCatalogRecyclerView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vhk extends vgr {
    public vhg a;
    public boolean b;
    public StickerCatalogRecyclerView c;
    public vxz e;
    public int d = 1;
    private List f = new ArrayList();

    public final void c(int i) {
        this.c.ae.b(i);
        vhg vhgVar = this.a;
        ahno.F(i > 0);
        vhgVar.r = i;
        vhgVar.n.a = i - 1;
    }

    public final void d(List list) {
        if (this.d == 3) {
            this.f = this.e.e(0, 45375241L).b;
            vhg vhgVar = this.a;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apji apjiVar = (apji) it.next();
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aqct.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    Iterator it2 = yno.fk(apjiVar).iterator();
                    do {
                        if (!it2.hasNext()) {
                            Optional optionalFj = yno.fj(apjiVar);
                            if (!optionalFj.isPresent() || !ahno.ae(((Uri) optionalFj.get()).toString()).endsWith(".webp")) {
                                arrayList.add(apjiVar);
                                break;
                            }
                            break;
                        }
                    } while (!ahno.ae((String) it2.next()).endsWith(".webp"));
                } else {
                    aihl aihlVar = aqct.b;
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                    apjiVar.c(aihlVarCheckIsLite2);
                    if (apjiVar.j.n(aihlVarCheckIsLite2.d)) {
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite3);
                        Object objK = apjiVar.j.k(aihlVarCheckIsLite3.d);
                        int i = ((aqcr) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK))).c;
                        int iBi = a.bi(i);
                        if (iBi == 0 || iBi != 4) {
                            List list2 = this.f;
                            int iBi2 = a.bi(i);
                            if (iBi2 == 0) {
                                iBi2 = 1;
                            }
                            if (list2.contains(Integer.valueOf(iBi2 - 1))) {
                            }
                        }
                        arrayList.add(apjiVar);
                        break;
                        break;
                    }
                }
            }
            vhgVar.D(arrayList);
        } else {
            this.a.D(list);
        }
        this.a.jW();
        this.b = true;
    }

    public final void e() {
        this.c.aj(0);
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sticker_page_fragment, viewGroup, false);
        StickerCatalogRecyclerView stickerCatalogRecyclerView = (StickerCatalogRecyclerView) viewInflate.findViewById(R.id.sticker_page);
        this.c = stickerCatalogRecyclerView;
        stickerCatalogRecyclerView.ad(this.a);
        this.a.o = this;
        return viewInflate;
    }

    @Override // defpackage.cc
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m668x22bc4f96(Bundle bundle) {
        this.a.e.removeCallbacksAndMessages(vhg.a);
    }
}
