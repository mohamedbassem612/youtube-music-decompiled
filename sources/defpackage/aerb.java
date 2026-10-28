package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerb {
    public final Context b;
    public final awmd c;
    public final awmd d;
    public boolean f;
    private final awmd g;
    public final Object a = new Object();
    public final Map e = new HashMap();

    public aerb(Context context, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.b = context;
        this.g = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
    }

    public final void a(aqii aqiiVar) {
        aihf aihfVarCreateBuilder = aqih.a.createBuilder();
        if (aqiiVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqih aqihVar = (aqih) aihfVarCreateBuilder.instance;
            aqihVar.c = aqiiVar.d;
            aqihVar.b |= 1;
        }
        b(aihfVarCreateBuilder, false, false);
    }

    public final void b(aihf aihfVar, boolean z, boolean z2) {
        if (z) {
            ((aeod) this.g.io()).a((aqih) aihfVar.build(), true);
            return;
        }
        synchronized (this.a) {
            for (aepp aeppVar : this.e.values()) {
                if (aeppVar.f()) {
                    aeppVar.d();
                    z2 |= aeppVar.g(this.b, aihfVar);
                }
            }
        }
        if (z2) {
            ((aeod) this.g.io()).a((aqih) aihfVar.build(), false);
        }
    }
}
