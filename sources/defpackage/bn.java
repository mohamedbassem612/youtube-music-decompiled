package defpackage;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bn implements boq {
    final /* synthetic */ bp a;

    public bn(bp bpVar) {
        this.a = bpVar;
    }

    @Override // defpackage.boq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((bog) obj) != null) {
            bp bpVar = this.a;
            if (bpVar.d) {
                View viewRequireView = bpVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (bpVar.f != null) {
                    if (dd.aa(3)) {
                        toString();
                        Objects.toString(bpVar.f);
                    }
                    bpVar.f.setContentView(viewRequireView);
                }
            }
        }
    }
}
