package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbu extends sbk implements rsq {
    private final awmd a;
    private final sci b;
    private String c;

    public sbu(awmd awmdVar, sci sciVar) {
        this.a = awmdVar;
        this.b = sciVar;
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(slf.class);
    }

    @Override // defpackage.rsq
    public final void i(String str) {
        if (TextUtils.equals(str, this.c)) {
            ArrayList arrayList = new ArrayList();
            for (sni sniVar : this.g.aa()) {
                slf slfVar = (slf) sniVar.b;
                String str2 = slfVar.b;
                if (TextUtils.equals(str2, str) && (!slfVar.a || !this.b.a(str2))) {
                    arrayList.add(sniVar);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ((rsk) this.a.io()).q(arrayList);
        }
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        abob abobVar2 = abob.i;
        if (!abobVar.a(abob.f, abobVar2)) {
            this.c = "";
            return;
        }
        if (abobVar != abobVar2) {
            str = str2;
        }
        this.c = str;
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
