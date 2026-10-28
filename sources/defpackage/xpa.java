package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xpa implements xzf {
    private final xvr a;
    private final vxe b;
    private final amyb c;
    private final ycp d;

    public xpa(xvr xvrVar, ycp ycpVar, vxe vxeVar, amyb amybVar) {
        this.a = xvrVar;
        this.d = ycpVar;
        this.b = vxeVar;
        this.c = amybVar;
    }

    @Override // defpackage.xzf
    public final void g(xzc xzcVar) {
        this.d.d(this);
    }

    @Override // defpackage.xzf
    public final void jv(xzc xzcVar) {
        xvr xvrVarJ = xzcVar.j();
        xvr xvrVar = this.a;
        if (!xvrVarJ.g(xvrVar)) {
            ((agrc) ((agrc) xpc.a.b().i(agso.a, "MdxConnectCommandResolver")).k("com/google/android/libraries/youtube/mdx/handoff/MdxConnectCommandResolver$MdxConnectSessionListener", "onMdxSessionConnected", 480, "MdxConnectCommandResolver.java")).B("Connected MdxSession is not connected to the MdxScreen we want to connect, session screen_id: %s, screen we want to connect screen_id: %s", xzcVar.j().b(), xvrVar.b());
            this.d.d(this);
            return;
        }
        agrx agrxVar = agso.a;
        amyb amybVar = this.c;
        if ((amybVar.c & 16) == 0) {
            this.d.d(this);
            return;
        }
        ajwo ajwoVar = amybVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.b.a(ajwoVar);
        this.d.d(this);
    }

    @Override // defpackage.xzf
    public final /* synthetic */ void h(xzc xzcVar) {
    }
}
