package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tda {
    public final List a = new ArrayList();
    final Activity b;
    boolean c;
    tda d;
    final /* synthetic */ tdc e;

    public tda(tdc tdcVar, Activity activity) {
        this.e = tdcVar;
        this.b = activity;
        tda tdaVar = (tda) tdcVar.c.peekLast();
        if (tdaVar != null) {
            tdaVar.d = this;
        }
        tdcVar.c.addLast(this);
    }
}
