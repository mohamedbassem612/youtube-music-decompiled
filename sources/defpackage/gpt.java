package defpackage;

import android.view.View;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gpt implements aeem {
    final /* synthetic */ Supplier a;
    final /* synthetic */ aefl b;
    final /* synthetic */ aefl c;
    final /* synthetic */ aczl d;

    public gpt(aczl aczlVar, aefl aeflVar, Supplier supplier, aefl aeflVar2) {
        this.b = aeflVar;
        this.a = supplier;
        this.c = aeflVar2;
        this.d = aczlVar;
    }

    @Override // defpackage.aeem
    public final /* synthetic */ void a(Object obj, int i) {
        if (((aefl) obj) != this.b) {
            this.d.G();
            return;
        }
        View view = (View) this.a.get();
        if (view != null) {
            aczl aczlVar = this.d;
            aefk aefkVar = new aefk(this.c);
            aefkVar.a = view;
            ((aefv) aczlVar.b).c(aefkVar.c());
        }
    }

    @Override // defpackage.aeem
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
