package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iae implements aaqj {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final awmd g;

    public iae(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        awmdVar4.getClass();
        this.d = awmdVar4;
        awmdVar5.getClass();
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
    }

    @Override // defpackage.aaqj
    public final /* bridge */ /* synthetic */ aaqk a(String str, String str2) {
        Context context = (Context) this.a.io();
        context.getClass();
        hpk hpkVar = (hpk) this.b.io();
        hpkVar.getClass();
        hpd hpdVar = (hpd) this.c.io();
        hpdVar.getClass();
        hpy hpyVar = (hpy) this.d.io();
        hpyVar.getClass();
        kyr kyrVar = (kyr) this.e.io();
        kyrVar.getClass();
        Executor executor = (Executor) this.f.io();
        executor.getClass();
        hbf hbfVar = (hbf) this.g.io();
        hbfVar.getClass();
        str.getClass();
        str2.getClass();
        return new iad(context, hpkVar, hpdVar, hpyVar, kyrVar, executor, hbfVar);
    }
}
