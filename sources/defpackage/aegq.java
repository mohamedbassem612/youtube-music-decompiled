package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegq implements aegb {
    final /* synthetic */ LoadingFrameLayout a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ String c;
    final /* synthetic */ arkm d;
    final /* synthetic */ aegs e;

    public aegq(aegs aegsVar, LoadingFrameLayout loadingFrameLayout, AtomicReference atomicReference, String str, arkm arkmVar) {
        this.a = loadingFrameLayout;
        this.b = atomicReference;
        this.c = str;
        this.d = arkmVar;
        this.e = aegsVar;
    }

    @Override // defpackage.aegb
    public final void a(String str) {
        aegs aegsVar = this.e;
        String str2 = aegsVar.y;
        if (str2 != null && !str2.isEmpty()) {
            aegsVar.z.add(str2);
        }
        this.a.g(2);
    }

    @Override // defpackage.aegb
    public final void b(String str) {
        this.e.y = str;
        this.a.c();
        this.b.set(Boolean.valueOf(this.c.contains(str)));
    }

    @Override // defpackage.aegb
    public final void d() {
        aegs aegsVar = this.e;
        aegsVar.b(aegsVar.v, null, null);
        aegsVar.d.e(new Exception("Generic WebView Crashed"));
        agke agkeVarN = agke.n(aegsVar.i);
        int size = agkeVarN.size();
        for (int i = 0; i < size; i++) {
            ((aego) agkeVarN.get(i)).c();
        }
    }

    @Override // defpackage.aegb
    public final void e() {
        this.a.g(2);
        AtomicReference atomicReference = this.b;
        if (((Boolean) atomicReference.get()).booleanValue()) {
            arkm arkmVar = this.d;
            if ((arkmVar.b & SemanticState.Hidden) != 0) {
                aegs aegsVar = this.e;
                vxe vxeVar = aegsVar.B;
                ajwo ajwoVar = arkmVar.p;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                vxeVar.a(aeho.b(ajwoVar, aegsVar.r, aegsVar.s));
            }
            atomicReference.set(Boolean.FALSE);
            this.e.x = true;
        }
    }

    @Override // defpackage.aegb
    public final /* synthetic */ void c() {
    }
}
