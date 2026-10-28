package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aajk {
    public final Executor a;
    public final aajv b;
    public final aajt c;
    public final isi d;
    public final grj e;
    public final grj f;

    public aajk(aajt aajtVar, grj grjVar, Executor executor, grj grjVar2, isi isiVar, aajv aajvVar) {
        this.c = aajtVar;
        this.f = grjVar;
        this.a = executor;
        this.e = grjVar2;
        this.d = isiVar;
        this.b = aajvVar;
    }

    public static akne d(String str) {
        aihf aihfVarCreateBuilder = akne.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akne akneVar = (akne) aihfVarCreateBuilder.instance;
        str.getClass();
        akneVar.b = 2;
        akneVar.c = str;
        return (akne) aihfVarCreateBuilder.build();
    }

    public static akne e(String str) {
        aihf aihfVarCreateBuilder = akne.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akne akneVar = (akne) aihfVarCreateBuilder.instance;
        str.getClass();
        akneVar.b = 1;
        akneVar.c = str;
        return (akne) aihfVarCreateBuilder.build();
    }

    public static final void f(ug ugVar) {
        taf.g(ugVar.d(), new uqk(7));
    }

    public abstract ListenableFuture a();

    protected abstract ListenableFuture b();

    protected abstract ListenableFuture c(List list);
}
