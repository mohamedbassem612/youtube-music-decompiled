package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqs extends qa {
    public atbv a;
    public orq b;
    final /* synthetic */ oqu c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqs(oqu oquVar, atbv atbvVar) {
        super((byte[]) null);
        this.c = oquVar;
        this.d = false;
        this.a = atbvVar;
        this.b = oquVar.h().l();
        RecyclerView recyclerView = oquVar.a;
        if (recyclerView != null) {
            int i = recyclerView.F;
            this.d = i == 1 || i == 2;
        }
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        if (this.a.aT()) {
            oqu oquVar = this.c;
            this.b.d(this.a.aZ(), oquVar.ag(recyclerView, oquVar.ai(i, i2, this.a.bd())));
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1 || this.d) {
                return;
            }
            this.d = true;
            if (this.a.aU()) {
                oqu oquVar = this.c;
                this.b.d(this.a.ba(), oquVar.ag(recyclerView, oquVar.ai(0, 0, this.a.bd())));
                return;
            }
            return;
        }
        if (this.d) {
            this.d = false;
            if (this.a.aV()) {
                oqu oquVar2 = this.c;
                this.b.d(this.a.bb(), oquVar2.ag(recyclerView, oquVar2.ai(0, 0, this.a.bd())));
            }
            if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
                this.c.aj(3);
            }
        }
    }
}
