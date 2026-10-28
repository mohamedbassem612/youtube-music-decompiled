package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jt extends mg {
    final /* synthetic */ ju a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(ju juVar, View view) {
        super(view);
        this.a = juVar;
    }

    @Override // defpackage.mg
    public final jf a() {
        jv jvVar = this.a.a.i;
        if (jvVar == null) {
            return null;
        }
        return jvVar.a();
    }

    @Override // defpackage.mg
    public final boolean b() {
        this.a.a.m();
        return true;
    }

    @Override // defpackage.mg
    public final boolean c() {
        jx jxVar = this.a.a;
        if (jxVar.l != null) {
            return false;
        }
        jxVar.k();
        return true;
    }
}
