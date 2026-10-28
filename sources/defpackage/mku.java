package defpackage;

import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mku {
    public final mkr a;
    public float b = 1.0f;

    public mku(mkr mkrVar) {
        this.a = mkrVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nru] */
    public final void a() {
        this.b = 1.0f;
        mkr mkrVar = this.a;
        View view = (View) mkrVar.a.get();
        List<aclc> list = mkrVar.m;
        if (list == null || view == null) {
            return;
        }
        for (aclc aclcVar : list) {
            mpo mpoVar = (mpo) aclcVar.e;
            nry nryVar = mpoVar.b;
            CommandOuterClass$Command commandOuterClass$CommandX = ((omj) aclcVar.c).x();
            ?? r5 = aclcVar.d;
            ?? r6 = aclcVar.a;
            nsl nslVar = (nsl) aclcVar.b;
            mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view, null, 9, null, null, r5, r6, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
        }
    }
}
