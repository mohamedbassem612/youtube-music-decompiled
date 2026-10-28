package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class icb extends icc {
    final /* synthetic */ icj a;
    private final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icb(icj icjVar, boolean z) {
        super(icjVar, Optional.empty());
        this.a = icjVar;
        this.d = z;
    }

    @Override // defpackage.icc, defpackage.aheh
    public final void a(Throwable th) {
        ((agrc) ((agrc) ((agrc) icj.a.b()).j(th)).k("com/google/android/apps/youtube/music/player/queue/MusicPlaybackQueue$AutomixExpanderListener", "onFailure", (char) 1941, "MusicPlaybackQueue.java")).t("AutomixExpansions error");
        super.a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.icc
    public final void c(wgi wgiVar, aouj aoujVar, aae aaeVar) {
        icj icjVar = this.a;
        icjVar.n = true;
        icjVar.D.k(wgiVar);
        ajwo ajwoVar = wgiVar.d;
        boolean z = ajwoVar != null && gzj.U(ajwoVar);
        amae amaeVar = wgiVar.a;
        icjVar.z(hna.D(fhz.ah(amaeVar)), z);
        Optional optionalE = hna.E(fhz.ah(amaeVar));
        if (optionalE.isPresent()) {
            icjVar.y = optionalE;
        }
        icjVar.hi(1, 0, icjVar.hc(1));
        icjVar.p = this.d;
        icjVar.r(1, 0, aaeVar.c);
        icjVar.A(aoujVar, acjw.h);
    }
}
