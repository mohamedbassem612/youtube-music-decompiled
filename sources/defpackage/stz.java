package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class stz implements svn {
    final /* synthetic */ ajwo a;
    final /* synthetic */ aldt b;
    public final /* synthetic */ sua c;

    public stz(sua suaVar, ajwo ajwoVar, aldt aldtVar) {
        this.a = ajwoVar;
        this.b = aldtVar;
        this.c = suaVar;
    }

    @Override // defpackage.svn
    public final void a(Throwable th) {
        sua suaVar = this.c;
        suaVar.b.i();
        suaVar.c.e(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.svn
    public final void b(byte[] bArr) {
        sua suaVar = this.c;
        suaVar.b.i();
        aihf aihfVarCreateBuilder = akai.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aome.a.createBuilder();
        aigj aigjVarV = aigj.v(bArr);
        aihfVarCreateBuilder2.copyOnWrite();
        aome aomeVar = (aome) aihfVarCreateBuilder2.instance;
        aigjVarV.getClass();
        aomeVar.b |= 1;
        aomeVar.c = aigjVarV;
        aihfVarCreateBuilder.copyOnWrite();
        akai akaiVar = (akai) aihfVarCreateBuilder.instance;
        aome aomeVar2 = (aome) aihfVarCreateBuilder2.build();
        aomeVar2.getClass();
        akaiVar.c = aomeVar2;
        akaiVar.b |= 1;
        akai akaiVar2 = (akai) aihfVarCreateBuilder.build();
        aigj aigjVar = this.a.c;
        aldt aldtVar = this.b;
        akal akalVar = aldtVar.c;
        if (akalVar == null) {
            akalVar = akal.a;
        }
        yhi yhiVar = new yhi(this, aldtVar, (byte[]) null);
        String str = akalVar.b;
        String str2 = akalVar.c;
        boolean z = akalVar.e;
        akak akakVar = akalVar.f;
        if (akakVar == null) {
            akakVar = akak.a;
        }
        xte xteVar = suaVar.d;
        boolean z2 = akakVar.b;
        if (!z) {
            bp bpVar = (bp) xteVar.f;
            bpVar.iR(false);
            bpVar.gT(((cf) xteVar.c).getSupportFragmentManager(), sud.k);
        }
        Object obj = yhiVar.a;
        akal akalVar2 = ((aldt) yhiVar.b).c;
        if (akalVar2 == null) {
            akalVar2 = akal.a;
        }
        ajwn ajwnVar = akalVar2.d;
        if (ajwnVar == null) {
            ajwnVar = ajwn.a;
        }
        nsh.g(((stz) obj).c.a, ajwnVar);
        aaqf aaqfVar = (aaqf) xteVar.a;
        wur wurVarC = aaqfVar.c(z2);
        wurVarC.b = str;
        wurVarC.n(aigjVar);
        wurVarC.c = str2;
        if (akaiVar2 != null) {
            wurVarC.d = Optional.of(akaiVar2);
        }
        ?? r9 = xteVar.d;
        taf.i(aaqfVar.d(wurVarC, r9), r9, new gou(xteVar, yhiVar, 16), new itt(xteVar, yhiVar, 11), null);
    }
}
