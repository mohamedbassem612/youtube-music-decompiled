package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class scv extends scr implements rsq {
    final Map a;
    private String b;
    private boolean e;

    public scv(awmd awmdVar, rmp rmpVar) {
        super(awmdVar);
        this.a = new ConcurrentHashMap();
    }

    @Override // defpackage.scr
    public final void a(aizs aizsVar, smr smrVar) throws sav {
        aixr aixrVarA = aixr.a(aizsVar.e);
        if (aixrVarA == null) {
            aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
        }
        if (aixrVarA != aixr.TRIGGER_TYPE_MEDIA_RESUMED) {
            throw new sav("Invalid trigger type for v2 PlayerStateEventTriggerAdapter.", 4);
        }
    }

    @Override // defpackage.scr
    protected final void ad(aizs aizsVar) {
        this.a.remove(aizsVar.d);
    }

    @Override // defpackage.rsq
    public final void o(int i, String str) {
        if (!TextUtils.equals(this.b, str)) {
            this.b = str;
            this.e = false;
        }
        if (i != 2 || str == null) {
            return;
        }
        if (!this.e) {
            this.e = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.at().iterator();
        while (it.hasNext()) {
            aizs aizsVar = ((snl) it.next()).b;
            aixr aixrVarA = aixr.a(aizsVar.e);
            if (aixrVarA == null) {
                aixrVarA = aixr.TRIGGER_TYPE_UNSPECIFIED;
            }
            if (aixrVarA == aixr.TRIGGER_TYPE_MEDIA_RESUMED && str.equals(this.a.get(aizsVar.d))) {
                arrayList.add(aizsVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t(arrayList);
    }

    @Override // defpackage.scr
    public final void v(int i, aizs aizsVar, smr smrVar, sgp sgpVar) {
        sda sdaVar = new sda(this, aizsVar, 1);
        Optional optional = sgpVar.c;
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = sdaVar.a;
            ((scv) obj2).a.put(((aizs) sdaVar.b).d, obj);
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
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
