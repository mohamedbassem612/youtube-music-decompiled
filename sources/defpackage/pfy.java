package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pfy extends awpk implements awqk {
    final /* synthetic */ pfz a;
    final /* synthetic */ File b;
    final /* synthetic */ boolean c;
    final /* synthetic */ File d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfy(pfz pfzVar, File file, boolean z, File file2, awoq awoqVar) {
        super(2, awoqVar);
        this.a = pfzVar;
        this.b = file;
        this.c = z;
        this.d = file2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pfy(this.a, this.b, this.c, this.d, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pfy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        pfz pfzVar = this.a;
        File file = this.b;
        pfzVar.b(file, this.c);
        if (!file.exists()) {
            pfzVar.c(this.d);
        }
        return awmy.a;
    }
}
