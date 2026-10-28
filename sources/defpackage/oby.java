package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oby implements obq {
    public final aunn a;
    public final aunn b;
    private final ExecutorService c;
    private final aunn d;
    private final awmd e;
    private final omj f;

    public oby(ExecutorService executorService, aunn aunnVar, aunn aunnVar2, omj omjVar, aunn aunnVar3, awmd awmdVar) {
        this.c = executorService;
        this.a = aunnVar;
        this.b = aunnVar2;
        this.f = omjVar;
        this.d = aunnVar3;
        this.e = awmdVar;
    }

    @Override // defpackage.obq
    public final ListenableFuture a(Context context) {
        oav oavVarIo = ((oau) this.e).io();
        oavVarIo.a = context;
        oavVarIo.c = this.f.o();
        oavVarIo.b((fxg) fxl.a.createBuilder());
        oavVarIo.d = obb.a;
        return oavVarIo.a().a().n();
    }

    @Override // defpackage.obq
    public final ListenableFuture b() {
        ahfo ahfoVar = new ahfo(new ebs(this, 9));
        this.c.execute(ahfoVar);
        return ahfoVar;
    }

    @Override // defpackage.obq
    public final String c() {
        return "1.975916745";
    }

    @Override // defpackage.obq
    public final ListenableFuture d(Context context, String str) {
        aunn aunnVar = this.d;
        Map mapN = this.f.n();
        ((rbm) aunnVar.io()).j(mapN);
        oav oavVarIo = ((oau) this.e).io();
        oavVarIo.a = context;
        oavVarIo.b = str;
        oavVarIo.c = mapN;
        oavVarIo.d = obb.c;
        oavVarIo.b((fxg) fxl.a.createBuilder());
        return oavVarIo.a().a().n();
    }
}
