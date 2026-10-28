package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upc implements sxu {
    final /* synthetic */ upd a;
    final /* synthetic */ Optional b;
    final /* synthetic */ uoi c;
    final /* synthetic */ uoj d;
    final /* synthetic */ boolean e;
    public final /* synthetic */ upg f;

    public upc(upg upgVar, upd updVar, Optional optional, uoi uoiVar, uoj uojVar, boolean z) {
        this.a = updVar;
        this.b = optional;
        this.c = uoiVar;
        this.d = uojVar;
        this.e = z;
        this.f = upgVar;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ListenableFuture listenableFutureN;
        byte[] bArr = (byte[]) obj2;
        final upd updVar = this.a;
        if (updVar.a.get()) {
            return;
        }
        final Optional optional = this.b;
        byte[] bArr2 = null;
        if (optional.isEmpty()) {
            upg upgVar = this.f;
            qcb qcbVar = new qcb(bArr, bArr2);
            upj upjVar = upgVar.c;
            listenableFutureN = upjVar.b.submit(afwl.j(new tsn(upjVar, qcbVar, 3)));
        } else {
            listenableFutureN = ahng.n(optional.get());
        }
        upg upgVar2 = this.f;
        ahdn ahdnVar = new ahdn(agke.p(new ListenableFuture[]{listenableFutureN, upgVar2.f.submit(afwl.j(new tsp(bArr, 7)))}), false);
        svm svmVar = new svm(this, updVar, 13, bArr2);
        final uoi uoiVar = this.c;
        final uoj uojVar = this.d;
        final boolean z = this.e;
        taf.k(upgVar2.a, ahdnVar, svmVar, new twi() { // from class: upb
            @Override // defpackage.twi
            public final void a(Object obj3) {
                List list = (List) obj3;
                Bitmap bitmap = null;
                File file = (list == null || list.get(0) == null) ? null : (File) list.get(0);
                if (list != null && list.get(1) != null) {
                    bitmap = (Bitmap) list.get(1);
                }
                Bitmap bitmap2 = bitmap;
                upd updVar2 = updVar;
                upc upcVar = this.a;
                if ((updVar2.a.get() || file == null || bitmap2 == null) && file != null) {
                    upcVar.f.f.submit(afwl.i(new ull(file, 7)));
                }
                boolean z2 = z;
                uoj uojVar2 = uojVar;
                uoi uoiVar2 = uoiVar;
                Optional optional2 = optional;
                upcVar.f.e.execute(afwl.i(new upa(upcVar, updVar2, file, bitmap2, optional2, uoiVar2, uojVar2, z2, 0)));
            }
        });
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.a.a.get()) {
            return;
        }
        upg upgVar = this.f;
        upgVar.e.execute(afwl.i(new ull(this, 6)));
    }
}
