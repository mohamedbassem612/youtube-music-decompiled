package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rqq implements rpq, rpr, rps, rpt {
    public final Activity a;
    public final rre b;
    public boolean c;
    public tnh d;
    public final rqt e;
    public rjz f;
    public final sdo g;
    public final qcb h;
    private final rlw i;
    private final rqh j;
    private final ajwo k;
    private final zwb l;
    private final vxe m;
    private final xeu n;
    private final rqa o;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zwb] */
    public rqq(rlr rlrVar, Activity activity, rre rreVar, wnw wnwVar, rlw rlwVar, rqa rqaVar, zwb zwbVar, rqh rqhVar, qcb qcbVar, xsc xscVar, ajwo ajwoVar, vxe vxeVar, boolean z, xeu xeuVar) {
        this(rlrVar, activity, rreVar, wnwVar, rlwVar, zwbVar, rqaVar, qcbVar, rqhVar, ajwoVar, vxeVar, z, xeuVar);
        ArrayList arrayList = new ArrayList();
        ?? r0 = xscVar.a;
        zwa zwaVarE = r0.e();
        if ((!(zwaVarE instanceof rlt) || !((rlt) zwaVarE).f()) && r0.u()) {
            Optional optional = (Optional) xscVar.b;
            optional.isPresent();
            View viewInflate = LayoutInflater.from((Context) xscVar.c).inflate(true != ((Boolean) Optional.ofNullable(Boolean.valueOf(((vxz) optional.get()).m(56, 45750297L))).orElse(Boolean.FALSE)).booleanValue() ? R.layout.fusion_manage_account_footer_old : R.layout.fusion_manage_account_footer, (ViewGroup) null);
            viewInflate.setOnClickListener(new jjc(xscVar, 19));
            arrayList.add(viewInflate);
        }
        if (!arrayList.isEmpty()) {
            rlrVar.f(true);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rlrVar.b.addView((View) it.next());
        }
    }

    public final void a() {
        this.f.a();
        if (this.c) {
            this.c = false;
            this.j.k(new rqg(rqf.c, false));
        }
    }

    public final void b() {
        this.f.a();
    }

    public final void c() {
        rqt rqtVar = this.e;
        rqtVar.m();
        rqtVar.e();
        zwb zwbVar = this.l;
        rlt rltVar = zwbVar.u() ? (rlt) zwbVar.e() : null;
        this.f.a();
        rqo rqoVar = new rqo(this, 0);
        this.d = rqoVar;
        this.i.a(rltVar, rqoVar);
    }

    public final void d() {
        if (!this.c) {
            this.c = true;
            this.j.k(new rqg(rqf.a, false));
        }
        c();
    }

    @Override // defpackage.rps
    public final void h() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        if (r1.j.n(r2.d) != false) goto L61;
     */
    @Override // defpackage.rpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.wnq r6) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqq.i(wnq):void");
    }

    @Override // defpackage.rpr
    public final void j(wnr wnrVar) {
        Intent intent = wnrVar.a;
        if (intent != null) {
            this.a.startActivity(intent);
        } else {
            c();
        }
    }

    @Override // defpackage.rpt
    public final void k() {
        throw null;
    }

    public rqq(rqt rqtVar, Activity activity, rre rreVar, wnw wnwVar, rlw rlwVar, zwb zwbVar, rqa rqaVar, qcb qcbVar, rqh rqhVar, ajwo ajwoVar, vxe vxeVar, boolean z, xeu xeuVar) {
        this.e = rqtVar;
        this.a = activity;
        this.b = rreVar;
        this.i = rlwVar;
        this.l = zwbVar;
        this.o = rqaVar;
        this.g = new sdo(rqaVar, wnwVar, zwbVar, ajwoVar);
        this.h = qcbVar;
        this.j = rqhVar;
        this.k = ajwoVar;
        this.m = vxeVar;
        this.c = z;
        this.n = xeuVar;
        this.f = qcbVar.y(new rqm(), new HashMap());
    }
}
