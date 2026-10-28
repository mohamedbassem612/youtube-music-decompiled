package defpackage;

import android.view.View;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import java.util.concurrent.Callable;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addm implements nrw {
    public final nuc a;
    public final boolean b;
    public final vxz c;
    private final aczr d;
    private final vxz e;

    public addm(aczr aczrVar, vxz vxzVar, vxz vxzVar2, nuc nucVar, boolean z) {
        this.d = aczrVar;
        this.c = vxzVar;
        this.e = vxzVar2;
        this.a = nucVar;
        this.b = z;
    }

    private static boolean d() {
        try {
            aga agaVar = ElementsServices.a;
            return Memory.peekByte(FlagServices.b().c + 41) != 0;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return assn.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        assn assnVar = (assn) obj;
        final int iAV = a.aV(assnVar.c);
        if (iAV == 0) {
            iAV = 1;
        }
        if (iAV == 1) {
            return avlb.m(new IllegalArgumentException("Trigger type must be set"));
        }
        final View viewB = nrvVar.b();
        if (viewB == null) {
            return (this.e.l(519, 45843143L, false) || d()) ? avlb.e() : avlb.m(new IllegalArgumentException("Origin view cannot be null."));
        }
        final aczr aczrVar = this.d;
        final boolean z = assnVar.d;
        aczrVar.a();
        avlb avlbVarV = (aczrVar.b && !qpj.g()) ? avlb.h(new Callable() { // from class: aczp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aczrVar.b(viewB, iAV, z);
            }
        }).v(aczrVar.c) : aczrVar.b(viewB, iAV, z);
        return avlbVarV.k(new abqo(this, nrvVar, 5)).s();
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
