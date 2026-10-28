package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drq implements drx {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public drq(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.drx
    public final void b(dsa dsaVar) {
        throw null;
    }

    @Override // defpackage.drx
    public final /* synthetic */ void e(dsa dsaVar) {
        dsaVar.F(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.drx
    public final void f() {
        throw null;
    }

    @Override // defpackage.drx
    public final /* synthetic */ void g(dsa dsaVar) {
        dsaVar.F(this);
        dsaVar.D(this);
    }

    @Override // defpackage.drx
    public final void c() {
    }

    @Override // defpackage.drx
    public final void d() {
    }

    @Override // defpackage.drx
    public final void a(dsa dsaVar) {
    }
}
