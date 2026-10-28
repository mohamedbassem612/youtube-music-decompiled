package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class scw implements acln {
    final Set a = new HashSet();
    final /* synthetic */ scx b;

    public scw(scx scxVar) {
        this.b = scxVar;
    }

    @Override // defpackage.acln
    public final void a(agkz agkzVar) {
        ArrayList arrayList = new ArrayList();
        scx scxVar = this.b;
        Iterator it = scxVar.d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED) {
                if (agkzVar.contains((aizsVar.b == 23 ? (apea) aizsVar.c : apea.a).b)) {
                    arrayList.add(aizsVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        scxVar.t(arrayList);
    }

    @Override // defpackage.acln
    public final void b(String str, boolean z, boolean z2) {
        this.a.add(str);
        ArrayList arrayList = new ArrayList();
        scx scxVar = this.b;
        Iterator it = scxVar.d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_ON_PAGE_ENTERED) {
                if (TextUtils.equals((aizsVar.b == 21 ? (aoir) aizsVar.c : aoir.a).c, str)) {
                    arrayList.add(aizsVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        scxVar.t(arrayList);
    }

    @Override // defpackage.acln
    public final void c(int i, String str) {
        apdn apdnVar;
        boolean zContains;
        this.a.remove(str);
        if (i == 0) {
            apdnVar = apdn.REEL_AD_TRANSITION_TYPE_USER;
        } else if (i == 1) {
            apdnVar = apdn.REEL_AD_TRANSITION_TYPE_AUTO;
        } else if (i != 2) {
            apdnVar = i != 3 ? apdn.REEL_AD_TRANSITION_TYPE_ABANDONED : apdn.REEL_AD_TRANSITION_TYPE_USER_INPUT_SUBMITTED;
        } else {
            apdnVar = apdn.REEL_AD_TRANSITION_TYPE_USER_REMOVED;
        }
        ArrayList arrayList = new ArrayList();
        scx scxVar = this.b;
        Iterator it = scxVar.d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_ON_PAGE_EXITED) {
                if (TextUtils.equals((aizsVar.b == 22 ? (aois) aizsVar.c : aois.b).d, str)) {
                    aois aoisVar = aizsVar.b == 22 ? (aois) aizsVar.c : aois.b;
                    if (!scxVar.a.m(1, 45842958L) || apdnVar == apdn.REEL_AD_TRANSITION_TYPE_UNSPECIFIED || aoisVar.e.size() <= 0) {
                        zContains = i == 0;
                    } else {
                        zContains = new aihx(aoisVar.e, aois.a).contains(apdnVar);
                    }
                    if (zContains) {
                        arrayList.add(aizsVar);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        scxVar.t(arrayList);
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ai() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aj() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ak() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void al() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void am() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void an() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ao() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ap() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void aq() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ar() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void as() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void at() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.acln
    public final /* synthetic */ void ah(int i, boolean z) {
    }
}
