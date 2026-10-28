package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqo extends qa {
    boolean a;
    final /* synthetic */ atbv b;
    final /* synthetic */ orq c;
    final /* synthetic */ Object d;
    final /* synthetic */ oqu e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqo(oqu oquVar, atbv atbvVar, int i, orq orqVar, Object obj) {
        super((byte[]) null);
        this.b = atbvVar;
        this.f = i;
        this.c = orqVar;
        this.d = obj;
        this.e = oquVar;
        this.a = false;
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        atbv atbvVar = this.b;
        if (atbvVar.aT()) {
            this.c.d(atbvVar.aZ(), oqu.ah(recyclerView, this.e.ai(i, i2, this.f), this.d));
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1 || this.a) {
                return;
            }
            this.a = true;
            atbv atbvVar = this.b;
            if (atbvVar.aU()) {
                this.c.d(atbvVar.ba(), oqu.ah(recyclerView, this.e.ai(0, 0, this.f), this.d));
                return;
            }
            return;
        }
        if (this.a) {
            this.a = false;
            atbv atbvVar2 = this.b;
            if (atbvVar2.aV()) {
                this.c.d(atbvVar2.bb(), oqu.ah(recyclerView, this.e.ai(0, 0, this.f), this.d));
            }
            if (Memory.peekByte(FlagServices.b().c + 102) != 0) {
                this.e.aj(3);
            }
        }
    }
}
