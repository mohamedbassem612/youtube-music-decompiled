package defpackage;

import app.rive.RiveFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpf extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    long g;
    int h;
    final /* synthetic */ adpi i;
    final /* synthetic */ String j;
    final /* synthetic */ RiveFile k;
    final /* synthetic */ long l;
    final /* synthetic */ adpl m;
    private /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpf(adpi adpiVar, String str, RiveFile riveFile, long j, adpl adplVar, awoq awoqVar) {
        super(2, awoqVar);
        this.i = adpiVar;
        this.j = str;
        this.k = riveFile;
        this.l = j;
        this.m = adplVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        adpf adpfVar = new adpf(this.i, this.j, this.k, this.l, this.m, awoqVar);
        adpfVar.n = obj;
        return adpfVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adpf) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.awpe
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
