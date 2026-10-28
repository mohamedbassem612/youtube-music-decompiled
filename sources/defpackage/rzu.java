package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzu implements rsq {
    public skh b;
    public final awmd c;
    public final awmd d;
    public final vyo e;
    public final mbc f;
    public final rmp j;
    private abob k;
    public long g = 0;
    public String h = "";
    public final List i = new ArrayList();
    public String a = "";

    public rzu(awmd awmdVar, awmd awmdVar2, rmp rmpVar, vyo vyoVar, mbc mbcVar) {
        this.c = awmdVar;
        this.d = awmdVar2;
        this.j = rmpVar;
        this.e = vyoVar;
        this.f = mbcVar;
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
        if (!TextUtils.equals(str, this.a)) {
            this.g = 0L;
        }
        this.a = str;
        this.b = skh.a(str, wjfVar);
        this.k = abobVar;
        if (abobVar == abob.a) {
            this.i.clear();
            this.h = "";
        }
    }

    @Override // defpackage.rsq
    public final void m(String str, long j, long j2, long j3, boolean z) {
        if (this.k == abob.i) {
            List list = this.i;
            if (list.isEmpty() || !TextUtils.equals(this.a, str)) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            arrayList.addAll(list);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                adz adzVar = (adz) arrayList.get(i);
                if (adzVar.a) {
                    if (!((snh) adzVar.c).a(j)) {
                        list.remove(adzVar);
                        ((roq) this.d.io()).f(13, this.b, new rzt(adzVar, 0));
                    }
                } else if (((snh) adzVar.c).a(j)) {
                    adzVar.a = true;
                }
            }
        }
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
    public final /* synthetic */ void i(String str) {
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
}
