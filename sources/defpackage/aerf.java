package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aerf implements tbu {
    public final awmd a;
    public final awmd b;
    public final Context c;
    public volatile aere d;
    private final awmd e;
    private final awmd f;

    public aerf(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Context context) {
        this.a = awmdVar;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.b = awmdVar4;
        this.c = context;
    }

    @Override // defpackage.tbu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wjs wjsVar = (wjs) obj;
        if (c()) {
            ((Executor) this.f.io()).execute(new wdd(this, wjsVar, 20, (byte[]) null));
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean c() {
        aqil aqilVar = ((vxu) this.e.io()).c().q;
        if (aqilVar == null) {
            aqilVar = aqil.a;
        }
        return aqilVar.f;
    }
}
