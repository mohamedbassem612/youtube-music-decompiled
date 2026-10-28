package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aegy implements aegb {
    final /* synthetic */ aehg a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ String c;
    final /* synthetic */ arkm d;
    final /* synthetic */ aehd e;

    public aegy(aehd aehdVar, aehg aehgVar, AtomicReference atomicReference, String str, arkm arkmVar) {
        this.a = aehgVar;
        this.b = atomicReference;
        this.c = str;
        this.d = arkmVar;
        this.e = aehdVar;
    }

    @Override // defpackage.aegb
    public final void a(String str) {
        String str2;
        aehd aehdVar = this.e;
        String str3 = aehdVar.p;
        if (str3 != null && !str3.isEmpty()) {
            aehdVar.q.add(str3);
        }
        if (!this.d.x) {
            aehdVar.c();
        }
        if (aehdVar.v.m(4, 45774356L)) {
            str2 = str;
            aeho.m(aehdVar.w, 21, aehdVar.n, str2, aeho.f(str, aehdVar.r), aehdVar.o);
        } else {
            str2 = str;
        }
        aehi aehiVar = aehdVar.s;
        if (aehiVar != null) {
            aehiVar.h(str2);
        }
    }

    @Override // defpackage.aegb
    public final void b(String str) {
        aehd aehdVar = this.e;
        aehdVar.p = str;
        this.a.f = false;
        aehi aehiVar = aehdVar.s;
        if (aehiVar != null) {
            aehiVar.r();
        }
        LoadingFrameLayout loadingFrameLayout = aehdVar.j;
        if (loadingFrameLayout != null && !aehdVar.o) {
            loadingFrameLayout.c();
        }
        this.b.set(Boolean.valueOf(this.c.contains(str)));
    }

    @Override // defpackage.aegb
    public final void c() {
        aehi aehiVar = this.e.s;
        if (aehiVar != null) {
            aehiVar.l();
        }
    }

    @Override // defpackage.aegb
    public final void d() {
        aehd aehdVar = this.e;
        aehdVar.e();
        aehdVar.b.e(new Exception("Generic WebView Crashed"));
        aehi aehiVar = aehdVar.s;
        if (aehiVar != null) {
            aehiVar.m();
        }
    }

    @Override // defpackage.aegb
    public final void e() {
        arkm arkmVar = this.d;
        if (!arkmVar.x) {
            this.e.c();
        }
        aehd aehdVar = this.e;
        aehi aehiVar = aehdVar.s;
        if (aehiVar != null) {
            aehiVar.q();
        }
        AtomicReference atomicReference = this.b;
        if (((Boolean) atomicReference.get()).booleanValue()) {
            if ((arkmVar.b & SemanticState.Hidden) != 0) {
                ajwo ajwoVar = arkmVar.p;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aehdVar.h(ajwoVar);
            }
            atomicReference.set(Boolean.FALSE);
            aehdVar.o = true;
        }
    }
}
